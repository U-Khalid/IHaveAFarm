package com.farm.dao;

import java.util.List;

import com.farm.entity.Product;

public interface ProductDao {

	List<Product> getProductList();

	int addProduct(Product product);

	int delProduct(Long id);

	Product getProduct(Long id);

	int editProduct(Product product);

	List<Product> getAllProductByNum();

	List<Product> getProductById(Long id);

	Product getProductDetailById(Long id);
	
	
}
