package com.capstone.infyorders.service;

import com.capstone.infyorders.dto.InfyOrdersDTO;

public interface InfyOrdersService {

	public void insertOrder(InfyOrdersDTO order);
	public String OrderStatus(Long orderId);
 
}
