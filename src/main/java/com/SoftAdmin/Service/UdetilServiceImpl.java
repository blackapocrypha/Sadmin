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

	@Override
	public List<Udetils> getAllUsers(Integer beforelimit,Integer afterlimit) {
		// TODO Auto-generated method stub
		return udetilsMapper.getAllUsers(beforelimit,afterlimit);
	}

	@Override
	public Udetils getUdetilsWhichUseToEdit(String username) {
		// TODO Auto-generated method stub
		return udetilsMapper.getUdetilsWhichUseToEdit(username);
	}

	@Override
	public boolean updateUdetilsByUphone(Udetils udetils) {
		// TODO Auto-generated method stub
		return udetilsMapper.updateUdetilsByUphone(udetils)>0;
	}

	@Override
	public boolean addNewUser(String fname, String username) {
		// TODO Auto-generated method stub
		return udetilsMapper.addNewUser(fname,username)>0;
	}

	@Override
	public boolean deleteUser(String username) {
		// TODO Auto-generated method stub
		return udetilsMapper.deleteUser(username)>0;
	}

	@Override
	public Udetils selectUsersByName(String username) {
		// TODO Auto-generated method stub
		return udetilsMapper.selectUsersByName(username);
	}



	
	
}
