package com.nath.registration.validation.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.nath.registration.validation.entity.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long>{
	
	List<User> findByName(String name); 
	
	
	
}
