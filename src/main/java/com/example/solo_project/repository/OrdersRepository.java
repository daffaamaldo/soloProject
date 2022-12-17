package com.example.solo_project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.solo_project.model.Orders;

public interface OrdersRepository extends JpaRepository<Orders, String>{

}
