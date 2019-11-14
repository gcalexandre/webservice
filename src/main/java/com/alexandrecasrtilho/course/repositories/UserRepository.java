package com.alexandrecasrtilho.course.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import com.alexandrecasrtilho.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

	

}
