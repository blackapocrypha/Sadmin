package com.SoftAdmin.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.SoftAdmin.Service.BlogMusicService;
import com.SoftAdmin.bean.Blogagame;
import com.SoftAdmin.bean.Blogmusic;

@Controller
@RequestMapping("/Bmusic")
public class BlogMusicController {

	private static Integer page=1;
	
	@Resource
	private BlogMusicService blogMusicService;
	
	@RequestMapping(path = "getAllmusic")
	@ResponseBody
	public List<Blogmusic> getAllmusic(Integer number){
		number=page;
		Integer beforelimit = (number-1)*5;
		Integer afterlimit = 5;
		List<Blogmusic> music = blogMusicService.getAllmusic(beforelimit,afterlimit);
		return music;
	}
	
	/*打印下方多少脚标*/
	@RequestMapping(value = "howmanymusic")
	@ResponseBody
	public Integer howmanymusic() {
		Integer nu = (blogMusicService.howmanymusic()+4)/5;
		if(nu>5) {nu=5;}
		return nu;
	}
	
	//改变脚标
	@RequestMapping(value = "changePage")
	public String changePage(Integer num) {
		page=num;
		return "redirect:/Blog_music.jsp";
	}
	
	//获取page
	@RequestMapping(value = "returnPage")
	@ResponseBody
	public Integer returnPage() {
		return page;
	}
	
	//根据id获取内容
	@RequestMapping(value = "memberedit")
	@ResponseBody
	public Blogmusic memberedit(Integer nid) {
		
		return blogMusicService.memberedit(nid);
	}
	
	//更新music
	@RequestMapping(value = "updateMusic")
	@ResponseBody
	public String updateMusic(Blogmusic bmusic) {
		Boolean flag = blogMusicService.updateMusic(bmusic);
		if(flag) {
			return "1";
		}else {
			return "0";
		}
	}
	
	
	//添加
	@RequestMapping(value = "addmusic")
	public String addmusic(Blogmusic bmusic) {
		Boolean flag = blogMusicService.addmusic(bmusic);
		if(flag) {
			return "redirect:/status/addsuccess.html";
		}else {
			return "redirect:/statuc/editerror.html";
		}
	}
	
	//删除app
	@RequestMapping(path = "deletemusic")
	@ResponseBody
	public String deletemusic(Integer nid) {
		Boolean flag = blogMusicService.deletemusic(nid);
		if(flag) {return "1";}
		else {
			return "0";
		}}
	
	  //模糊搜索按钮
		@RequestMapping(path = "selectmusicByName")
		@ResponseBody
		public Blogmusic selectmusicByName(String appname) {
			Blogmusic blogmusic = blogMusicService.selectmusicByName(appname);
			return blogmusic;
		}
		
		/*音乐总数*/
		@RequestMapping(value = "musicnumber")
		@ResponseBody
		public Integer musicnumber() {
			return blogMusicService.howmanymusic();
		}
}
