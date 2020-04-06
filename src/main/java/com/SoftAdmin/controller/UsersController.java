package com.SoftAdmin.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.SoftAdmin.Service.UdetilService;
import com.SoftAdmin.Service.UsersService;
import com.SoftAdmin.bean.Udetils;
import com.SoftAdmin.bean.Users;
import com.SoftAdmin.util.MD5Utils;

@Controller
@RequestMapping("/users")
public class UsersController {
	
	private static Integer page=1;
	
	@Resource
	private UsersService usersService;
	
	@Resource
	private UdetilService udetilService;
	
	@RequestMapping(value = "getAllUsersList")
	@ResponseBody
	public Map<String,Object> getAllUsersList(Integer number){
		number=page;
		Integer beforelimit = (number-1)*5;
		Integer afterlimit = (number)*5;
		
		List<Users> users = usersService.getAllUsers(beforelimit,afterlimit);
		List<Udetils> ud = udetilService.getAllUsers(beforelimit,afterlimit);
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("users", users);
		map.put("udetils", ud);
		return map;
	}
	
	//打印下方多少脚标
	@RequestMapping(value = "howmanyusers")
	@ResponseBody
	public Integer howmanyusers() {
		Integer nu = (usersService.howmanyusers()+4)/5;
		if(nu>5) {nu=5;}
		return nu;
	}
	
	//改变脚标
	@RequestMapping(value = "changePage")
	public String changePage(Integer num) {
		page=num;
		return "redirect:/member-list.jsp";
	}
	
	//获取page
	@RequestMapping(value = "returnPage")
	@ResponseBody
	public Integer returnPage() {
		return page;
	}
	

	//获取的修改面板的所有用户信息
	@RequestMapping(value = "memberedit")
	@ResponseBody
	public Udetils memberedit(String username){
	 
		Udetils udetils = udetilService.getUdetilsWhichUseToEdit(username);
		
		return udetils;
	}
	
	
	//根据账号获取用户密码
	@RequestMapping(value = "getUserMessageByUsername")
	@ResponseBody
	public Users getUserMessageByUsername(String username){
		Users users = usersService.getUsersByUsername(username);		
		return users;
	}
	
	//更新密码按钮
	@RequestMapping(value = "updatePasswordByUsername")
	public String updatePasswordByUsername(Users user) {
		user.setPassword(MD5Utils.GetMD5Code(user.getPassword(), true));
		boolean flag = usersService.updatePasswordByUsername(user);
		if(flag) {
			return "redirect:/status/editsuccess.html";
		}else {
			return "redirect:/status/editerror.html";
		}
	}
	
	
	//删除用户
	@RequestMapping(value = "deleteUser")
	@ResponseBody
	public String deleteUser(String username) {
		boolean flag2 = udetilService.deleteUser(username);
		boolean flag = usersService.deleteUser(username);
		if(flag && flag2) {
			return "true";
		}else {
			return "false";
		}
		
	}
	
	//添加用户
	@RequestMapping(value = "addNewUser")
	@ResponseBody
	public String addNewUser(Users user,String fname) {	
		boolean flag = usersService.addNewUser(user);
		String username = user.getUsername();
		boolean flag2 = udetilService.addNewUser(fname,username);
		if(flag && flag2) {
			return "true";
		}else {
			return "false";
		}	
	}
	
	//搜索用户
	@RequestMapping(value = "selectUsersByName")
	@ResponseBody
	public Map<String,Object> selectUsersByName(String username){
		Map<String,Object> map = new HashMap<>();
		Users user = usersService.selectUsersByName(username);
		Udetils udetils = udetilService.selectUsersByName(username);
		map.put("user", user);
		map.put("udetils", udetils);
		
		if(user.getUsername() == null && udetils.getUphone() == null) {
			return null;	
		}
		return map;
	}
	
}
