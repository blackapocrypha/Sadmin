package com.SoftAdmin.Service;

import java.util.List;

import com.SoftAdmin.bean.Udetils;
import com.SoftAdmin.bean.Users;

public interface UdetilService {

	/**
	 * 分页查询网站会员信息
	 * @param beforelimit 网站会员前抑制点
	 * @param afterlimit  网站会员后抑制点
	 * @return
	 */
	List<Udetils> getAllUsers(Integer beforelimit,Integer afterlimit);

	/**
	 * 根据用户名获取用户
	 * @param username 用户
	 * @return
	 */
	Udetils getUdetilsWhichUseToEdit(String username);

	/**
	 * 更新用户信息
	 * @param udetils 账户
	 * @return
	 */
	boolean updateUdetilsByUphone(Udetils udetils);

	/**
	 * 添加新用户
	 * @param fname 昵称
	 * @param username 账户
	 * @return
	 */
	boolean addNewUser(String fname, String username);

	/**
	 * 删除用户
	 * @param username 账号
	 * @return
	 */
	boolean deleteUser(String username);

	/**
	 * 根据名称查找用户
	 * @param username 名称
	 * @return
	 */
	Udetils selectUsersByName(String username);

	

	

}
