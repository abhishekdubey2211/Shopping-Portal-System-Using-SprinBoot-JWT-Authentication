package com.moviebs.repos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.moviebs.model.*;

//indicates that the interface is a repository component in the spring framework
@Repository

//inherits a set of CRUD operations
public interface TicketRepository extends JpaRepository<Ticket, Integer>
{

}
