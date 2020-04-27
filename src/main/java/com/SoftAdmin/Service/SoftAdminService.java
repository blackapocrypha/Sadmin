package com.SoftAdmin.Service;

import java.util.List;

import com.SoftAdmin.bean.Admindetils;
import com.SoftAdmin.bean.Softadmin;

public interface SoftAdminService {

	/**
	 * 管理员登录
	 * @param softadmin 登录用户名密码
	 * @return
	 */
	Softadmin login(Softadmin softadmin);

	/**
	 * 获取所有在线管理
	 * @return
	 */
	List<Softadmin> getAllOnlineAdmin();

	/**
	 * 检查管理员是否已经存在
	 * @param username 用户名
	 * @return
	 */
	Boolean checkAdminIsExit(String username);

	/**
	 * 管理员上线
	 * @param username 用户名
	 */
	void adminOnLine(String username);

	/**
	 * 管理员下线
	 * @param uname 用户名
	 */
	void adminOutLine(String uname);

	/**
	 * 查看管理员权限
	 * @param username 用户名
	 * @return
	 */
	Softadmin getPowerOfUser(String username);

	/**
	 * 更新账户密码
	 * @param username 用户名
	 * @param encodepass 密码
	 * @param urlimg 头像
	 */
	void updatePass(String username, String encodepass, String urlimg);

	/**
	 * 分页查询查看管理
	 * @param beforelimit 分页查询查看管理前抑制点
	 * @param afterlimit  分页查询查看管理后抑制点
	 * @return
	 */
	List<Softadmin> getAllAdmin(Integer beforelimit, Integer afterlimit);

	/**
	 * 总共多少管理
	 * @return
	 */
	int howmanyadmin();

	/**
	 * 更新管理员
	 * @param username 账号
	 * @param urlimg 头像
	 * @return
	 */
	boolean updateAdmindetilsByphone(String username, String urlimg);

	/**
	 * 更新密码
	 * @param soft 用户信息
	 * @return
	 */
	Boolean updatePasswordByUsername(Softadmin soft);

	/**
	 * 删除管理
	 * @param username 用户名
	 * @return
	 */
	boolean deleteUser(String username);

	/**
	 * 增加管理员
	 * @param soft 管理员信息
	 * @return
	 */
	boolean addNewAdmin(Softadmin soft);

	/**
	 * 根据账号获取对应管理信息
	 * @param username 账号
	 * @return
	 */
	Softadmin selectAdminByName(String username);

	

}
