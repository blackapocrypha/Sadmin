package com.SoftAdmin.Service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.SoftAdmin.bean.Udetils;
import com.SoftAdmin.bean.Users;
import com.SoftAdmin.mapper.UdetilsMapper;

@Service
public class UdetilServiceImpl implements UdetilService {

	@Resource
	private UdetilsMapper udetilsMapper;

	/**
	 * 分页查询网站会员信息
	 * @param beforelimit 网站会员前抑制点
	 * @param afterlimit  网站会员后抑制点
	 * @return
	 */
	@Override
	public List<Udetils> getAllUsers(Integer beforelimit,Integer afterlimit) {
		// TODO Auto-generated method stub
		return udetilsMapper.getAllUsers(beforelimit,afterlimit);
	}

	/**
	 * 根据用户名获取用户
	 * @param username 用户
	 * @return
	 */
	@Override
	public Udetils getUdetilsWhichUseToEdit(String username) {
		// TODO Auto-generated method stub
		return udetilsMapper.getUdetilsWhichUseToEdit(username);
	}

	/**
	 * 更新用户信息
	 * @param udetils 账户
	 * @return
	 */
	@Override
	public boolean updateUdetilsByUphone(Udetils udetils) {
		// TODO Auto-generated method stub
		return udetilsMapper.updateUdetilsByUphone(udetils)>0;
	}

	/**
	 * 添加新用户
	 * @param fname 昵称
	 * @param username 账户
	 * @return
	 */
	@Override
	public boolean addNewUser(String fname, String username) {
		// TODO Auto-generated method stub
		return udetilsMapper.addNewUser(fname,username)>0;
	}

	/**
	 * 删除用户
	 * @param username 账号
	 * @return
	 */
	@Override
	public boolean deleteUser(String username) {
		// TODO Auto-generated method stub
		return udetilsMapper.deleteUser(username)>0;
	}

	/**
	 * 根据名称查找用户
	 * @param username 名称
	 * @return
	 */
	@Override
	public Udetils selectUsersByName(String username) {
		// TODO Auto-generated method stub
		return udetilsMapper.selectUsersByName(username);
	}



	
	
}
