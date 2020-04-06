package com.SoftAdmin.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.SoftAdmin.Service.SoftAdminService;
import com.SoftAdmin.bean.Softadmin;
import com.SoftAdmin.util.JsonResult;

@Controller
@RequestMapping("/SAC")
public class SoftAdminController {

	@Resource
	private SoftAdminService softAdminService;
	
	//登录实现
	@RequestMapping(path = "adminLogin")
	@ResponseBody
	public JsonResult adminLogin(Softadmin softadmin) {
		Softadmin soft = softAdminService.login(softadmin);
		JsonResult jsonResult;
		if(soft!=null) {
			jsonResult = new JsonResult(JsonResult.STATUS_SUCCESS,"",soft);
		}else {		
			jsonResult = new JsonResult(JsonResult.STATUS_ERROR,"用户名或密码错误",null);
		}
		return jsonResult;
	}
	
	
	
	
	
	
}
