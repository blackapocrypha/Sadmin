package com.SoftAdmin.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.SoftAdmin.Service.TsupportService;
import com.SoftAdmin.bean.Tsupport;

@Controller
@RequestMapping("/Ts")
public class TsupportController {

	@Resource
	private TsupportService tsupportService;
	
	@RequestMapping(path = "getAllTsupport")
	@ResponseBody
	public List<Tsupport> getAllTsupport(){
		List<Tsupport> list = tsupportService.getAllTsupport();
		return list;
	}
	
	@RequestMapping(path = "memberedit")
	@ResponseBody
	public Tsupport memberedit(Integer tid){
		Tsupport list = tsupportService.memberedit(tid);
		return list;
	}
	
	
	@RequestMapping(path = "updateSupport")
	public String updateSupport(Tsupport tsupport){
		boolean  flag = tsupportService.updateSupport(tsupport);
		if(flag) {
			return "redirect:/status/editsuccess.html";
		}else {
			return "redirect:/status/editerror.html";
		}
		
	}
	
}
