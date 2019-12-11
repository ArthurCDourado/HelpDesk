package com.example.demo.api.service;

import java.util.Optional;

import com.example.demo.api.entity.User;

public interface UserService {

	User findByEmail(String email);
	
	User createOrUpdate(User user);
	
	Optional<User> findById(String id);
	
	void delete(String id);
	
//	Page<User> findAll(int page, int count);
	
	
}
