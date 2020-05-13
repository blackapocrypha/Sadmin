package com.SoftAdmin.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.SoftAdmin.Service.BlogPCgameService;
import com.SoftAdmin.bean.Blogagame;
import com.SoftAdmin.bean.Blogpcgame;

@Controller
@RequestMapping("/Bpcgame")
public class BlogPCgameController {

	private static Integer page=1;
	
	@Resource
	private BlogPCgameService blogPCgameService;
	
	@RequestMapping(path = "getAllpcgames")
	@ResponseBody
	public List<Blogpcgame> getAllpcgames(Integer number){
		number=page;
		Integer beforelimit = (number-1)*5;
		Integer afterlimit = 5;
		List<Blogpcgame> pcgame = blogPCgameService.getAllpcgames(beforelimit,afterlimit);
		return pcgame;
	}
	
	/*打印下方多少脚标*/
	@RequestMapping(value = "howmanypcgame")
	@ResponseBody
	public Integer howmanypcgame() {
		Integer nu = (blogPCgameService.howmanypcgame()+4)/5;
		if(nu>5) {nu=5;}
		return nu;
	}
	
	//改变脚标
	@RequestMapping(value = "changePage")
	public String changePage(Integer num) {
		page=num;
		return "redirect:/Blog_pcgame.jsp";
	}
	
	//获取page
	@RequestMapping(value = "returnPage")
	@ResponseBody
	public Integer returnPage() {
		return page;
	}
	
	
	//根据id获取信息
	@RequestMapping(value = "memberedit")
	@ResponseBody
	public Blogpcgame memberedit(Integer nid) {
		Blogpcgame bpcgame = blogPCgameService.memberedit(nid);
		return bpcgame;
	}
	
	
	//更新
		@RequestMapping(value = "updatepcgameByid")
		@ResponseBody
		public String updatepcgameByid(Blogpcgame bpcgame) {
			Boolean flag = blogPCgameService.updatepcgameByid(bpcgame);
			if(flag) {
				return "1";
			}else {
				return "0";
			}
		}
	
		
		//添加
		@RequestMapping(value = "addnewpcgame")
		public String addnewpcgame(Blogpcgame bpcgame) {
			Boolean flag = blogPCgameService.addnewpcgame(bpcgame);
			if(flag) {
				return "redirect:/status/addsuccess.html";
			}else {
				return "redirect:/status/editerror.html";
			}
		}
		
		//删除
		@RequestMapping(path = "deletegames")
		@ResponseBody
		public String deletegames(Integer nid) {
			Boolean flag = blogPCgameService.deletegames(nid);
			if(flag) {return "1";}
			else {
				return "0";
			}}
		
		
		  //模糊搜索按钮
			@RequestMapping(path = "selectpcgameByName")
			@ResponseBody
			public Blogpcgame selectpcgameByName(String appname) {
				Blogpcgame blogpcgame = blogPCgameService.selectpcgameByName(appname);
				return blogpcgame;
			}
		
}
