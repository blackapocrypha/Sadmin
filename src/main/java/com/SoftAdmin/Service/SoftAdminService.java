package com.SoftAdmin.Service;

import java.util.List;

import com.SoftAdmin.bean.Admindetils;
import com.SoftAdmin.bean.Softadmin;

public interface SoftAdminService {

	Softadmin login(Softadmin softadmin);

	List<Softadmin> getAllOnlineAdmin();

	Boolean checkAdminIsExit(String username);

	void adminOnLine(String username);

	void adminOutLine(String uname);

	Softadmin getPowerOfUser(String username);

	void updatePass(String username, String encodepass, String urlimg);

	List<Softadmin> getAllAdmin(Integer beforelimit, Integer afterlimit);

	int howmanyadmin();

	boolean updateAdmindetilsByphone(String username, String urlimg);

	Boolean updatePasswordByUsername(Softadmin soft);

	boolean deleteUser(String username);

	boolean addNewAdmin(Softadmin soft);

	

}
