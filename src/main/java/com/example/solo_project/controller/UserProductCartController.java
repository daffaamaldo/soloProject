package com.example.solo_project.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.solo_project.dto.cartDto;
import com.example.solo_project.model.UserProductCart;
import com.example.solo_project.service.UserProductCartService;

@CrossOrigin
@RestController
@RequestMapping("api/solo_project/userProductCart")
public class UserProductCartController {
	
	@Autowired
	UserProductCartService userProductCartService;
	
	@GetMapping
	public List<UserProductCart> findAll(){
		
		return userProductCartService.findAll();
		
	}
	
	@PostMapping("cart/user/{userId}")
	public List<cartDto> getAllCartByDto(@PathVariable String userId){
		return userProductCartService.getAllCartByDto(userId);
	}
	
	@PostMapping("cart/{cart}")
	public List<cartDto> getCartDtoByUpcId(@PathVariable String cart){
		return userProductCartService.getCartDtoByUpcId(cart);
	}
	
	@PostMapping
	public String regUserProductCart(@RequestBody UserProductCart req) {
		
		return userProductCartService.regUserProductCart(req);
	}
	
	@PutMapping
	public String updUserProductCart(@RequestBody UserProductCart req) {
		
		return userProductCartService.updUserProductCart(req);
	}
	
	@DeleteMapping("{upcId}")
	public String delUserProductCart(@PathVariable String upcId) {
		
		return userProductCartService.delUserProductCart(upcId);
	}
}
