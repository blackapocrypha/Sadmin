package com.SoftAdmin.controller;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.SoftAdmin.Service.AdminDetilsService;
import com.SoftAdmin.Service.SoftAdminService;
import com.SoftAdmin.bean.Admindetils;
import com.SoftAdmin.bean.Softadmin;
import com.SoftAdmin.bean.Udetils;
import com.SoftAdmin.util.MD5Utils;

@Controller
@RequestMapping("/AdminDetil")
public class AdminDetilsController {

	@Resource
	private AdminDetilsService adminDetilsService;
	
	@Resource
	private SoftAdminService SoftAdminService;
	
	//获取管理员信息
	@RequestMapping(path = "getAllAdminDetils")
	@ResponseBody
	public Map<String,Object> getAllAdminDetils(String username) {
		//声明map
		Map map = new HashMap<String,Object>();	
		Softadmin power = SoftAdminService.getPowerOfUser(username);
		Admindetils ad = adminDetilsService.getAllAdminDetils(username);
		map.put("power", power);
		map.put("ad", ad);
		
		return map;
	}
	
	//更新用户信息
	@RequestMapping(path = "editUDetils")
	@ResponseBody
	public String editUDetils(String username,String phone,String email,String password,String urlimg) {
		adminDetilsService.updateAdmin(username,phone,email,urlimg);
		String encodepass = MD5Utils.GetMD5Code(password, true);
		SoftAdminService.updatePass(username,encodepass,urlimg);
		return null;	
	}
	
	//更新管理员信息
	@RequestMapping(path = "updateAdmindetilsByphone")
	@ResponseBody
	public String updateUdetilsByUphone(Admindetils admindetils) {

		boolean flag = adminDetilsService.updateAdmindetilsByphone(admindetils);
		boolean flag1 = SoftAdminService.updateAdmindetilsByphone(admindetils.getUsername(),admindetils.getUrlimg());
		if(flag && flag1) {
			return "1";
		}else {
			return "2";
		}
	}
}
