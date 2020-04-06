package com.SoftAdmin.Service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.SoftAdmin.bean.Users;
import com.SoftAdmin.mapper.UsersMapper;

@Service
public class UsersServiceImpl implements UsersService {

	@Resource
	private UsersMapper usersMapper;

	@Override
	public List<Users> getAllUsers(Integer beforelimit,Integer afterlimit) {
		// TODO Auto-generated method stub
		return usersMapper.getAllUsers(beforelimit,afterlimit);
	}

	@Override
	public Integer howmanyusers() {
		// TODO Auto-generated method stub
		return usersMapper.howmanyusers();
	}

	@Override
	public Users getUsersByUsername(String username) {
		// TODO Auto-generated method stub
		return usersMapper.getUsersByUsername(username);
	}

	@Override
	public boolean updatePasswordByUsername(Users user) {
		// TODO Auto-generated method stub
		return usersMapper.updatePasswordByUsername(user)>0;
	}

	@Override
	public boolean addNewUser(Users user) {
		// TODO Auto-generated method stub
		return usersMapper.insert(user)>0;
	}

	@Override
	public boolean deleteUser(String username) {
		// TODO Auto-generated method stub
		return usersMapper.deleteUser(username)>0;
	}

	@Override
	public Users selectUsersByName(String username) {
		// TODO Auto-generated method stub
		return usersMapper.selectUsersByName(username);
	}


}
