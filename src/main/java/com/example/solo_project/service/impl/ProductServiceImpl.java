package com.example.solo_project.service.impl;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.example.solo_project.model.Product;
import com.example.solo_project.repository.ProductRepository;
import com.example.solo_project.service.ProductService;
import com.example.solo_project.util.ProductUtil;

@Service
public class ProductServiceImpl implements ProductService{
	
	@Autowired
	ProductRepository productRepository;
	
	@Override
	public List<Product> findAll() {
		// TODO Auto-generated method stub
		return productRepository.findAll();
	}

	@Override
	public String regProduct(Product req) {
		// TODO Auto-generated method stub
		String result = "Failed to register Product Data!";
		if (req != null) {
			productRepository.save(req);
			result = "Success to register Product Data!";
		}
		return result;
		
	}

	@Override
	public String updProduct(Product req) {
		// TODO Auto-generated method stub
		String result = "Failed to update Product Data!";
		
		Optional<Product> optProduct = productRepository.findById(req.getpId());
				if(optProduct.isPresent()) {
					productRepository.save(req);
					result = "Success to update Product Data!";
				}
		return result;
	}

	@Override
	public String delProduct(String id) {
		// TODO Auto-generated method stub
		String result = "Failed to delete Product Data!";
		
		Optional<Product> optProduct = productRepository.findById(id);
		if (optProduct.isPresent()) {
			productRepository.deleteById(id);
			result = "Success to delete Product Data!";
		}
		return result;
		
	}

	@Override
	public List<Product> getProductByCatId(String catId) {
		// TODO Auto-generated method stub
		return productRepository.findByCatId(catId);
	}

	@Override
	public String uploadImage(MultipartFile file, String id) throws IOException {
		String result = "failed";
		byte[] imageByte = ProductUtil.compressImage(file.getBytes());
		
		Optional<Product> isProductExs = productRepository.findById(id);
		
		if(isProductExs!=null) {
			Product tempProduct = isProductExs.get();
			tempProduct.setGambar(imageByte);
			
			productRepository.save(tempProduct);
			result = "Success to Upload";
		}
		return result;
	}

	@Override
	public byte[] getGambarById(String id) {
		byte[] result = null;
		Optional<Product> isProductExs = productRepository.findById(id);
		if(isProductExs!=null) {
			Product tempProduct = isProductExs.get();
			result = ProductUtil.decompressImage(tempProduct.getGambar());
			}
		return result;
	}
	
	

}
