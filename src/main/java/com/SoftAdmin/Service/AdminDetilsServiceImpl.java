package com.SoftAdmin.Service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.SoftAdmin.bean.Admindetils;
import com.SoftAdmin.mapper.AdmindetilsMapper;

@Service
public class AdminDetilsServiceImpl implements AdminDetilsService {

	@Resource
	private AdmindetilsMapper admindetilsMapper;

	@Override
	public Admindetils getAllAdminDetils(String username) {
		// TODO Auto-generated method stub
		return admindetilsMapper.getAllAdminDetils(username);
	}

	@Override
	public void updateAdmin(String username, String phone, String email, String urlimg) {
		// TODO Auto-generated method stub
		admindetilsMapper.updateAdmin(username,phone,email,urlimg);
	}

	@Override
	public List<Admindetils> getAllAdmin(Integer beforelimit, Integer afterlimit) {
		// TODO Auto-generated method stub
		return admindetilsMapper.getAllAdmin(beforelimit,afterlimit);
	}

	@Override
	public Admindetils getAdmindetilsWhichUseToEdit(String username) {
		// TODO Auto-generated method stub
		return admindetilsMapper.getAdmindetilsWhichUseToEdit(username);
	}

	@Override
	public boolean updateAdmindetilsByphone(Admindetils admindetils) {
		// TODO Auto-generated method stub
		return admindetilsMapper.updateAdmindetilsByphone(admindetils)>0;
	}

	@Override
	public boolean addNewAdmin(Admindetils ad) {
		// TODO Auto-generated method stub
		return admindetilsMapper.insert(ad)>0;
	}

	@Override
	public boolean deleteUser(String username) {
		// TODO Auto-generated method stub
		return admindetilsMapper.deleteUser(username)>0;
	}
}
