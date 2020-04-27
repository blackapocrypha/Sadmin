package com.SoftAdmin.Service;

import java.util.List;

import com.SoftAdmin.bean.Admindetils;
import com.SoftAdmin.bean.Udetils;

public interface AdminDetilsService {

	/**
	 * 获取管理员详情
	 * @param username 管理员账户
	 * @return
	 */
	Admindetils getAllAdminDetils(String username);

	
	/**
	 * 更新管理员信息
	 * @param username 用户名
	 * @param phone 手机
	 * @param email 邮箱
	 * @param urlimg 头像
	 */
	void updateAdmin(String username, String phone, String email, String urlimg);

	
	/**
	 * 获取当前分页查询信息
	 * @param beforelimit limit前变量
	 * @param afterlimit limit后变量
	 * @return
	 */
	List<Admindetils> getAllAdmin(Integer beforelimit, Integer afterlimit);	

	
	/**
	 * 获取当前需要编辑的用户详情
	 * @param username 用户名
	 * @return
	 */
	Admindetils getAdmindetilsWhichUseToEdit(String username);

	/**
	 * 更新用户
	 * @param admindetils 用户信息
	 * @return
	 */
	boolean updateAdmindetilsByphone(Admindetils admindetils);

	/**
	 * 添加管理员
	 * @param ad 管理员信息
	 * @return
	 */
	boolean addNewAdmin(Admindetils ad);

	/**
	 * 删除管理员
	 * @param username 管理员
	 * @return
	 */
	boolean deleteUser(String username);

	/**
	 * 根据用户名查询管理员
	 * @param username 管理名
	 * @return
	 */
	Admindetils selectAdminByName(String username);

}
