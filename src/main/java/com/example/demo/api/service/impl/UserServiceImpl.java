package com.example.demo.api.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
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
	
	//Utilização de optional como retorno. Verificar se há erro após build
	@Override
	public Optional<User> findById(String id) {
		return this.userRepository.findById(id);
	}

	@Override
	public void delete(String id) {
		this.userRepository.deleteById(id);
	}
	
	//método utilizado no curso não foi encontrado. Verificar solução.
	
//	@Override
//	public Page<User> findAll(int page, int count) {
//		Pageable pages = new PageRequest(page, count);
//		return this.repository.findAll(pages);
//	}

}
