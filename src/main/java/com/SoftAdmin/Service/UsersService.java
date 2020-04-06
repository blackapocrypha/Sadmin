package com.SoftAdmin.Service;

import java.util.List;

import com.SoftAdmin.bean.Users;

public interface UsersService {

	List<Users> getAllUsers(Integer beforelimit,Integer afterlimit);

	Integer howmanyusers();

	Users getUsersByUsername(String username);

	boolean updatePasswordByUsername(Users user);

	boolean addNewUser(Users user);

	boolean deleteUser(String username);

	Users selectUsersByName(String username);

	

	
	
}
