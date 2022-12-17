package com.example.solo_project.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.solo_project.model.Orders;
import com.example.solo_project.service.OrdersService;

@RestController
@RequestMapping("api/solo_project/orders")
public class OrdersController {
	
	@Autowired
	OrdersService ordersService;
	
	@GetMapping
	public List<Orders> findAll(){
		
		return ordersService.findAll();
		
	}
	
	@PostMapping //("localhost:8092/api/solo_project/Orders/path") kalau mau spesific
	public String regOrders(@RequestBody Orders req) {
		
		return ordersService.regOrders(req);
	}
	
	@PutMapping
	public String updOrders(@RequestBody Orders req) {
		
		return ordersService.updOrders(req);
	}
	
	@DeleteMapping("{oId}")
	public String delOrders(@PathVariable String oId) {
		
		return ordersService.delOrders(oId);
	}
}
