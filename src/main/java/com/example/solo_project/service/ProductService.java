package com.example.solo_project.service;

import java.io.IOException;
import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.example.solo_project.model.Product;

public interface ProductService {

	public List<Product> findAll();
	
	public String regProduct(Product req) ;

	public String updProduct(Product req);
	
	public String delProduct(String id);
	
	public List<Product> getProductByCatId(String catId);
	
	
	//gambar
	public String uploadImage(MultipartFile file,String id) throws IOException;
	public byte[] getGambarById(String id);
}
