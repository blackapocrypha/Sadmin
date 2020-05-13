<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html class="x-admin-sm">
    <head>
        <meta charset="UTF-8">
        <title>修改页面</title>
        <meta name="renderer" content="webkit">
        <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
        <meta name="viewport" content="width=device-width,user-scalable=yes, minimum-scale=0.4, initial-scale=0.8,target-densitydpi=low-dpi" />
        <link rel="stylesheet" href="./css/font.css">
        <link rel="stylesheet" href="./css/xadmin.css">
        <script type="text/javascript" src="./lib/layui/layui.js" charset="utf-8"></script>
        <script type="text/javascript" src="./js/xadmin.js"></script>
        <script src="http://47.94.83.36/tools/js/jquery-3.4.1.min.js"></script>
        <script src="layui/layui.js"></script>
        <style>
        	#L_uphone{
        	display:none;}
        </style>
        <script>
    
        
        
        </script>
        </head>
    
    <body>
        <div class="layui-fluid">
            <div class="layui-row">
                <form class="layui-form"  method="post">
                 <input type="text" id="L_uphone" name="username" required="" value="${param.username}"  lay-verify="email"  ></div>
                    <div class="layui-form-item">
                        <label for="L_username" class="layui-form-label">账号</label>
                        <div class="layui-input-inline">
                            <input type="text" id="L_username"  disabled="" value="${param.username}" class="layui-input" disabled="disabled"></div>
                    </div>
                   
                    <div class="layui-form-item">
                        <label for="L_pass" class="layui-form-label">
                            <span class="x-red">*</span>新密码</label>
                        <div class="layui-input-inline">
                            <input type="password" id="L_pass" required="" lay-verify="required" autocomplete="off" class="layui-input"></div>
                        <div class="layui-form-mid layui-word-aux">6到16个字符</div></div>
                    <div class="layui-form-item">
                        <label for="L_repass" class="layui-form-label">
                            <span class="x-red">*</span>确认密码</label>
                        <div class="layui-input-inline">
                            <input type="password" id="L_repass" name="password" required="" lay-verify="required" autocomplete="off" class="layui-input"></div>
                    </div>
                    <div class="layui-form-item">
                        <label for="L_repass" class="layui-form-label"></label>
                        <button class="layui-btn" type="button" id="updatepass">更新</button></div>
                        </div>
                </form>
            </div>
        </div>
        <script>
        layui.use(['layer', 'jquery'], function(){
     	   layer = layui.layer //弹层
     	   ,$ = layui.jquery//jquery
     	   
     
        $("#updatepass").click(function(){
        	
        	if($("#L_pass").val()==$("#L_repass").val()){
        		var sendData = {"username":$("#L_uphone").val(),"password":$("#L_pass").val()};
        		$.ajax({
    	 			type:'POST',    	 			
    	 			url:'SAC/updatePasswordByUsername',
    	 			data:sendData,
    	 			dataType:'json',
    	 			async: false,
    	 			success:function(rs){
    	 				if(rs==1){			
    	     		 		
    	 					layer.msg("修改成功");
    	     		 		setTimeout(function(){
    	     		 		
    	     		 		var index = parent.layer.getFrameIndex(window.name);
							parent.location.reload(); //刷新父页面
							parent.layer.close(index);
    	     		 		
    	     		 		},1000);
    							
    							
    						
    	     		 	
    	 				}else{	 					
    	 					layer.msg("修改失败");
    	 					return false;
    	 				}
    	 			} 	
    	 		});  

        	}else{
        		layer.msg("两次密码不匹配");
        		return false;
        	}
        	
        	
        	
        });
        
        
        });
        </script>
      
    </body>

</html>