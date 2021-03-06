package com.example.demo.api.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.example.demo.api.entity.User;
import com.example.demo.api.repository.UserRepository;
import com.example.demo.api.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public User findByEmail(String email) {
		return this.userRepository.findByEmail(email);
	}

	@Override
	public User createOrUpdate(User user) {
		return this.userRepository.save(user);
	}
	
	//Utilização de findOne. Verificar se há erro após build
	@Override
	public User findOne(String id) {
		return this.userRepository.findOne(id);
	}

	@Override
	public void delete(String id) {
		this.userRepository.deleteById(id);
	}
	
	@Override
	public Page<User> findAll(int page, int count) {
		Pageable pages = new PageRequest(page, count);
		return this.userRepository.findAll(pages);
	}

}
