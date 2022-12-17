package com.example.solo_project.controller;


import java.io.IOException;
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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.example.solo_project.model.Product;
import com.example.solo_project.service.ProductService;

@CrossOrigin
@RestController
@RequestMapping("api/solo_project/product")
public class ProductController {
	
	@Autowired
	ProductService productService;
	
	@GetMapping
	public List<Product> findAll(){
		
		return productService.findAll();
		
	}
	
	@PostMapping("catId/{catId}")
	public List<Product> getProductByCatId(@PathVariable String catId){
		return productService.getProductByCatId(catId);
	}
	
	@PostMapping //("localhost:8092/api/solo_project/Product/path") kalau mau spesific
	public String regProduct(@RequestBody Product req) {
		
		return productService.regProduct(req);
	}
	
	@PutMapping
	public String updProduct(@RequestBody Product req) {
		
		return productService.updProduct(req);
	}
	
	@DeleteMapping("{pId}")
	public String delProduct(@PathVariable String pId) {
		
		return productService.delProduct(pId);
	}
	
	//gambar
	@PostMapping("image/image")
    public String uploadImage(@RequestParam("image") MultipartFile file, String id) throws IOException {
        return productService.uploadImage(file, id);
	}
	
	@GetMapping("/idimage/{id}")
    public byte[]  getGambarById(@PathVariable String id){
		return productService.getGambarById(id);
       
    }
}
