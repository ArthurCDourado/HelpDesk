package com.example.demo.api.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.api.entity.User;

public interface UserRepository extends MongoRepository<User, String>{
	
	User findByEmail(String email);

}
