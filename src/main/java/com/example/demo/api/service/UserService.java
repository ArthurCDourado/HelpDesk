package com.example.demo.api.service;

import org.springframework.data.domain.Page;

import com.example.demo.api.entity.User;

public interface UserService {

	User findByEmail(String email);
	
	User createOrUpdate(User user);
	
	User findOne(String id);
	
	void delete(String id);
	
	Page<User> findAll(int page, int count);
	
	
}
