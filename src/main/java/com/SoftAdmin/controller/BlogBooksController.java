package com.SoftAdmin.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.SoftAdmin.Service.BlogBooksService;
import com.SoftAdmin.bean.Blogagame;
import com.SoftAdmin.bean.Blogtxt;

@Controller
@RequestMapping("/BBook")
public class BlogBooksController {

	private static Integer page=1;
	
	@Resource
	private BlogBooksService blogBooksService;
	

	@RequestMapping(path = "getAllBooks")
	@ResponseBody
	public List<Blogtxt> getAllBooks(Integer number){
		number=page;
		Integer beforelimit = (number-1)*5;
		Integer afterlimit = 5;
		List<Blogtxt> btxt = blogBooksService.getAllBooks(beforelimit,afterlimit);
		return btxt;
	}
	
	/*打印下方多少脚标*/
	@RequestMapping(value = "howmanybooks")
	@ResponseBody
	public Integer howmanybooks() {
		Integer nu = (blogBooksService.howmanybooks()+4)/5;
		if(nu>5) {nu=5;}
		return nu;
	}
	
	//改变脚标
	@RequestMapping(value = "changePage")
	public String changePage(Integer num) {
		page=num;
		return "redirect:/Blog_books.jsp";
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
	public Blogtxt memberedit(Integer nid) {
		return blogBooksService.memberedit(nid);
	}
	
	//根据id修改
	@RequestMapping(value = "updatebookByid")
	public String updatebookByid(Blogtxt bt) {
		Boolean flag =  blogBooksService.updatebookByid(bt);
		if(flag) {
			return "redirect:/status/editsuccess.html";
		}else {
			return "redirect:/status/editerror.html";
		}
	}
	
	//添加新书籍
	@RequestMapping(value = "addnewbook")
	public String addnewbook(Blogtxt bt) {
		Boolean flag =  blogBooksService.addnewbook(bt);
		if(flag) {
			return "redirect:/status/editsuccess.html";
		}else {
			return "redirect:/status/editerror.html";
		}
	}
	
	
	   //删除书籍
		@RequestMapping(path = "deletebooks")
		@ResponseBody
		public String deletebooks(Integer nid) {
			Boolean flag = blogBooksService.deletebooks(nid);
			if(flag) {return "yes";}
			else {
				return "no";
		}}
		
		//模糊搜索按钮
		@RequestMapping(path = "selectbookByName")
		@ResponseBody
		public Blogtxt selectbookByName(String bookname) {
			Blogtxt blogtxt = blogBooksService.selectbookByName(bookname);
			return blogtxt;
		}
	
	
}
