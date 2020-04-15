package com.SoftAdmin.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.SoftAdmin.Service.BlogToolsService;
import com.SoftAdmin.bean.Blogtools;

@RequestMapping(path = "/Blog")
@Controller
public class BlogToolController {

	//变量用于控制查询第几页
	private static Integer page=1;
	
	@Resource
	private BlogToolsService blogToolsService;
	
	//方法用于打印获取数据到页面
	@RequestMapping(path = "getAllBlogOnlineTools")
	@ResponseBody
	public List<Blogtools> getAllBlogOnlineTools(Integer number){
		number=page;
		//用于指定limit查询多少数据
		Integer beforelimit = (number-1)*10;
		Integer afterlimit = 10;
		List<Blogtools> list = blogToolsService.getAllBlogOnlineTools(beforelimit,afterlimit);
		return list;
	}
	
	//改变脚标
	@RequestMapping(value = "changePage")
	public String changePage(Integer num) {
		page=num;
		return "redirect:/Blog_onlinetools.jsp";
	}
	
	//获取page
	@RequestMapping(value = "returnPage")
	@ResponseBody
	public Integer returnPage() {
		return page;
	}
	
	//打印下方多少脚标
		@RequestMapping(value = "howmanywebs")
		@ResponseBody
		public Integer howmanywebs() {
			Integer nu = (blogToolsService.howmanywebs()+9)/10;
			if(nu>10) {nu=10;}
			return nu;
		}
		
	   //点击编辑打印相关信息	
		@RequestMapping(path = "memberedit")
		@ResponseBody
		public Blogtools memberedit(Integer nid) {
			Blogtools tools = blogToolsService.memberedit(nid);
			return tools;
		}	
		
		//更新编辑
		@RequestMapping(path = "updateToolsByid")
		public String updateToolsByid(Blogtools blogtools) {
			Boolean flag = blogToolsService.updateToolsByid(blogtools);
			if(flag) {return "redirect:/status/editsuccess.html";}
			else {
				return "redirect:/status/editerror.html";
			}
		}	
		
		//添加新网站	
		@RequestMapping(path = "addnewwebsite")
		public String addnewwebsite(Blogtools blogtools) {
			Boolean flag = blogToolsService.addnewwebsite(blogtools);
			if(flag) {return "redirect:/status/addsuccess.html";}
			else {
				return "redirect:/status/editerror.html";
			}
		}	
		
		//删除网站
		@RequestMapping(path = "deleteWeb")
		@ResponseBody
		public String deleteWeb(Integer nid) {
			Boolean flag = blogToolsService.deleteWeb(nid);
			if(flag) {return "yes";}
			else {
				return "no";
			}
		}
		
		//模糊搜索按钮
		@RequestMapping(path = "selectWebByName")
		@ResponseBody
		public Blogtools selectWebByName(String webname) {
			Blogtools blog = blogToolsService.selectWebByName(webname);
			return blog;
		}
		
		//网站数	
		@RequestMapping(value = "getAlltoolsNumber")
		@ResponseBody
		public Integer getAlltoolsNumber() {

				return blogToolsService.howmanywebs();
		}
		
		
}
