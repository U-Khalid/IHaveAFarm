package com.farm.controller;

import java.io.File;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.farm.entity.Product;
import com.farm.entity.ProductType;
import com.farm.entity.User;
import com.farm.service.ProductService;
import com.farm.util.CONSTANS;
import com.farm.util.Utils;

@Controller
@RequestMapping(value="/product")
public class ProductController {

	String FRONT_PATH = CONSTANS.path.FRONT_SYSTEM;    //前端页面
	String MANAGE_PATH = CONSTANS.path.MANAGE_SYSTEM;  //后台管理页面
	
	@Autowired ProductService pService;
	
	/*********************************后台页面**********************************************/
	@RequestMapping("/getProductTypeList")
	public String getProductTypeList(HttpServletRequest request) {
		HttpSession session = request.getSession();
		User user = (User) session.getAttribute("user");
		List<ProductType> productTypes = pService.getProductTypeList();
		request.setAttribute("types", productTypes);
		request.setAttribute("user", user);
		return MANAGE_PATH + "Product/productTypeList";
	}
	
	@RequestMapping("/toAddType")
	public String toAddType(HttpServletRequest request) {
		return MANAGE_PATH + "Product/addProductType";
	}
	
	@RequestMapping("/addType")
	@ResponseBody
	public int addType(ProductType type, HttpServletRequest request) {
		int flag = 0;
		type.setGmtCreate(Utils.getNowTime());
		flag = pService.addType(type);
		return flag;
	}
	
	@RequestMapping("/delType")
	@ResponseBody
	public int delType(Long id, HttpServletRequest request) {
		int flag = 0;
		flag = pService.deleteType(id);
		return flag;
	}
	
	@RequestMapping("/toEditType")
	public String toEditType(Long id, HttpServletRequest request) {
		ProductType productType = pService.getProductTypeById(id);
		request.setAttribute("type", productType);
		return MANAGE_PATH + "Product/editProductType";
	}
	
	@RequestMapping("/editType")
	@ResponseBody
	public int editType(ProductType productType, HttpServletRequest request) {
		int flag = 0;
		productType.setGmtModified(Utils.getNowTime());
		flag = pService.editType(productType);
		return flag;
	}
	
	@RequestMapping("/getProductList")
	public String getProductList(HttpServletRequest request) {
		List<Product> products = pService.getProductList();
		request.setAttribute("products", products);
		return MANAGE_PATH + "Product/productList";
	}
	
	@RequestMapping("/toAddProduct")
	public String toAddProduct(HttpServletRequest request) {
		List<ProductType> types = pService.getProductTypeList();
		request.setAttribute("types", types);
		return MANAGE_PATH + "Product/addProduct";
	}
	
	@RequestMapping("/addProduct")
	@ResponseBody
	public int addProduct(Product product, MultipartFile file, HttpServletRequest request) {
		int flag = 0;
		try {
			if (!file.isEmpty()) {
				String originalFilename = file.getOriginalFilename();
				// 获取后缀
				String Suffix = originalFilename.substring(originalFilename.lastIndexOf("."));
				String filename = System.currentTimeMillis() + Suffix;
				String filePath = CONSTANS.file_path.IMAGE_PATH + filename;
				String imagepath = "/image/" + filename;
				product.setProductImage(imagepath); 
				file.transferTo(new File(filePath));
			}
			product.setGmtCreate(Utils.getNowTime());
			flag = pService.addProduct(product);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return flag;
	}
	
	@RequestMapping("/delProduct")
	@ResponseBody
	public int delProduct(Long id, HttpServletRequest request) {
		int flag = 0;
		flag = pService.delProduct(id);
		return flag;
	}
	
	
	@RequestMapping("/toEditProduct")
	public String toEditProduct(Long id, HttpServletRequest request) {
		Product product = pService.getProduct(id);
		List<ProductType> types = pService.getProductTypeList();
		request.setAttribute("types", types);
		request.setAttribute("pro", product);
		return MANAGE_PATH + "Product/editProduct";
	}
	
	@RequestMapping("/editProduct")
	@ResponseBody
	public int editProduct(Product product, MultipartFile file, HttpServletRequest request) {
		int flag = 0;
		try {
			if (!file.isEmpty()) {
				String originalFilename = file.getOriginalFilename();
				// 获取后缀
				String Suffix = originalFilename.substring(originalFilename.lastIndexOf("."));
				String filename = System.currentTimeMillis() + Suffix;
				String filePath = CONSTANS.file_path.IMAGE_PATH + filename;
				String imagepath = "/image/" + filename;
				product.setProductImage(imagepath); 
				file.transferTo(new File(filePath));
			}
			product.setGmtModified(Utils.getNowTime());
			flag = pService.editProduct(product);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return flag;
	}
	
}
