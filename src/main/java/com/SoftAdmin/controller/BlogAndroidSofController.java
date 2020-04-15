package com.SoftAdmin.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.SoftAdmin.Service.BlogAndroidSofService;
import com.SoftAdmin.bean.Blogaapp;
import com.SoftAdmin.bean.Blogtools;

@Controller
@RequestMapping("/Bandroid")
public class BlogAndroidSofController {

	private static Integer page=1;
	
	@Resource
    private BlogAndroidSofService blogAndroidSofService;
	
	@RequestMapping(path = "getAllApp")
	@ResponseBody
	public List<Blogaapp> getAllApp(Integer number){
		number=page;
		Integer beforelimit = (number-1)*5;
		Integer afterlimit = 5;
		List<Blogaapp> bapp = blogAndroidSofService.getAllApp(beforelimit,afterlimit);
		return bapp;
	}
	
	/*打印下方多少脚标*/
	@RequestMapping(value = "howmanyapp")
	@ResponseBody
	public Integer howmanyusers() {
		Integer nu = (blogAndroidSofService.howmanyapp()+4)/5;
		if(nu>5) {nu=5;}
		return nu;
	}
	
	//改变脚标
	@RequestMapping(value = "changePage")
	public String changePage(Integer num) {
		page=num;
		return "redirect:/Blog_androidsof.jsp";
	}
	
	//获取page
	@RequestMapping(value = "returnPage")
	@ResponseBody
	public Integer returnPage() {
		return page;
	}
	
	//memberedit
	@RequestMapping("memberedit")
	@ResponseBody
	public Blogaapp memberedit(Integer nid) {
		Blogaapp bapp = blogAndroidSofService.memberedit(nid);
		return bapp;
	}
	
	//更新软件
	@RequestMapping("updateappByid")
	public String updateappByid(Blogaapp ba) {
		Boolean flag = blogAndroidSofService.updateappByid(ba);
		if(flag) {
			return "redirect:/status/editsuccess.html";
		}else {
			return "redirect:/status/editerror.html";
		}
		
	}
	
	//增加新软件
	@RequestMapping("addnewapp")
	public String addnewapp(Blogaapp ba) {
		Boolean flag = blogAndroidSofService.addnewapp(ba);
		if(flag) {
			return "redirect:/status/addsuccess.html";
		}else {
			return "redirect:/status/editerror.html";
		}	
	}
	
	//删除app
	@RequestMapping(path = "deleteapp")
	@ResponseBody
	public String deleteWeb(Integer nid) {
		Boolean flag = blogAndroidSofService.deleteapp(nid);
		if(flag) {return "yes";}
		else {
			return "no";
		}}
	
	//模糊搜索按钮
	@RequestMapping(path = "selectappByName")
	@ResponseBody
	public Blogaapp selectWebByName(String appname) {
		Blogaapp blogaapp = blogAndroidSofService.selectappByName(appname);
		return blogaapp;
	}
	
	/*软件总数*/
	@RequestMapping(value = "appnum")
	@ResponseBody
	public Integer appnum() {
		return blogAndroidSofService.howmanyapp();
	}
	
}
