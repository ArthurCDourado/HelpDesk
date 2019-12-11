package com.example.demo.api.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.api.entity.ChangeStatus;

public interface ChangeStatusRepository extends MongoRepository<ChangeStatus, String>{
	
	Iterable<ChangeStatus> findByTicketIdOrderByDateChangeStatusDesc(String ticketId);

}
