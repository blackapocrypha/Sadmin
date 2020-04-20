package com.SoftAdmin.controller;

import java.util.Calendar;
import java.util.List;
import java.util.TimeZone;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.SoftAdmin.Service.AdminTalkRoomService;
import com.SoftAdmin.Service.SoftAdminService;
import com.SoftAdmin.bean.Admintalkroom;
import com.SoftAdmin.bean.Softadmin;

@Controller
@RequestMapping("/AdminChat")
public class AdminChatRoomController {

	//东八区时间
	Calendar c = Calendar.getInstance(TimeZone.getTimeZone("GMT+08:00"));
	
	@Resource
	private SoftAdminService softAdminService;
	   
	@Resource
	private AdminTalkRoomService adminTalkRoomService;
	
	//获取全部在线管理员信息
	@RequestMapping(path = "getAllOnlineAdmin")
	@ResponseBody
	public List<Softadmin> getAllOnlineAdmin(){
		List<Softadmin> list = softAdminService.getAllOnlineAdmin();
		return list;
	}
	
	//获取今日全部留言信息
	@RequestMapping(path = "getAllMessage")
	@ResponseBody
	public List<Admintalkroom> getAllMessage(){
		Integer cha = c.get(Calendar.DAY_OF_MONTH)-5;
		//清理过往记录
		if(cha>0) {
			//只保留过去五天和今天的记录
			adminTalkRoomService.clearOldMessage(cha,cha+1,cha+2,cha+3,cha+4,cha+5);
		}
		if(c.get(Calendar.DAY_OF_MONTH)==1) {
			//月初清空
			adminTalkRoomService.clearOldMessageClear(1);
		}
		
		String month = (c.get(Calendar.MONTH)+1)+"";
		String day = c.get(Calendar.DAY_OF_MONTH)+"";
		List<Admintalkroom> list = adminTalkRoomService.getAllMessage(month,day);
		return list;
	}
	
	//获取本周全部留言信息
		@RequestMapping(path = "getAllTalk")
		@ResponseBody
		public List<Admintalkroom> getAllTalk(){					
			List<Admintalkroom> list = adminTalkRoomService.getAllTalk();
			return list;
		}
		
		//获取全部留言数量
		@RequestMapping(path = "getNumberOfTalk")
		@ResponseBody
		public Integer getNumberOfTalk(){					
			Integer num = adminTalkRoomService.getNumberOfTalk();
			return num;
		}
	
	//插入留言
	@RequestMapping(path = "insertMessage")
	@ResponseBody
	public String insertMessage(String username,String messageToSend){
		//声明对象保存当前时间
		Admintalkroom admin = new Admintalkroom();
		admin.setYear(c.get(Calendar.YEAR)+"");
		admin.setMonth((c.get(Calendar.MONTH)+1)+"");
		admin.setDay(c.get(Calendar.DAY_OF_MONTH)+"");
		admin.setHour(c.get(Calendar.HOUR_OF_DAY)+"");
		admin.setMinute(c.get(Calendar.MINUTE)+"");
		admin.setMessageToSend(messageToSend);
		admin.setUsername(username);
		
		System.out.println("username"+(c.get(Calendar.MONTH)+1)+"");
		System.out.println("messageToSend"+messageToSend);
		String status=null;
		//查看用户是否真实存在
		Boolean flag = softAdminService.checkAdminIsExit(username);
		if(flag) {
			Boolean flag1 = adminTalkRoomService.insert(admin);
			if(flag1) {
				status = "1";
			}else {
				status = "0";
			}
		}
		return status;
	}
	
}
