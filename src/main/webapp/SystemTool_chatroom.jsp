<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html lang="en" >
<head>
  <meta charset="UTF-8">
  <title>Chat Widget</title>
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/meyer-reset/2.0/reset.min.css">
<link rel='stylesheet' href='https://maxcdn.bootstrapcdn.com/font-awesome/4.4.0/css/font-awesome.min.css'>
<link rel="stylesheet" href="./css/chatroomstyle.css">
 <script src="http://47.94.83.36/tools/js/jquery-3.4.1.min.js"></script>
 <style>
 #hidenusername11{display:none;}
 #selectdata{border:0px;}
 #textwarning{float:right;opacity:0.2;cursor:hand}
 </style>
</head>
<body>
 <c:forEach items="${sessionScope.admin}" var="p" >
		<span id="hidenusername">
			${p.username}
		</span>
</c:forEach>    
<script>
$(function(){
		
//获取在线成员
$.ajax({
	type:"post",
	url:"AdminChat/getAllOnlineAdmin",
	dataType:"json",
	async:false,
	success:function(rs){
	$.each(rs,function(index,item){
		$("#useronline").append("<li class='clearfix'>"
		           +"<img src='"+item.urlimg+"' alt='avatar' />"
		           +"<div class='about'>"
		           +"<div class='name'>"+item.username+"</div>"
		           +"<div class='status'>"
		           +"<i class='fa fa-circle online'></i> online"
		           +"</div> </div>"
		           +"</li>");			
	   });			
	}	
 })


 //留言总数
 $.ajax({
	type:"post",
	url:"AdminChat/getNumberOfTalk",
	dataType:"json",
	async:false,
	success:function(rs){
			$("#countMessage").html(rs);	
	}	
 })

 
//获取今日留言
$.ajax({
	type:"post",
	url:"AdminChat/getAllMessage",
	dataType:"json",
	async:false,
	success:function(rs){
		var zone;
	$.each(rs,function(index,item){
		if(parseInt(item.hour)>12){zone ="AM";}else{zone ="PM";}
	if($.trim($("#hidenusername").text())==item.username){//如果是自己的留言
		
		$("#messagebox").append(" <li class='clearfix'>"
	    +" <div class='message-data align-right'>"
        +"<span class='message-data-time' >"+item.hour+":"+item.minute+" "+zone+","+item.month+"月"+item.day+"日</span> &nbsp; &nbsp;"
        +"<span class='message-data-name' >"+item.username+"</span> <i class='fa fa-circle me'></i>"
        +"</div><div class='message other-message float-right'>"
        +item.messageToSend+"</div>"
        +"</li>");			
  
	  }else{//如果不是本用户自己的留言	  
		$("#messagebox").append("<li>"
		        +"<div class='message-data'>"
		        +"<span class='message-data-name'><i class='fa fa-circle online'></i> "+item.username+"</span>"
		        +"<span class='message-data-time'>"+item.hour+":"+item.minute+" "+zone+" "+item.month+"月"+item.day+"日</span></div>"     
		        +"<div class='message my-message'>"
		        +""+item.messageToSend+"</div>"       
		        +"</li>");
	  }
	
	  });//$.each end
	}//end success
 });//end ajax

 //赋值给表单
$("#hidenusername11").val($.trim($("#hidenusername").text()));
 
 
});
</script>
<!-- partial:index.partial.html -->
  <div class="container clearfix">
  <span id="textwarning">本模块只保存最近五天的聊天记录</span>
    <div class="people-list" id="people-list">
      <div class="search">
        <input type="day" placeholder="管理员列表" disabled="disabled"/>
        
      </div>
      <ul class="list" id="useronline">
          
      </ul>
    </div>
    
    <div class="chat">
      <div class="chat-header clearfix">
        
        
        <div class="chat-about">
          <div class="chat-with">管理员聊天室</div>
          <div class="chat-num-messages">共计<span id="countMessage"></span>条消息</div>
        </div>
        	
       
      </div> <!-- end chat-header -->
      
      <div class="chat-history">
        <ul id="messagebox">
         
          <!--   
          <li>
            <div class="message-data">
              <span class="message-data-name"><i class="fa fa-circle online"></i> Vincent</span>
              <span class="message-data-time">10:12 AM, Today</span>
            </div>
            <div class="message my-message">
              Are we meeting today? Project has been already finished and I have results to show you.
            </div>
          </li>-->
         
        
          
        
          
          
        </ul>
        
      </div> <!-- end chat-history -->
      
      <div class="chat-message clearfix">
       <form  id="form1" method="post">
       <input type="text" id="hidenusername11" value="">
        <textarea name="message-to-send" id="messagetosend" placeholder ="请输入..." rows="3"></textarea>
       </form>      
        <a href="javascript:;" onclick="getAllTalk()" title="显示全部聊天记录"><i class="fa fa-file-o" ></i></a> &nbsp;&nbsp;&nbsp;
      
        
        <button id="sendMessage" onclick="send()">Send</button>

      </div> <!-- end chat-message -->
      
    </div> <!-- end chat -->
    
  </div> <!-- end container -->


