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

import com.example.solo_project.model.UserAddress;
import com.example.solo_project.service.UserAddressService;

@CrossOrigin
@RestController
@RequestMapping("api/solo_project/userAddress")
public class UserAddressController {
	
	@Autowired
	UserAddressService userAddressService;
	
	@GetMapping
	public List<UserAddress> findAll(){
		
		return userAddressService.findAll();
		
	}
	
	@PostMapping("default/{defaultt}")
	public List<UserAddress> getByIsDefault(@PathVariable Integer defaultt) {
		return userAddressService.getByIsDefault(defaultt);
	}
	
	@PostMapping //("localhost:8092/api/solo_project/UserAddress/path") kalau mau spesific
	public String regUserAddress(@RequestBody UserAddress req) {
		
		return userAddressService.regUserAddress(req);
	}
	
	@PutMapping
	public String updUserAddress(@RequestBody UserAddress req) {
		
		return userAddressService.updUserAddress(req);
	}
	
	@DeleteMapping("{idAlamat}")
	public String delUserAddress(@PathVariable String idAlamat) {
		
		return userAddressService.delUserAddress(idAlamat);
	}
}
