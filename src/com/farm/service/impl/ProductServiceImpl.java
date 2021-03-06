package com.farm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.farm.dao.ProductDao;
import com.farm.dao.ProductTypeDao;
import com.farm.entity.Product;
import com.farm.entity.ProductType;
import com.farm.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService{

	@Autowired 
	ProductTypeDao ptDao;
	
	@Autowired
	ProductDao pDao;

	@Override
	public List<ProductType> getProductTypeList() {
		return ptDao.getProductTypeList();
	}

	@Override
	public int addType(ProductType type) {
		System.out.println(type.getProductTypeName());
		return ptDao.addType(type);
	}

	@Override
	public int deleteType(Long id) {
		return ptDao.deleteType(id);
	}

	@Override
	public ProductType getProductTypeById(Long id) {
		return ptDao.getProductTypeById(id);
	}

	@Override
	public int editType(ProductType productType) {
		return ptDao.editType(productType);
	}

	@Override
	public List<Product> getProductList() {
		return pDao.getProductList();
	}

	@Override
	public int addProduct(Product product) {
		return pDao.addProduct(product);
	}

	@Override
	public int delProduct(Long id) {
		return pDao.delProduct(id);
	}

	@Override
	public Product getProduct(Long id) {
		return pDao.getProduct(id);
	}

	@Override
	public int editProduct(Product product) {
		return pDao.editProduct(product);
	}

	@Override
	public List<Product> getAllProductByNum() {
		return pDao.getAllProductByNum();
	}

	@Override
	public List<Product> getProductById(Long id) {
		return pDao.getProductById(id);
	}

	@Override
	public Product getProductDetailById(Long id) {
		return pDao.getProductDetailById(id);
	}
}
