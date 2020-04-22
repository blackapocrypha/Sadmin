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

	@Override
	public Softadmin login(Softadmin softadmin) {
		// TODO Auto-generated method stub
		return softadminMapper.login(softadmin);
	}

	@Override
	public List<Softadmin> getAllOnlineAdmin() {
		// TODO Auto-generated method stub
		return softadminMapper.getAllOnlineAdmin();
	}

	@Override
	public Boolean checkAdminIsExit(String username) {
		// TODO Auto-generated method stub
		return softadminMapper.checkAdminIsExit(username)>0;
	}

	@Override
	public void adminOnLine(String username) {
		// TODO Auto-generated method stub
		softadminMapper.adminOnLine(username);
	}

	@Override
	public void adminOutLine(String uname) {
		// TODO Auto-generated method stub
		softadminMapper.adminOutLine(uname);
	}

	@Override
	public Softadmin getPowerOfUser(String username) {
		// TODO Auto-generated method stub
		return softadminMapper.getPowerOfUser(username);
	}

	@Override
	public void updatePass(String username, String encodepass,String urlimg) {
		// TODO Auto-generated method stub
		softadminMapper.updatePass(username,encodepass,urlimg);
	}

	@Override
	public List<Softadmin> getAllAdmin(Integer beforelimit, Integer afterlimit) {
		// TODO Auto-generated method stub
		return softadminMapper.getAllAdmin(beforelimit,afterlimit);
	}

	@Override
	public int howmanyadmin() {
		// TODO Auto-generated method stub
		return softadminMapper.howmanyadmin();
	}

	@Override
	public boolean updateAdmindetilsByphone(String username, String urlimg) {
		// TODO Auto-generated method stub
		return softadminMapper.updateAdmindetilsByphone(username,urlimg)>0;
	}

	@Override
	public Boolean updatePasswordByUsername(Softadmin soft) {
		// TODO Auto-generated method stub
		return softadminMapper.updateSoftAdminPass(soft)>0;
	}

	@Override
	public boolean deleteUser(String username) {
		// TODO Auto-generated method stub
		return softadminMapper.deleteUser(username)>0;
	}

	@Override
	public boolean addNewAdmin(Softadmin soft) {
		// TODO Auto-generated method stub
		return softadminMapper.insert(soft)>0;
	}

	@Override
	public Softadmin selectAdminByName(String username) {
		// TODO Auto-generated method stub
		return softadminMapper.selectAdminByName(username);
	}



	
	
	
}
