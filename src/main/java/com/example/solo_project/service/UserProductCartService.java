package com.example.solo_project.service;

import java.util.List;

import com.example.solo_project.dto.cartDto;
import com.example.solo_project.model.UserProductCart;

public interface UserProductCartService {

	public List<UserProductCart> findAll();
	
	public String regUserProductCart(UserProductCart req) ;

	public String updUserProductCart(UserProductCart req);
	
	public String delUserProductCart(String id);
	
	public List<cartDto> getCartDtoByUpcId(String cart);
	
	public List<cartDto> getAllCartByDto(String userId);
	
}
