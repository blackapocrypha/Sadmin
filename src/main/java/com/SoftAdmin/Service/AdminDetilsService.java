package com.SoftAdmin.Service;

import java.util.List;

import com.SoftAdmin.bean.Admindetils;
import com.SoftAdmin.bean.Udetils;

public interface AdminDetilsService {

	Admindetils getAllAdminDetils(String username);

	void updateAdmin(String username, String phone, String email, String urlimg);

	List<Admindetils> getAllAdmin(Integer beforelimit, Integer afterlimit);	

	Admindetils getAdmindetilsWhichUseToEdit(String username);

	boolean updateAdmindetilsByphone(Admindetils admindetils);

	boolean addNewAdmin(Admindetils ad);

	boolean deleteUser(String username);

	Admindetils selectAdminByName(String username);

}
