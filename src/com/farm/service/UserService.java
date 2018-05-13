package com.farm.service;

import java.util.List;

import com.farm.entity.User;

public interface UserService {

	/*************************** 用户  ******************************/
	/**
	 * 函数名称： login
	 * 功能描述： 用户登录
	 * 参数说明：
	 * 返回值： User
	 * 作者： zhangbin    时间：2018年3月17日 下午12:55:37
	 */
	User login(User user);

	/**
	 * 函数名称： getUserList
	 * 功能描述： 获取用户列表
	 * 参数说明：
	 * 返回值： List<User>
	 * 作者： zhangbin    时间：2018年3月18日 上午10:53:00
	 */
	List<User> getUserList(User user);

	/**
	 * 函数名称： addUser
	 * 功能描述： 添加用户帐号
	 * 参数说明：
	 * 返回值： int
	 * 作者： zhangbin    时间：2018年3月18日 上午10:53:09
	 */
	int addUser(User user);

	/**
	 * 函数名称： delUser
	 * 功能描述： 删除用户
	 * 参数说明：
	 * 返回值： int
	 * 作者： zhangbin    时间：2018年3月18日 下午1:40:40
	 */
	int delUser(Long id);

	/**
	 * 函数名称： editUser
	 * 功能描述： 修改密码
	 * 参数说明：
	 * 返回值： int
	 * 作者： zhangbin    时间：2018年3月18日 下午8:40:03
	 */
	int editUser(User user);

}
