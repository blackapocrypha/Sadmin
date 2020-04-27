package com.SoftAdmin.Service;

import java.util.List;

import com.SoftAdmin.bean.Users;

public interface UsersService {

	/**
	 * 分页查询用户账号
	 * @param beforelimit 用户前抑制点
	 * @param afterlimit  用户后抑制点
	 * @return
	 */
	List<Users> getAllUsers(Integer beforelimit,Integer afterlimit);

	/**
	 * 总共多少用户
	 * @return
	 */
	Integer howmanyusers();

	/**
	 * 根据账号查询对应用户
	 * @param username 账号
	 * @return
	 */
	Users getUsersByUsername(String username);

	/**
	 * 更新用户密码
	 * @param user 用户信息
	 * @return
	 */
	boolean updatePasswordByUsername(Users user);

	/**
	 * 添加新用户
	 * @param user 用户
	 * @return
	 */
	boolean addNewUser(Users user);

	/**
	 * 删除用户
	 * @param username 账号
	 * @return
	 */
	boolean deleteUser(String username);

	/**
	 * 根据名称查询对应用户信息
	 * @param username 名称
	 * @return
	 */
	Users selectUsersByName(String username);

	

	
	
}
