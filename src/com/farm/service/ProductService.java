package com.farm.service;

import java.util.List;

import com.farm.entity.Product;
import com.farm.entity.ProductType;

public interface ProductService {

	List<ProductType> getProductTypeList();

	int addType(ProductType type);

	int deleteType(Long id);

	ProductType getProductTypeById(Long id);

	int editType(ProductType productType);

	List<Product> getProductList();

	int addProduct(Product product);

	int delProduct(Long id);

	Product getProduct(Long id);

	int editProduct(Product product);

	List<Product> getAllProductByNum();

	List<Product> getProductById(Long id);

	Product getProductDetailById(Long id);

}
