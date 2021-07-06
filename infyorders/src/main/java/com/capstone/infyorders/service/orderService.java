package com.capstone.infyorders.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.capstone.infyorders.entity.orderEntity;
import com.capstone.infyorders.repository.orderRepository;

@Service
public class orderService {
	
	@Autowired
	orderRepository repository;
	
	@Autowired
	private RestTemplate restTemplate;

	public List<orderEntity> getorder() {
		return (List<orderEntity>) repository.findAll();
	}



}
