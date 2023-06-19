package com.moviebs.util;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import com.moviebs.dto.AdminDTO;
import com.moviebs.model.Admin;


@Component
public class AdminConverter {

	//convert to movie entity through moviedto 
		public Admin convertToAdminEntity(AdminDTO adminDTO)
		{
			Admin admin= new Admin();
			if(adminDTO!=null)
			{
				
				//copies the properties of source object to target object with same property
				BeanUtils.copyProperties(adminDTO, admin);
			}
			return admin;
		}
		
		//convert to moviedto through movie
		public AdminDTO convertToAdminDTO(Admin admin)
		{
			AdminDTO adminDTO= new AdminDTO();
			if(admin!=null)
			{
				
				//copies the properties of source object to target object with same property
				BeanUtils.copyProperties(admin, adminDTO);
			}
			return adminDTO;
		}
}