<!-- partial -->
<script src="https://www.jq22.com/jquery/jquery-1.10.2.js"></script>
<script src='./js/handlebars.min.js'></script>
<script src='./js/list.min.js'></script>
<script  src="./js/script.js"></script>
<script>
function send(){
	//存在登录用户
	if($.trim($("#hidenusername").text())!=null && $.trim($("#hidenusername").text())!=""){
		//发送内容不为空
		if($("#messagetosend").val()==null ||$("#messagetosend").val()=="" ){return false;}
		
		
		var data = {"username":$("#hidenusername11").val(),"messageToSend":$("#messagetosend").val()};
		$.ajax({
			type:"post",
			data:data,
			url:"AdminChat/insertMessage",
			dataType:"json",
			async:true,
			success:function(rs){
				if(rs=="1"){
					getMessageToRoom();
				}
			}
			
		})
	}
}

function getMessageToRoom(){
	$("#messagebox").html("");
	//获取今日留言
	$.ajax({
		type:"post",
		url:"AdminChat/getAllMessage",
		dataType:"json",
		async:true,
		success:function(rs){
			var zone;
		$.each(rs,function(index,item){
			if(parseInt(item.hour)>12){zone ="AM";}else{zone ="PM";}
			if($("#hidenusername").html()==item.username){//如果是自己的留言
			$("#messagebox").append(" <li class='clearfix'>"
		    +" <div class='message-data align-right'>"
	        +"<span class='message-data-time' >"+item.hour+":"+item.minute+"  "+zone+" "+item.month+"月"+item.day+"日</span> &nbsp; &nbsp;"
	        +"<span class='message-data-name' >"+item.username+"</span> <i class='fa fa-circle me'></i>"
	        +"</div><div class='message other-message float-right'>"
	        +item.messageToSend+"</div>"
	        +"</li>");			
	  
		  }else{//如果不是本用户自己的留言
			
			  $("#messagebox").append("<li>"
				        +"<div class='message-data'>"
				        +"<span class='message-data-name'><i class='fa fa-circle online'></i> "+item.username+"</span>"
				        +"<span class='message-data-time'>"+item.hour+":"+item.minute+" "+zone+" "+item.month+"月"+item.day+"日</span></div>"     
				        +"<div class='message my-message'>"
				        +""+item.messageToSend+"</div>"       
				        +"</li>");
		  }
		
		  });//$.each end
		}//end success
	 });//end ajax
	 //清空发言
  $("#messagetosend").html("");
}
$("#textwarning").click(function(){
	$("#textwarning").css("opacity",0);
})

//获取本周留言
function getAllTalk(){
	$("#messagebox").html("");
	//获取本周留言
	$.ajax({
		type:"post",
		url:"AdminChat/getAllTalk",
		dataType:"json",
		async:true,
		success:function(rs){
			var zone;
		$.each(rs,function(index,item){
			if(parseInt(item.hour)>12){zone ="AM";}else{zone ="PM";}
			if($("#hidenusername").html()==item.username){//如果是自己的留言
			$("#messagebox").append(" <li class='clearfix'>"
		    +" <div class='message-data align-right'>"
	        +"<span class='message-data-time' >"+item.hour+":"+item.minute+"  "+zone+" "+item.month+"月"+item.day+"日</span> &nbsp; &nbsp;"
	        +"<span class='message-data-name' >"+item.username+"</span> <i class='fa fa-circle me'></i>"
	        +"</div><div class='message other-message float-right'>"
	        +item.messageToSend+"</div>"
	        +"</li>");			
	  
		  }else{//如果不是本用户自己的留言
			
			  $("#messagebox").append("<li>"
				        +"<div class='message-data'>"
				        +"<span class='message-data-name'><i class='fa fa-circle online'></i> "+item.username+"</span>"
				        +"<span class='message-data-time'>"+item.hour+":"+item.minute+" "+zone+" "+item.month+"月"+item.day+"日</span></div>"     
				        +"<div class='message my-message'>"
				        +""+item.messageToSend+"</div>"       
				        +"</li>");
		  }
		
		  });//$.each end
		}//end success
	 });//end ajax
	 
	 
}
</script>
</body>
</html>