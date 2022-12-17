package com.example.solo_project.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.solo_project.model.Orders;
import com.example.solo_project.repository.OrdersRepository;
import com.example.solo_project.service.OrdersService;

@Service
public class OrdersServiceImpl implements OrdersService{
	
	@Autowired
	OrdersRepository ordersRepository;
	
	@Override
	public List<Orders> findAll() {
		// TODO Auto-generated method stub
		return ordersRepository.findAll();
	}

	@Override
	public String regOrders(Orders req) {
		// TODO Auto-generated method stub
		String result = "Failed to register Orders Data!";
		if (req != null) {
			ordersRepository.save(req);
			result = "Success to register Orders Data!";
		}
		return result;
		
	}

	@Override
	public String updOrders(Orders req) {
		// TODO Auto-generated method stub
		String result = "Failed to update Orders Data!";
		
		Optional<Orders> optOrders = ordersRepository.findById(req.getoId());
				if(optOrders.isPresent()) {
					ordersRepository.save(req);
					result = "Success to update Orders Data!";
				}
		return result;
	}

	@Override
	public String delOrders(String id) {
		// TODO Auto-generated method stub
		String result = "Failed to delete Orders Data!";
		
		Optional<Orders> optOrders = ordersRepository.findById(id);
		if (optOrders.isPresent()) {
			ordersRepository.deleteById(id);
			result = "Success to delete Orders Data!";
		}
		return result;
		
	}
	

}
