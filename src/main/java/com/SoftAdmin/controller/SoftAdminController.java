package com.SoftAdmin.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.SoftAdmin.Service.BlogAndroidAppMessageService;
import com.SoftAdmin.Service.BlogAndroidGameMessageService;
import com.SoftAdmin.Service.BlogMusicMessageService;
import com.SoftAdmin.Service.BlogPCgameMessageService;
import com.SoftAdmin.Service.BlogToolMessageService;
import com.SoftAdmin.Service.BlogTxtMessageService;
import com.SoftAdmin.Service.SoftAdminService;
import com.SoftAdmin.Service.UsersService;
import com.SoftAdmin.bean.Softadmin;
import com.SoftAdmin.util.JsonResult;

@Controller
@RequestMapping("/SAC")
public class SoftAdminController {

	@Resource
	private SoftAdminService softAdminService;
	
	@Resource
	private UsersService usersService;
	
	//在线工具
	@Resource
	private BlogToolMessageService blogToolMessageService;
	
	//安卓软件
	@Resource
	private BlogAndroidAppMessageService blogAndroidAppMessageService;
	
	//安卓游戏
	@Resource
    private BlogAndroidGameMessageService blogAndroidGameMessageService;
	
	//电子书籍
	@Resource
	private BlogTxtMessageService blogTxtMessageService;
	
	//电脑游戏
	@Resource
	private BlogPCgameMessageService blogPCgameMessageService;
	
	//音乐资源
	@Resource
	private BlogMusicMessageService blogMusicMessageService;
	
	
	//登录实现
	@RequestMapping(path = "adminLogin")
	@ResponseBody
	public JsonResult adminLogin(Softadmin softadmin,HttpSession session) {
		Softadmin soft = softAdminService.login(softadmin);
		List<Softadmin> list = new ArrayList();
		list.add(soft);
		JsonResult jsonResult;
		if(soft!=null) {
			jsonResult = new JsonResult(JsonResult.STATUS_SUCCESS,"",soft);
			session.setAttribute("admin",list);
		}else {		
			jsonResult = new JsonResult(JsonResult.STATUS_ERROR,"用户名或密码错误",null);
		}
		return jsonResult;
	}
	
	
	//注销方法
	@RequestMapping("logout")
	public String  logout(HttpSession session) {
		//清除缓存中的数据
		session.removeAttribute("admin");	
		return "redirect:/login.jsp";
	}
	
	//获取留言总数
	@RequestMapping("getAllLeaveMessage")
	@ResponseBody
	public Integer getAllLeaveMessage() {
		Integer toolmessage = blogToolMessageService.howmanymessages();
		Integer androidappmessage =blogAndroidAppMessageService.howmanymessages();
		Integer androidgamemessage = blogAndroidGameMessageService.howmanymessages();
		Integer txtmessage = blogTxtMessageService.howmanymessages();
		Integer pcgamemessage =  blogPCgameMessageService.howmanymessages();
		Integer musicmessage = blogMusicMessageService.howmanymessages();
		Integer sum=toolmessage+androidappmessage+androidgamemessage+txtmessage+pcgamemessage+musicmessage;
		return sum;
	}
	
	//获取用户数量
	@RequestMapping("getAllUsersThis")
	@ResponseBody
	public Integer getAllUsersThis() {
		Integer sum = usersService.howmanyusers();
		return sum;
	}
	
	
}
