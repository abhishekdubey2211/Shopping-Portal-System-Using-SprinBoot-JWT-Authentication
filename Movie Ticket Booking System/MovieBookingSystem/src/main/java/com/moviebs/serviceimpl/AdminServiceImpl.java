package com.moviebs.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.moviebs.dto.AdminDTO;
import com.moviebs.model.Admin;
import com.moviebs.repos.AdminRepository;
import com.moviebs.service.AdminService;
import com.moviebs.util.AdminConverter;

@Service
public class AdminServiceImpl implements AdminService {

	@Autowired
	AdminRepository adminRepository;
	
	@Autowired
	AdminConverter converter;
	
	@Override
	public AdminDTO saveAdmin(Admin admin) {
		adminRepository.save(admin);
		return converter.convertToAdminDTO(admin);
	}

	@Override
	public Admin login(String userName, String password) {
		return adminRepository.findByUserNameAndPassword(userName, password);
	}

}
