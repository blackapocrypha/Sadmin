package com.SoftAdmin.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.SoftAdmin.Service.SoftListService;
import com.SoftAdmin.Service.SoftPageService;
import com.SoftAdmin.bean.Softlist;
import com.SoftAdmin.bean.Softpage;
import com.SoftAdmin.bean.Udetils;

@Controller
@RequestMapping("/Soft")
public class SoftController {

	private static Integer page=1;
	
	@Resource
	private SoftListService softListService;
	
	@Resource
	private SoftPageService softPageService;
	
	
	@RequestMapping(path = "getAllSoft")
	@ResponseBody
	public List<Softlist> getAllSoft(Integer number) {
		number=page;
		Integer beforelimit = (number-1)*5;//用于指定limit
		Integer afterlimit = 5;
		 List<Softlist> soft = softListService.getAllSoft(beforelimit,afterlimit);
		return soft;
	}
	
	//改变脚标
		@RequestMapping(value = "changePage")
		public String changePage(Integer num) {
			page=num;
			return "redirect:/Soft-list.jsp";
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
		public Softlist memberedit(String sid){
		 
			Softlist soft = softListService.getSoftDis(sid);
			
			return soft;
		}
		
		@RequestMapping(path = "updateSoft")
		public String updateSoft(Softlist soft) {

			boolean flag = softListService.updateSoft(soft);
			Softpage sp = new Softpage();
			sp.setSoftid(soft.getSid());
			sp.setSoftname(soft.getSoftname());
			sp.setUrl(soft.getImgurl());
			boolean flag1 = softPageService.updateSoft(sp);
			if(flag && flag1) {
				return "redirect:/status/editsuccess.html";
			}else {
				return "redirect:/status/editerror.html";
			}
		}
	
}
