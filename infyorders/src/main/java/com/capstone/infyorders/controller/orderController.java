package com.capstone.infyorders.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capstone.infyorders.entity.orderEntity;
import com.capstone.infyorders.service.orderService;

@RestController
@RequestMapping("/order")
public class orderController {
	
	@Autowired
	orderService service;
	
	@GetMapping("/allOrder")
	public ResponseEntity<List<orderEntity>> getAllorder(){
		return new ResponseEntity<List<orderEntity>>(service.getorder(),HttpStatus.OK);
		
	}

}
