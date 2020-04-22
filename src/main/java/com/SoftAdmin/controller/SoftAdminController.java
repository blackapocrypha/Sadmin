package com.SoftAdmin.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.SoftAdmin.Service.AdminDetilsService;
import com.SoftAdmin.Service.BlogAndroidAppMessageService;
import com.SoftAdmin.Service.BlogAndroidGameMessageService;
import com.SoftAdmin.Service.BlogMusicMessageService;
import com.SoftAdmin.Service.BlogPCgameMessageService;
import com.SoftAdmin.Service.BlogToolMessageService;
import com.SoftAdmin.Service.BlogTxtMessageService;
import com.SoftAdmin.Service.SoftAdminService;
import com.SoftAdmin.Service.UsersService;
import com.SoftAdmin.bean.Admindetils;
import com.SoftAdmin.bean.Softadmin;
import com.SoftAdmin.bean.Udetils;
import com.SoftAdmin.bean.Users;
import com.SoftAdmin.util.JsonResult;
import com.SoftAdmin.util.MD5Utils;

@Controller
@RequestMapping("/SAC")
public class SoftAdminController {

	private static Integer page=1;
	
	@Resource
	private SoftAdminService softAdminService;
	
	@Resource
	private AdminDetilsService adminDetilsService;
	
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
	
	private  String uname=null;
	
	//登录实现
	@RequestMapping(path = "adminLogin")
	@ResponseBody
	public JsonResult adminLogin(Softadmin softadmin,HttpSession session) {
		//加密
		softadmin.setPassword(MD5Utils.GetMD5Code(softadmin.getPassword(), true));
		
		Softadmin soft = softAdminService.login(softadmin);
		List<Softadmin> list = new ArrayList();
		list.add(soft);
		JsonResult jsonResult;
		if(soft!=null) {
			jsonResult = new JsonResult(JsonResult.STATUS_SUCCESS,"",soft);
			//存储session
			session.setAttribute("admin",list);
			
			uname = soft.getUsername();
			//更改状态为在线
			softAdminService.adminOnLine(soft.getUsername());
		}else {		
			jsonResult = new JsonResult(JsonResult.STATUS_ERROR,"用户名或密码错误",null);
		}
		return jsonResult;
	}
	
	
	//注销方法
	@RequestMapping("logout")
	public String  logout(HttpSession session) {
		//更改状态为离线
		
		softAdminService.adminOutLine(uname);
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
	
	//获取管理员管理页面信息
	@RequestMapping(value = "getAllAdminList")
	@ResponseBody
	public Map<String,Object> getAllAdminList(Integer number){
		number=page;
		Integer beforelimit = (number-1)*5;
		Integer afterlimit = 5;
		
		List<Softadmin> softadmin = softAdminService.getAllAdmin(beforelimit,afterlimit);
		List<Admindetils> ad = adminDetilsService.getAllAdmin(beforelimit,afterlimit);
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("softadmin",softadmin);
		map.put("admindetil",ad);
		return map;
	}
	

	//打印下方多少脚标
	@RequestMapping(value = "howmanyadmin")
	@ResponseBody
	public Integer howmanyadmin() {
		Integer nu = (softAdminService.howmanyadmin()+4)/5;
		if(nu>5) {nu=5;}
		return nu;
	}
	

	//改变脚标
	@RequestMapping(value = "changePage")
	public String changePage(Integer num) {
		page=num;
		return "redirect:/admin-list.jsp";
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
	public Admindetils memberedit(String username){
	 
		Admindetils admindetils = adminDetilsService.getAdmindetilsWhichUseToEdit(username);
		
		return admindetils;
	}
	
	//超级管理员修改密码
	@RequestMapping(value = "updatePasswordByUsername")
	public String updatePasswordByUsername(Softadmin soft){
		//密码加密
		soft.setPassword(MD5Utils.GetMD5Code(soft.getPassword(),true));
		System.out.println("username is :"+soft.getUsername());
		System.out.println(soft.getPassword());
		Boolean flag = softAdminService.updatePasswordByUsername(soft);
		if(flag) {
			return "redirect:../status/editsuccess.html";
		}else {
			return "redirect:../status/editerror.html";
		}
		
	}
	
	
	//删除用户
	@RequestMapping(value = "deleteUser")
	@ResponseBody
	public String deleteUser(String username) {
		boolean flag2 = softAdminService.deleteUser(username);
		boolean flag = adminDetilsService.deleteUser(username);
		if(flag && flag2) {
			return "true";
		}else {
			return "false";
		}
		
	}
	
	//添加用户
	@RequestMapping(value = "addNewAdmin")
	@ResponseBody
	public String addNewAdmin(Softadmin soft) {
		//同时准备开辟用户详情
		Admindetils ad = new Admindetils();
		ad.setUsername(soft.getUsername());
		ad.setUrlimg(soft.getUrlimg());
		//密码加密
		soft.setPassword(MD5Utils.GetMD5Code(soft.getPassword(), true));
		//插入管理表
		boolean flag = softAdminService.addNewAdmin(soft);
		//插入管理详情表
		boolean flag2 = adminDetilsService.addNewAdmin(ad);
		if(flag) {
			return "true";
		}else {
			return "false";
		}	
	}
	
	
	//搜索用户
	@RequestMapping(value = "selectAdminByName")
	@ResponseBody
	public Map<String,Object> selectAdminByName(String username){
		Map<String,Object> map = new HashMap<>();
		Softadmin soft = softAdminService.selectAdminByName(username);
		Admindetils ad = adminDetilsService.selectAdminByName(username);
		map.put("soft", soft);
		map.put("ad", ad);
		
		if(soft.getUsername() == null && ad.getUsername() == null) {
			return null;	
		}
		return map;
	}
	
	
}
