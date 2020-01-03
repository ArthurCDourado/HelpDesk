package com.example.demo.api.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.api.entity.User;

public interface UserRepository extends MongoRepository<User, String>{
	
	User findByEmail(String email);
	
	Optional<User> findById(String id);
	
	void deleteById(String id);

}
