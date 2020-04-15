<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html  class="x-admin-sm">
<head>
<meta charset="UTF-8">
	<title>综合软件导航后台</title>
	<meta name="renderer" content="webkit|ie-comp|ie-stand">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width,user-scalable=yes, minimum-scale=0.4, initial-scale=0.8,target-densitydpi=low-dpi" />
    <meta http-equiv="Cache-Control" content="no-siteapp" />
    <link rel="stylesheet" href="./css/font.css">
    <link rel="stylesheet" href="./css/login.css">
    <link rel="stylesheet" href="./css/xadmin.css">
    <link rel="stylesheet" href="./css/loginslidebar.css">
    <link rel="shortcut icon" href="http://47.94.83.36/tools/img/soft.ico" /> 
     
	 
	
    <script src="http://47.94.83.36/tools/js/jquery-3.4.1.min.js"></script>
    <script src="./lib/layui/layui.js" charset="utf-8"></script>
    <script type="text/javascript" src="./js/jquery.min.js" ></script>
    <script type="text/javascript" src="./js/verify.js" ></script>
    <script type="text/javascript" src="./js/checkadminlogin.js" ></script>
    
    <!--[if lt IE 9]>
      <script src="https://cdn.staticfile.org/html5shiv/r29/html5.min.js"></script>
      <script src="https://cdn.staticfile.org/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
   <script>
	   
   $(function () {

	   //判断是否滑动了滚动条
   			let slide=false;
   			
		   $("#submit").click(function(){
			 // alert(document.getElementById('username').value=="");
			   //用户名为空
			   if(document.getElementById('username').value == ""){
				   $("#usernameerror").html("用户名不能为空");
				   $("#username").focus();
				   return false;
			   }
			   if($("#password").val() ==""){
				   $("#passworderror").html("密码不能为空");
				   return false;
			   }
			  
			  
       		var sendData = {"username":$('#username').val(),"password":$('#password').val()};  
       		if(slide){      		
       		//登录判断	
       		$.ajax({
       			type:'post',
       			url:'${pageContext.request.contextPath}/SAC/adminLogin',
       			data:sendData,
       			dataType:'json',
       			async: false,
       			success:function(rs){
       				if(rs.status==1){
       					//登录成功
       					location.href='index.jsp'
       				}      				
       				else{
       					layui.use('form', function(){
       		              var form = layui.form;
       		               layer.msg('登录失败,用户名或密码不正确', function(){
       		                 return false;
       		                 });
       					});
       				}
       			} 	
       		});}
       	  
		   });
		   
		   
			$('#mpanel1').slideVerify({
        		type : 1,		//类型
        		vOffset : 5,	//误差量，根据需求自行调整
		        barSize : {
		        	width : '340px',
		        	height : '40px',
		        },
		        ready : function() {
		    	},
		        success : function() {
		        	slide=true;
		        	//......后续操作
		        },
		        error : function() {
//		        	alert('验证失败！');
		        }
		        
		    });
       	   
   });	   
		 
	  
   </script>
</head>
<body class="login-bg">
    
    <div class="login layui-anim layui-anim-up">
        <div class="message">Software-管理登录</div>
        <div id="darkbannerwrap"></div>
        
        <form  method="post" class="layui-form" >
            <input id="username"  placeholder="用户名"  type="text" lay-verify="required" onmousemove="clearusererror()" class="layui-input" >
            <span id="usernameerror"></span> <hr class="hr15">
            <input id="password" lay-verify="required" placeholder="密码"  type="password" onmousemove="clearpasserror()" class="layui-input">
            <span id="passworderror"></span><hr class="hr15">  
            <div id="mpanel1" ></div>
    		<br/>
            <input value="登录" id="submit" onclick="a();"  lay-submit lay-filter="login" style="width:100%;" type="button">
            <hr class="hr20" >
        </form>
    </div>

 
    <!-- 底部结束 -->
    <script>
    //百度统计可去掉
    var _hmt = _hmt || [];
    (function() {
      var hm = document.createElement("script");
      hm.src = "https://hm.baidu.com/hm.js?b393d153aeb26b46e9431fabaf0f6190";
      var s = document.getElementsByTagName("script")[0]; 
      s.parentNode.insertBefore(hm, s);
    })();
    </script>
</body>
</html>