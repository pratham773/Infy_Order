package com.capstone.infyorders.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capstone.infyorders.dto.InfyOrdersDTO;
import com.capstone.infyorders.service.InfyOrdersService;

@RestController("/orders")
public class InfyOrdersController {

	@Autowired
	private InfyOrdersService orderService;
	
	@GetMapping()
	public String greetme()
	{
		return "ssup";
	}
	
	@PostMapping()
	public void AddOrder(@RequestBody InfyOrdersDTO orderDTO)
	{
		orderService.insertOrder(orderDTO);
	}
	
	@PostMapping(value="/{orderId}",consumes="application/json")
	public String CancelOrder(@PathVariable("orderId") Long orderId)
	{
		String status = orderService.OrderStatus(orderId);
		if(status.equals("open"))
			return "refund has been initiated to your accout number";
		return "refund cannot be initiated";
	}
}
