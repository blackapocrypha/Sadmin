package com.SoftAdmin.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.SoftAdmin.Service.BlogAndroidGameMessageService;
import com.SoftAdmin.bean.BlogAgametalk;


@Controller
@RequestMapping("/BandroidgameM")
public class BlogAndroidGameMessageController {

	private static Integer page=1;
	
	@Resource
    private BlogAndroidGameMessageService blogAndroidGameMessageService;
	
	//获取所有留言
		@RequestMapping(path = "getAllToolMessage")
		@ResponseBody
		public List<BlogAgametalk> getAllToolMessage(Integer number){
			number=page;
			Integer beforelimit = (number-1)*5;
			Integer afterlimit = 5;
			List<BlogAgametalk> btalk = blogAndroidGameMessageService.getAllToolMessage(beforelimit,afterlimit);
			return btalk;
		}
		
		/*打印下方多少脚标*/
		@RequestMapping(value = "howmanymessages")
		@ResponseBody
		public Integer howmanybooks() {
			Integer nu = (blogAndroidGameMessageService.howmanymessages()+4)/5;
			if(nu>5) {nu=5;}
			return nu;
		}
		
		//改变脚标
		@RequestMapping(value = "changePage")
		public String changePage(Integer num) {
			page=num;
			return "redirect:/Blog_androidgameMessage.jsp";
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
		public BlogAgametalk memberedit(Integer nid) {
			BlogAgametalk btalk = blogAndroidGameMessageService.memberedit(nid);
			return btalk;
		}
		
		
		//跟据id更新
			@RequestMapping(value = "updatemessageByid")
			@ResponseBody
			public String updatemessageByid(BlogAgametalk bt) {
				Boolean flag = blogAndroidGameMessageService.updatemessageByid(bt);
				if(flag){
					return "1";
				}else{
					return "0";
				}
			}
		
			
			//根据日期获取规定时间段内的信息
			@RequestMapping(path = "substringBy")
			@ResponseBody
			public List<BlogAgametalk> substringBy(String begintime,String endtime) {
				Integer intendtime = null;
				//将传来的字符格式转为int格式
				Integer intbegintime = Integer.valueOf(begintime.replace("-", ""));
				if(endtime==null || endtime=="" || endtime==" ") {
					
				}else {
					 intendtime = Integer.valueOf(endtime.replace("-", ""));
				}
				//获取所有日期
				List<BlogAgametalk> datalist = blogAndroidGameMessageService.selectAllIdAndTime();
				//声明保存id数组
				List<Integer> idlist=new ArrayList<>();
				for(int i=0;i<datalist.size();i++) {
					//逐个获取时间
					String time1 = datalist.get(i).getTalktime();
					//对数据进行调整使其可判断，可比较
					String month = time1.substring(time1.indexOf("年")+1,time1.lastIndexOf("月"));
					String day = time1.substring(time1.indexOf("月")+1,time1.lastIndexOf("日"));
					if(Integer.valueOf(month)<10) {month = "0"+month;}
					if(Integer.valueOf(day)<10) {day = "0"+day;}
					time1 = time1.substring(0, 4)+"年"+month+"月"+day+"日";
					
					//截取字符串并剔除特定字符转int
					Integer inttime  = Integer.valueOf(((time1.substring(0,time1.indexOf("日"))).replace("年", "")).replace("月", ""));
					//第一种情况：如果截止时间不填
					if(endtime==null || endtime=="" || endtime==" ") {
						if(inttime>=intbegintime) {
							idlist.add(datalist.get(i).getBtid()); 
						}
					}
					//第二种情况：填写了截止时间
					else {
						if(inttime>=intbegintime && inttime<=intendtime) {
							idlist.add(datalist.get(i).getBtid());
						}
					}
				}
				//如果没有元素符合，那直接结束
				if(idlist.isEmpty()) {
					return null;
				}else {
					//查询指定id的留言
					List<BlogAgametalk> selectmessage =  blogAndroidGameMessageService.selectAllChosenByid(idlist);
					
					return selectmessage;	
				}
				
			}
			
			
			@RequestMapping(path = "deletemessage")
			@ResponseBody
			public String deletemessage(Integer nid) {
				Boolean flag = blogAndroidGameMessageService.deletemessage(nid);
				if(flag) {
					return "1";
				}else {
					return "0";
				}
			}	
			
			
	
}
