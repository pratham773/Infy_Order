package com.capstone.infyorders.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capstone.infyorders.dto.InfyOrdersDTO;
import com.capstone.infyorders.entity.InfyOrders;
import com.capstone.infyorders.repository.InfyOrdersRepository;

@Service("infyOrdersService")
public class InfyOrdersServiceImpl implements InfyOrdersService {

	@Autowired
	private InfyOrdersRepository repository;
	
	@Override
	public void insertOrder(InfyOrdersDTO order) {
		
		repository.saveAndFlush(InfyOrdersDTO.prepareInfyOrderEntity(order));
	}

	@Override
	public String OrderStatus(Long orderId) {
		
		Optional<InfyOrders> optionalOrders = repository.findById(orderId);
		InfyOrders orderEntity = optionalOrders.get();
		InfyOrdersDTO ordersDTO = InfyOrders.prepareInfyOrdersDTO(orderEntity);
		return ordersDTO.getOrderStatus();
	}

	
}
