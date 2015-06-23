package com.dubbo.user.dao;

import com.dubbo.user.model.User;


public interface UserDAO {

	/**
	 * 添加新用户
	 * @param user
	 * @return
	 */
	public int insertUser(User user);
	
	public User get(String id);
	
	public int getInt(String id);
}
