package com.example.solo_project.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.solo_project.dto.cartDto;
import com.example.solo_project.model.Product;
import com.example.solo_project.model.UserProductCart;
import com.example.solo_project.model.UserTable;
import com.example.solo_project.repository.ProductRepository;
import com.example.solo_project.repository.UserAddressRepository;
import com.example.solo_project.repository.UserProductCartRepository;
import com.example.solo_project.repository.UserTableRepository;
import com.example.solo_project.service.UserProductCartService;

@Service
public class UserProductCartServiceImpl implements UserProductCartService{
	
	@Autowired
	UserProductCartRepository userProductCartRepository;
	
	@Autowired
	UserTableRepository userTableRepository;
	
	@Autowired
	UserAddressRepository userAddressRepository;
	
	@Autowired
	ProductRepository productRepository;
	
	@Override
	public List<UserProductCart> findAll() {
		// TODO Auto-generated method stub
		return userProductCartRepository.findAll();
	}

	@Override
	public String regUserProductCart(UserProductCart req) {
		// TODO Auto-generated method stub
		String result = "Failed to register User Product Cart Data!";
		if (req != null) {
			userProductCartRepository.save(req);
			result = "Success to register User Product Cart Data!";
		}
		return result;
		
	}

	@Override
	public String updUserProductCart(UserProductCart req) {
		// TODO Auto-generated method stub
		String result = "Failed to update User Product Cart Data!";
		
		Optional<UserProductCart> optUserProductCart = userProductCartRepository.findById(req.getUpcId());
				if(optUserProductCart.isPresent()) {
					userProductCartRepository.save(req);
					result = "Success to update User Product Cart Data!";
				}
		return result;
	}

	@Override
	public String delUserProductCart(String id) {
		// TODO Auto-generated method stub
		String result = "Failed to delete User Product Cart Data!";
		
		Optional<UserProductCart> optUserProductCart = userProductCartRepository.findById(id);
		if (optUserProductCart.isPresent()) {
			userProductCartRepository.deleteById(id);
			result = "Success to delete User Product Cart Data!";
		}
		return result;
		
	}

	@Override
	public List<cartDto> getCartDtoByUpcId(String cart) {
	
	  	List<cartDto> cartDto = new ArrayList<>();
	
		List<UserProductCart> userProductCartById = userProductCartRepository.findByUpcId(cart);
		
		
		for (UserProductCart userProductCartLoop : userProductCartById) {
			cartDto tempUserProductCart = new cartDto();
			//tableuser
			UserTable userByName = userTableRepository.findByUserId(userProductCartLoop.getUserId());
			
			tempUserProductCart.setName(userByName.getNama());
			tempUserProductCart.setCreditCard(userByName.getKartuKredit());
			tempUserProductCart.setNoTelp(userByName.getNoTelp());
			
			
			//table user // table alamat
			
			tempUserProductCart.setUserAddress(userAddressRepository.findByUserIdAndIsDefault(userProductCartLoop.getUserId(), 1).getAlamat());
			
			//table product
			
			Product productBypId = productRepository.findBypId(userProductCartLoop.getpId());
			tempUserProductCart.setNamaP(productBypId.getNamaP());
			tempUserProductCart.setPrice(productBypId.getPrice());
			tempUserProductCart.setAlamatP(productBypId.getAlamatP());
			
			//table upc
			
			tempUserProductCart.setQtyCart(userProductCartLoop.getQtyCart());
			tempUserProductCart.setTotalPrice(userProductCartLoop.getTotalPrice());
			

			tempUserProductCart.setQtyCart(userProductCartLoop.getQtyCart());
			tempUserProductCart.setTotalPrice(userProductCartLoop.getTotalPrice());
			cartDto.add(tempUserProductCart);
		}
		return cartDto;
		
	}
 
	
	@Override
	public List<cartDto> getAllCartByDto(String userId) {
		List<cartDto> cartDto = new ArrayList<>();
		
		List<UserProductCart> userProductCartByUserId = userProductCartRepository.findByUserId(userId);
		
		
		for (UserProductCart userProductCartLoop : userProductCartByUserId) {
			cartDto tempUserProductCart = new cartDto();
			//tableuser
			
			UserTable userByName = userTableRepository.findByUserId(userProductCartLoop.getUserId());
			
			tempUserProductCart.setName(userByName.getNama());
			tempUserProductCart.setCreditCard(userByName.getKartuKredit());
			tempUserProductCart.setNoTelp(userByName.getNoTelp());
			
			
			//table user // table alamat
			
			tempUserProductCart.setUserAddress(userAddressRepository.findByUserIdAndIsDefault(userProductCartLoop.getUserId(), 1).getAlamat());
			
			//table product
			
			Product productBypId = productRepository.findBypId(userProductCartLoop.getpId());
			tempUserProductCart.setNamaP(productBypId.getNamaP());
			tempUserProductCart.setPrice(productBypId.getPrice());
			tempUserProductCart.setAlamatP(productBypId.getAlamatP());
			
			//table upc
			
			tempUserProductCart.setQtyCart(userProductCartLoop.getQtyCart());
			tempUserProductCart.setTotalPrice(userProductCartLoop.getTotalPrice());
	
			cartDto.add(tempUserProductCart);
		}
		return cartDto;
	}

}
