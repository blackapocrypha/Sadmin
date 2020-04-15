<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html class="x-admin-sm">
    <head>
        <meta charset="UTF-8">
        <title>欢迎页面-X-admin2.2</title>
        <meta name="renderer" content="webkit">
        <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
        <meta name="viewport" content="width=device-width,user-scalable=yes, minimum-scale=0.4, initial-scale=0.8,target-densitydpi=low-dpi" />
        <link rel="stylesheet" href="./css/font.css">
        <link rel="stylesheet" href="./css/xadmin.css">
        <script type="text/javascript" src="./lib/layui/layui.js" charset="utf-8"></script>
        <script type="text/javascript" src="./js/xadmin.js"></script>
        <script src="http://47.94.83.36/tools/js/jquery-3.4.1.min.js"></script>
        <style>
        .L_uphone{
        	display:none;
        }
        #kissid{
        	border:0px;
        	border-color:white;
        	height: 30px;
        	display: block;
			width: 100%;
			padding-left: 10px;
			line-height: 1.3;
			border-width: 1px;
			border-style: solid;
			background-color: #fff;
			border-radius: 2px;
			outline: 0;
			-webkit-appearance: none;
			transition: all .3s;
			-webkit-transition: all .3s;
			box-sizing: border-box;}
        
        #kissid:hover{
        border-color: #D2D2D2 ;
        }
        </style>
        <!-- 让IE8/9支持媒体查询，从而兼容栅格 -->
        <!--[if lt IE 9]>
            <script src="https://cdn.staticfile.org/html5shiv/r29/html5.min.js"></script>
            <script src="https://cdn.staticfile.org/respond.js/1.4.2/respond.min.js"></script>
        <![endif]--></head>
    <script>
    $(function(){
    	
    	$.ajax({
    		type:"GET",
    		url:'BandroidgameM/memberedit',
    		data:{"nid":${param.nid}},
    		dataType:"json",
    		async: true,
    		success:function(rs){	
    			$("#L_uphone").val(rs.btid);
    			$("#btid").val(rs.btid);
    			$("#talktime").val(rs.talktime);
    			$("#kissid").val(rs.kissid);
    			$("#talk").val(rs.talk);
    			$("#tname").val(rs.tname);
    			$("#imgurl").val(rs.imgurl);
    			
    		}
    		
    	});
    	
    	
    	
    	
    });
    
    
    </script>
    <body>
        <div class="layui-fluid">
            <div class="layui-row">
                <form class="layui-form" action="${pageContext.request.contextPath}/BandroidgameM/updatemessageByid" id="formedit"  method="get">
                    <input type="text" class="L_uphone" id="L_uphone" name="btid" required="" lay-verify="email"  >
                    <input type="text" class="L_uphone" id="tname" name="tname" required="" lay-verify="email"  >
                    <input type="text" class="L_uphone" id="imgurl" name="imgurl" required="" lay-verify="email"  ></div>
                    <div class="layui-form-item">
                        <label for="L_email" class="layui-form-label">
                            <span class="x-red">*</span>id</label>
                        <div class="layui-input-inline">
                            <input type="text" id="btid"  required="" lay-verify="email" autocomplete="off" class="layui-input" disabled="disabled"></div>
                       		
                        <div class="layui-form-mid layui-word-aux">
                            <span class="x-red">*不可变更</span></div></div>
                    <div class="layui-form-item">
                        <label for="L_username" class="layui-form-label">
                            <span class="x-red"></span>留言时间</label>
                        <div class="layui-input-inline">
                        
                            <input type="text"  id="talktime" name="talktime" required="" lay-verify="nikename" autocomplete="off" class="layui-input"></div>
                    </div>
                    <div class="layui-form-item">
                        <label for="L_pass" class="layui-form-label">
                            <span class="x-red">*</span>留言对象</label>
                        <div class="layui-input-inline">
                           <input type="text"  id="kissid" name="kissid">
                            <!-- <input type="text"  id="kissid" name="kissid" required=""  class="layui-input"></div> -->
							
                        <div class="layui-form-mid layui-word-aux" id="sexdis"></div></div>
                    <div class="layui-form-item">
                        <label for="L_repass" class="layui-form-label">
                            <span class="x-red"></span>留言内容</label>
                        <div class="layui-input-inline">
                            <input type="text"  id="talk" name="talk" required="" lay-verify="nikename" autocomplete="off" class="layui-input"></div>
                     <span class="x-red" id="ageerror"></span></div>
                      
                    <div class="layui-form-item">
                        <label for="L_repass" class="layui-form-label"></label>
                        <input type="button" id="editupdate" value="更新" class="layui-btn">
                       </div>
                </form>
            </div>
        </div>
   <script>
   $("#editupdate").click(function(){
	 
	  var talktime = $("#talktime").val();
	  if(talktime!=null){
			  $("#formedit").submit();	  
	  }
   
   });
   
   
   </script>
    </body>

</html>