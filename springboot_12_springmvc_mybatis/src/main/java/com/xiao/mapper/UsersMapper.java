package com.xiao.mapper;

import java.util.List;

import com.xiao.pojo.Users;

public interface UsersMapper {
	
	void insertUser(Users users);
	
	List<Users> selectUsersAll();
	
	Users selectUsersById(Integer id);
	
	void updateUser(Users users);
	
	void deleteUserById(Integer id);

}
