package com.farm.controller;

import java.util.Date;
import java.util.List;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.farm.entity.Product;
import com.farm.entity.ProductType;
import com.farm.entity.User;
import com.farm.service.ProductService;
import com.farm.service.UserService;
import com.farm.util.CONSTANS;
import com.farm.util.MD5;
import com.farm.util.Utils;



@Controller
@RequestMapping(value="/basic")
public class BasicController {  
	
	@Autowired 
	UserService uService;
	
	@Autowired
	ProductService pService;
	
	String FRONT_PATH = CONSTANS.path.FRONT_SYSTEM;    //前端页面
	String MANAGE_PATH = CONSTANS.path.MANAGE_SYSTEM;  //后台管理页面
	
	/******************************前端页面*****************************/
	@RequestMapping("/main")
	public String getMain(HttpServletRequest request) {
		List<ProductType> types = pService.getProductTypeList();
		request.setAttribute("types", types);
		return FRONT_PATH + "Main/main";
	}
	
	@RequestMapping("/toMain")
	public String toMain(HttpServletRequest request) {
		List<ProductType> types = pService.getProductTypeList();
		request.setAttribute("types", types);
		return FRONT_PATH + "Main/main";
	}
	
	@RequestMapping("/toCompanyIntro")
	public String toCompanyIntro(HttpServletRequest request) {
		List<ProductType> types = pService.getProductTypeList();
		request.setAttribute("types", types);
		return FRONT_PATH + "CompanyIntro/companyIntro";
	}
	
	@RequestMapping("/toShop")
	public String toShop(HttpServletRequest request) {
		List<ProductType> types = pService.getProductTypeList();
		request.setAttribute("types", types);
		return FRONT_PATH + "Shop/shop";
	}
	
	
	@RequestMapping("/toConnect")
	public String toConnect(HttpServletRequest request) {
		List<ProductType> types = pService.getProductTypeList();
		request.setAttribute("types", types);
		return FRONT_PATH + "Connect/connect";
	}
	
	@RequestMapping("/getMap")
	public String getMap(HttpServletRequest request) {
		return FRONT_PATH + "Connect/map";
	}
	
	@RequestMapping("/toAllProduct")
	public String toAllProduct(HttpServletRequest request) {
		List<Product> products = pService.getAllProductByNum();
		request.setAttribute("pros", products);
		return FRONT_PATH + "ProductIntro/allProduct";
	}
	
	@RequestMapping("/toProductIntro")
	public String toProductIntro(Long id, HttpServletRequest request) {
		List<Product> products = pService.getProductById(id);
		ProductType type = pService.getProductTypeById(id);
		request.setAttribute("type", type);
		request.setAttribute("pros", products);
		return FRONT_PATH + "ProductIntro/productIntro";
	}
	
	@RequestMapping("/getProductDetailById")
	public String getProductDetailById(Long id, HttpServletRequest request) {
		Product product = pService.getProductDetailById(id);
		request.setAttribute("pro", product);
		return FRONT_PATH + "ProductIntro/productDetail"; 
	}
	
	
	
	/******************************后台页面*****************************/
	@RequestMapping("/login")
	public String getLogin(HttpServletRequest request) {
		return MANAGE_PATH + "Login/login";
	}
	
	
	@RequestMapping("/toLogin")
	public String toLogin(User user, HttpServletRequest request, HttpServletResponse response) {
		MD5 md5 = new MD5();
		String password = md5.MD5Encode(user.getPassword(),"utf-8");
		user.setPassword(password);
		User u = uService.login(user);
		if(u != null) {
			request.setAttribute("user", u);
			HttpSession session = request.getSession();
			session.setAttribute("user", u); // 设置Session
			session.setMaxInactiveInterval(24 * 60 * 60); // 设置session为24小时
			
			//设置cookie
			String userHistory = u.getAccount();    //  3_2
			Cookie cookie = new Cookie("UserHistory",userHistory);
			cookie.setMaxAge(1*30*24*3600);
			response.addCookie(cookie);
			return MANAGE_PATH + "index";
		}else {
			request.setAttribute("Error", "帐号或者密码错误！");
			return MANAGE_PATH + "Login/login";
		}
		
		
	}
	
	
	@RequestMapping(value="/MyDesktop",produces="text/html; charset=UTF-8")
	@ResponseBody
	public String  MyDesktop(HttpServletRequest request,HttpServletResponse response) {
		response.setCharacterEncoding("utf-8");
		String ip = Utils.getIpAddr(request);
		if(ip.equals("0:0:0:0:0:0:0:1")) {
                    ip="127.0.0.1";
                }
		String  userId = null,string =null,ip2="第一次登录",dateTime="无";
		string = "欢迎进入我有一个农场系统管理后台<br><br>ip : 127.0.0.1<br><br>" + "上次登录时间："
				+ new Date().toString();

		return string;
	
	}
	
	@RequestMapping("/logout")
	public String logout(HttpServletRequest request, HttpServletResponse response) {
		request.getSession().removeAttribute("user");
		request.getSession().invalidate();
		HttpSession session = request.getSession();
		User user = (User) session.getAttribute("user");
		if(user == null) {
			return MANAGE_PATH + "Login/login";
		}else {
			return MANAGE_PATH + "index";
		}
		
	}
	
}