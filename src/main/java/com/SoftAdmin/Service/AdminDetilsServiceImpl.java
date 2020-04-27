package com.SoftAdmin.Service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.SoftAdmin.bean.Admindetils;
import com.SoftAdmin.mapper.AdmindetilsMapper;

@Service
public class AdminDetilsServiceImpl implements AdminDetilsService {

	//管理员详情
	@Resource
	private AdmindetilsMapper admindetilsMapper;

	/**
	 * 获取管理员详情
	 * @param username 管理员账户
	 * @return
	 */
	@Override
	public Admindetils getAllAdminDetils(String username) {
		// TODO Auto-generated method stub
		return admindetilsMapper.getAllAdminDetils(username);
	}

	/**
	 * 更新管理员信息
	 * @param username 用户名
	 * @param phone 手机
	 * @param email 邮箱
	 * @param urlimg 头像
	 */
	@Override
	public void updateAdmin(String username, String phone, String email, String urlimg) {
		// TODO Auto-generated method stub
		admindetilsMapper.updateAdmin(username,phone,email,urlimg);
	}

	/**
	 * 获取当前分页查询信息
	 * @param beforelimit limit前变量
	 * @param afterlimit limit后变量
	 * @return
	 */
	@Override
	public List<Admindetils> getAllAdmin(Integer beforelimit, Integer afterlimit) {
		// TODO Auto-generated method stub
		return admindetilsMapper.getAllAdmin(beforelimit,afterlimit);
	}

	/**
	 * 获取当前需要编辑的用户详情
	 * @param username 用户名
	 * @return
	 */
	@Override
	public Admindetils getAdmindetilsWhichUseToEdit(String username) {
		// TODO Auto-generated method stub
		return admindetilsMapper.getAdmindetilsWhichUseToEdit(username);
	}

	/**
	 * 更新管理用户
	 * @param admindetils 用户信息
	 * @return
	 */
	@Override
	public boolean updateAdmindetilsByphone(Admindetils admindetils) {
		// TODO Auto-generated method stub
		return admindetilsMapper.updateAdmindetilsByphone(admindetils)>0;
	}

	/**
	 * 添加管理员
	 * @param ad 管理员信息
	 * @return
	 */
	@Override
	public boolean addNewAdmin(Admindetils ad) {
		// TODO Auto-generated method stub
		return admindetilsMapper.insert(ad)>0;
	}

	/**
	 * 删除管理员
	 * @param username 管理员
	 * @return
	 */
	@Override
	public boolean deleteUser(String username) {
		// TODO Auto-generated method stub
		return admindetilsMapper.deleteUser(username)>0;
	}

	/**
	 * 根据用户名查询管理员
	 * @param username 管理名
	 * @return
	 */
	@Override
	public Admindetils selectAdminByName(String username) {
		// TODO Auto-generated method stub
		return admindetilsMapper.selectAdminByName(username);
	}
}
