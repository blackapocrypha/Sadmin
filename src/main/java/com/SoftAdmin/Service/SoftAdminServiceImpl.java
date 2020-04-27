package com.SoftAdmin.Service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.SoftAdmin.bean.Admindetils;
import com.SoftAdmin.bean.Softadmin;
import com.SoftAdmin.mapper.SoftadminMapper;


@Service
public class SoftAdminServiceImpl implements SoftAdminService {

	@Resource
	private SoftadminMapper softadminMapper;

	/**
	 * 管理员登录
	 * @param softadmin 登录用户名密码
	 * @return
	 */
	@Override
	public Softadmin login(Softadmin softadmin) {
		// TODO Auto-generated method stub
		return softadminMapper.login(softadmin);
	}

	/**
	 * 获取所有在线管理
	 * @return
	 */
	@Override
	public List<Softadmin> getAllOnlineAdmin() {
		// TODO Auto-generated method stub
		return softadminMapper.getAllOnlineAdmin();
	}

	/**
	 * 检查管理员是否已经存在
	 * @param username 用户名
	 * @return
	 */
	@Override
	public Boolean checkAdminIsExit(String username) {
		// TODO Auto-generated method stub
		return softadminMapper.checkAdminIsExit(username)>0;
	}

	/**
	 * 管理员上线
	 * @param username 用户名
	 */
	@Override
	public void adminOnLine(String username) {
		// TODO Auto-generated method stub
		softadminMapper.adminOnLine(username);
	}

	/**
	 * 管理员下线
	 * @param uname 用户名
	 */
	@Override
	public void adminOutLine(String uname) {
		// TODO Auto-generated method stub
		softadminMapper.adminOutLine(uname);
	}

	/**
	 * 查看管理员权限
	 * @param username 用户名
	 * @return
	 */
	@Override
	public Softadmin getPowerOfUser(String username) {
		// TODO Auto-generated method stub
		return softadminMapper.getPowerOfUser(username);
	}

	/**
	 * 更新账户密码
	 * @param username 用户名
	 * @param encodepass 密码
	 * @param urlimg 头像
	 */
	@Override
	public void updatePass(String username, String encodepass,String urlimg) {
		// TODO Auto-generated method stub
		softadminMapper.updatePass(username,encodepass,urlimg);
	}

	/**
	 * 分页查询查看管理
	 * @param beforelimit 分页查询查看管理前抑制点
	 * @param afterlimit  分页查询查看管理后抑制点
	 * @return
	 */
	@Override
	public List<Softadmin> getAllAdmin(Integer beforelimit, Integer afterlimit) {
		// TODO Auto-generated method stub
		return softadminMapper.getAllAdmin(beforelimit,afterlimit);
	}

	/**
	 * 总共多少管理
	 * @return
	 */
	@Override
	public int howmanyadmin() {
		// TODO Auto-generated method stub
		return softadminMapper.howmanyadmin();
	}

	/**
	 * 更新管理员
	 * @param username 账号
	 * @param urlimg 头像
	 * @return
	 */
	@Override
	public boolean updateAdmindetilsByphone(String username, String urlimg) {
		// TODO Auto-generated method stub
		return softadminMapper.updateAdmindetilsByphone(username,urlimg)>0;
	}

	/**
	 * 更新密码
	 * @param soft 用户信息
	 * @return
	 */
	@Override
	public Boolean updatePasswordByUsername(Softadmin soft) {
		// TODO Auto-generated method stub
		return softadminMapper.updateSoftAdminPass(soft)>0;
	}

	/**
	 * 删除管理
	 * @param username 用户名
	 * @return
	 */
	@Override
	public boolean deleteUser(String username) {
		// TODO Auto-generated method stub
		return softadminMapper.deleteUser(username)>0;
	}

	/**
	 * 增加管理员
	 * @param soft 管理员信息
	 * @return
	 */
	@Override
	public boolean addNewAdmin(Softadmin soft) {
		// TODO Auto-generated method stub
		return softadminMapper.insert(soft)>0;
	}

	/**
	 * 根据账号获取对应管理信息
	 * @param username 账号
	 * @return
	 */
	@Override
	public Softadmin selectAdminByName(String username) {
		// TODO Auto-generated method stub
		return softadminMapper.selectAdminByName(username);
	}



	
	
	
}
