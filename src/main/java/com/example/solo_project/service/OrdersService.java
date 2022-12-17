package com.example.solo_project.service;

import java.util.List;

import com.example.solo_project.model.Orders;

public interface OrdersService {

	public List<Orders> findAll();
	
	public String regOrders(Orders req) ;

	public String updOrders(Orders req);
	
	public String delOrders(String id);
	
}
