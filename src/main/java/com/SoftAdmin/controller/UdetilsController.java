package com.SoftAdmin.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.SoftAdmin.Service.UdetilService;
import com.SoftAdmin.bean.Udetils;

@Controller
@RequestMapping("/Udetil")
public class UdetilsController {

	@Resource
	private UdetilService udetilService;
	
	@RequestMapping(path = "updateUdetilsByUphone")
	public String updateUdetilsByUphone(Udetils udetils) {

		boolean flag = udetilService.updateUdetilsByUphone(udetils);
		if(flag) {
			return "redirect:/status/editsuccess.html";
		}else {
			return "redirect:/status/editerror.html";
		}
	}
	
}
