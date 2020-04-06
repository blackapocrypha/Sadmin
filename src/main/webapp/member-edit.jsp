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
        #L_uphone{
        	display:none;
        }</style>
        <!-- 让IE8/9支持媒体查询，从而兼容栅格 -->
        <!--[if lt IE 9]>
            <script src="https://cdn.staticfile.org/html5shiv/r29/html5.min.js"></script>
            <script src="https://cdn.staticfile.org/respond.js/1.4.2/respond.min.js"></script>
        <![endif]--></head>
    <script>
    $(function(){
    	
    	$.ajax({
    		type:"GET",
    		url:'users/memberedit',
    		data:{"username":${param.username}},
    		dataType:"json",
    		async: true,
    		success:function(rs){	
    			$("#L_email").val(rs.uphone);
    			$("#L_uphone").val(rs.uphone);
    			$("#L_ufname").val(rs.ufname);
    			$("#L_sex").val(rs.usex);
    			$("#L_age").val(rs.uage);
    		}
    		
    	});
    	
    	
    	
    	
    });
    
    
    </script>
    <body>
        <div class="layui-fluid">
            <div class="layui-row">
                <form class="layui-form" action="${pageContext.request.contextPath}/Udetil/updateUdetilsByUphone" id="formedit"  method="get">
                    <input type="text" id="L_uphone" name="uphone" required="" lay-verify="email"  ></div>
                    <div class="layui-form-item">
                        <label for="L_email" class="layui-form-label">
                            <span class="x-red">*</span>用户名</label>
                        <div class="layui-input-inline">
                            <input type="text" id="L_email" required="" lay-verify="email" autocomplete="off" class="layui-input" disabled="disabled"></div>
                       		
                        <div class="layui-form-mid layui-word-aux">
                            <span class="x-red">*不可变更</span></div></div>
                    <div class="layui-form-item">
                        <label for="L_username" class="layui-form-label">
                            <span class="x-red">*</span>昵称</label>
                        <div class="layui-input-inline">
                            <input type="text"  id="L_ufname" name="ufname" required="" lay-verify="nikename" autocomplete="off" class="layui-input"></div>
                    </div>
                    <div class="layui-form-item">
                        <label for="L_pass" class="layui-form-label">
                            <span class="x-red">*</span>性别</label>
                        <div class="layui-input-inline">
                           <input type="text"  id="L_sex" name="usex" required="" lay-verify="nikename" autocomplete="off" class="layui-input"></div>
								
                        <div class="layui-form-mid layui-word-aux" id="sexdis"></div></div>
                    <div class="layui-form-item">
                        <label for="L_repass" class="layui-form-label">
                            <span class="x-red">*</span>年龄</label>
                        <div class="layui-input-inline">
                            <input type="text"  id="L_age" name="uage" required="" lay-verify="nikename" autocomplete="off" class="layui-input"></div>
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
	  var sex = $("#L_sex").val();
	  var age = $("#L_age").val();
	 
	  if(sex =="男" || sex =="女"){
		  if(Number(age)>=0 && Number(age)<=150){
			  $("#formedit").submit();
		  }else{
			  $("#ageerror").html("年龄不合法");
			  setTimeout(function(){$("#ageerror").html("");},3000);
			  return false;  
		  }
	  }else{
		  $("#sexdis").html("输入不合法");
		  setTimeout(function(){$("#sexdis").html("");},3000);
		  return false;
	  }
	 
	   
   });
   
   
   </script>
    </body>

</html>