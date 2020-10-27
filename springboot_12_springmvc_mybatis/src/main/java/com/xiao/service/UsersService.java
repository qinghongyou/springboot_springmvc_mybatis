package com.xiao.service;

import java.util.List;

import com.xiao.pojo.Users;

public interface UsersService {
	
	void addUser(Users users);
	
	List<Users> findUsersAll();
	
	Users findUserById(Integer id);
	
	void updateUser(Users users);
	
	void deleteUserById(Integer id);
	
}
