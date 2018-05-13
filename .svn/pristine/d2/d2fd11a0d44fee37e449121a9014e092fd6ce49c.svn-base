package com.farm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.farm.dao.UserDao;
import com.farm.entity.User;
import com.farm.service.UserService;
import com.farm.util.Utils;
import com.mysql.jdbc.Util;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired UserDao uDao;
	
	@Override
	public User login(User user) {
		return uDao.login(user);
	}

	@Override
	public List<User> getUserList(User user) {
		if(user.getAccount().equals("admin")) {
			return uDao.getUserList(null);
		}else {
			return uDao.getUserList(user);
		}
		
	}

	@Override
	public int addUser(User user) {
		return uDao.addUser(user);
	}

	@Override
	public int delUser(Long id) {
		return uDao.delUser(id);
	}

	@Override
	public int editUser(User user) {
		return uDao.editUser(user);
	}

}
