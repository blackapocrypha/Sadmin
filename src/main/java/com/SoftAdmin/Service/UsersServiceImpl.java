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

	/**
	 * 分页查询用户账号
	 * @param beforelimit 用户前抑制点
	 * @param afterlimit  用户后抑制点
	 * @return
	 */
	@Override
	public List<Users> getAllUsers(Integer beforelimit,Integer afterlimit) {
		// TODO Auto-generated method stub
		return usersMapper.getAllUsers(beforelimit,afterlimit);
	}

	/**
	 * 总共多少用户
	 * @return
	 */
	@Override
	public Integer howmanyusers() {
		// TODO Auto-generated method stub
		return usersMapper.howmanyusers();
	}

	/**
	 * 根据账号查询对应用户
	 * @param username 账号
	 * @return
	 */
	@Override
	public Users getUsersByUsername(String username) {
		// TODO Auto-generated method stub
		return usersMapper.getUsersByUsername(username);
	}

	/**
	 * 更新用户密码
	 * @param user 用户信息
	 * @return
	 */
	@Override
	public boolean updatePasswordByUsername(Users user) {
		// TODO Auto-generated method stub
		return usersMapper.updatePasswordByUsername(user)>0;
	}

	/**
	 * 添加新用户
	 * @param user 用户
	 * @return
	 */
	@Override
	public boolean addNewUser(Users user) {
		// TODO Auto-generated method stub
		return usersMapper.insert(user)>0;
	}

	/**
	 * 删除用户
	 * @param username 账号
	 * @return
	 */
	@Override
	public boolean deleteUser(String username) {
		// TODO Auto-generated method stub
		return usersMapper.deleteUser(username)>0;
	}

	/**
	 * 根据名称查询对应用户信息
	 * @param username 名称
	 * @return
	 */
	@Override
	public Users selectUsersByName(String username) {
		// TODO Auto-generated method stub
		return usersMapper.selectUsersByName(username);
	}


}
