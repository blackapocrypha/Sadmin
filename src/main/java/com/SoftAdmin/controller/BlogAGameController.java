package com.SoftAdmin.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.SoftAdmin.Service.BlogAGameService;
import com.SoftAdmin.bean.Blogaapp;
import com.SoftAdmin.bean.Blogagame;

@Controller
@RequestMapping("/BAgame")
public class BlogAGameController {

	private static Integer page=1;
	
	@Resource
	private BlogAGameService blogAGameService;
	
	@RequestMapping(path = "getAllAgames")
	@ResponseBody
	public List<Blogagame> getAllAgames(Integer number){
		number=page;
		Integer beforelimit = (number-1)*5;
		Integer afterlimit = 5;
		List<Blogagame> bapp = blogAGameService.getAllAgames(beforelimit,afterlimit);
		return bapp;
	}
	
	/*打印下方多少脚标*/
	@RequestMapping(value = "howmanyagame")
	@ResponseBody
	public Integer howmanyusers() {
		Integer nu = (blogAGameService.howmanyagame()+4)/5;
		if(nu>5) {nu=5;}
		return nu;
	}
	
	//改变脚标
	@RequestMapping(value = "changePage")
	public String changePage(Integer num) {
		page=num;
		return "redirect:/Blog_androidgame.jsp";
	}
	
	//获取page
	@RequestMapping(value = "returnPage")
	@ResponseBody
	public Integer returnPage() {
		return page;
	}
	
	@RequestMapping("memberedit")
	@ResponseBody
	public Blogagame memberedit(Integer nid) {
		Blogagame bloga = blogAGameService.memberedit(nid);
		return bloga;
	}
	
	@RequestMapping("updateagameByid")
	@ResponseBody
	public String updateagameByid(Blogagame bg) {
		Boolean flag = blogAGameService.updateagameByid(bg);
		if(flag) {
			return "1";
		}else {
			return "0";
		}
	}
	
	
	@RequestMapping("addnewandroidgame")
	public String addnewandroidgame(Blogagame bg) {
		Boolean flag = blogAGameService.addnewandroidgame(bg);
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
		Boolean flag = blogAGameService.deletegame(nid);
		if(flag) {return "1";}
		else {
			return "0";
		}}
	
	  //模糊搜索按钮
		@RequestMapping(path = "selectagameByName")
		@ResponseBody
		public Blogagame selectgameByName(String appname) {
			Blogagame blogagame = blogAGameService.selectgameByName(appname);
			return blogagame;
		}
}
