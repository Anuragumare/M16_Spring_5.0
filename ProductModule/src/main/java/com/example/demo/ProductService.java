package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
@Service
@Transactional
public class ProductService {
	@Autowired
	private ProductRepository rep;
	public List<Product> listAll() {
		
		return rep.findAll();
	}
	public Product get(Integer id) {
		
		return rep.findById(id).get();
	}
	public void save(Product p) {
		rep.save(p);
		
	}
	public void delete(Integer id) {
		rep.deleteById(id);
		
	}
	

}
