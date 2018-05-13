package com.farm.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.farm.entity.User;
import com.farm.service.UserService;
import com.farm.util.CONSTANS;
import com.farm.util.MD5;
import com.farm.util.Utils;

@Controller
@RequestMapping(value="/user")
public class UserController {

	@Autowired 
	UserService uService;
	
	String FRONT_PATH = CONSTANS.path.FRONT_SYSTEM;    //前端页面
	String MANAGE_PATH = CONSTANS.path.MANAGE_SYSTEM;  //后台管理页面
	
	@RequestMapping("/getUserList")
	public String getUserList(HttpServletRequest request) {
		HttpSession session = request.getSession();
		User user = (User) session.getAttribute("user");
		List<User> users = uService.getUserList(user);
		request.setAttribute("users", users);
		return MANAGE_PATH + "User/userList";
	}
	
	@RequestMapping("/toAddUser")
	public String toAddUser(HttpServletRequest request) {
		return MANAGE_PATH + "User/addUser";
	}
	
	@RequestMapping("/addUser")
	@ResponseBody
	public int addUser(User user, HttpServletRequest request) {
		int flag = 0;
		user.setGmtCreate(Utils.getNowTime());
		MD5 md5 = new MD5();
		String password = md5.MD5Encode(user.getPassword(),"utf-8");
		user.setPassword(password);
		flag = uService.addUser(user);
		return flag;
	}
	
	@RequestMapping("/delUser")
	@ResponseBody
	public int delUser(Long id, HttpServletRequest request) {
		int flag = 0;
		flag = uService.delUser(id);
		return flag;
	}
	
	@RequestMapping("/toEditUser")
	public String toEditUser(String account, HttpServletRequest request) {
		request.setAttribute("account", account);
		return MANAGE_PATH + "User/editUser";
	}
	
	@RequestMapping("/editUser")
	@ResponseBody
	public int editUser(User user, HttpServletRequest request) {
		int flag = 0;
		MD5 md5 = new MD5();
		String password = md5.MD5Encode(user.getPassword(),"utf-8");
		user.setPassword(password);
		user.setGmtModified(Utils.getNowTime());
		flag = uService.editUser(user);
		return flag;
	}
	
}
