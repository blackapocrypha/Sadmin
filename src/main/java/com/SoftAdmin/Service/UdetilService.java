package com.SoftAdmin.Service;

import java.util.List;

import com.SoftAdmin.bean.Udetils;
import com.SoftAdmin.bean.Users;

public interface UdetilService {

	List<Udetils> getAllUsers(Integer beforelimit,Integer afterlimit);

	Udetils getUdetilsWhichUseToEdit(String username);

	boolean updateUdetilsByUphone(Udetils udetils);

	boolean addNewUser(String fname, String username);

	boolean deleteUser(String username);

	Udetils selectUsersByName(String username);

	

	

}
