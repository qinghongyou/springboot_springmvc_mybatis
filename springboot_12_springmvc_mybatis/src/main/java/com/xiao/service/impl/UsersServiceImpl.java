package com.xiao.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.xiao.mapper.UsersMapper;
import com.xiao.pojo.Users;
import com.xiao.service.UsersService;

@Service
@Transactional
public class UsersServiceImpl implements UsersService {
	
	@Autowired
	private UsersMapper usersMapper;

	@Override
	public void addUser(Users users) {
		this.usersMapper.insertUser(users);
		
	}

	@Override
	public List<Users> findUsersAll() {
		return this.usersMapper.selectUsersAll();
	}
	
	@Override
	public Users findUserById(Integer id) {
		return this.usersMapper.selectUsersById(id);
	}

	@Override
	public void updateUser(Users users) {
		this.usersMapper.updateUser(users);
	}

	@Override
	public void deleteUserById(Integer id) {
		this.usersMapper.deleteUserById(id);
	}

}
