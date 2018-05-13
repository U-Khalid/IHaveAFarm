package com.farm.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.farm.dao.ProductDao;
import com.farm.dao.ProductTypeDao;
import com.farm.dao.UserDao;
import com.farm.entity.User;
import com.farm.util.Utils;

@RunWith(SpringJUnit4ClassRunner.class)
//告诉junit spring配置文件
@ContextConfiguration({"classpath:com/farm/config/spring-*.xml"})
public class test {
	
	@Autowired 
	UserDao uDao;
	
	@Autowired
	ProductTypeDao ptDao;
	
	@Autowired
	ProductDao pDao;
	
	@Test
	public void getUserList() {
		User user = new User();
		user.setAccount("admin");
		System.out.println(uDao.getUserList(user));
	}
	
	@Test
	public void addUser() {
		User user = new User();
		user.setAccount("12345");
		user.setPassword("12345");
		user.setGmtCreate(Utils.getNowTime());
		uDao.addUser(user);
	}
	
	@Test
	public void delUser() {
		Long id = (long) 5;
		uDao.delUser(id);
	}
	
	@Test
	public void getProTypeList() {
		System.out.println(ptDao.getProductTypeList());
	}
	
	@Test
	public void getProductTypeById() {
		Long id = (long)1;
		System.out.println(ptDao.getProductTypeById(id));
	}
	
	@Test
	public void getProductDetailById() {
		Long id = (long)8;
		System.out.println(pDao.getProductDetailById(id));
	}

}
