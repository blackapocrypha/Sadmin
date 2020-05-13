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
        <script src="./js/layui.js"></script>
        <style>
        #L_uphone{
        	display:none;
        }
        #touxiang{}
         #imgbox{z-index:200;transition:all 4000;width:275px;height:55px;overflow:hidden;position:absolute;left:200px;top:174px;display:none;}
		#imgbox ul li img{
			border-radius:8px;
			opacity:0.8;
			margin-left:10px;
			display:inline-block;
			float:left;
			box-shadow: 2px 2px 4px #888888;}

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
    		url:'SAC/memberedit',
    		data:{"username":${param.username}},
    		dataType:"json",
    		async: true,
    		success:function(rs){	
    			$("#L_name").val(rs.username);
    			$("#L_uphone").val(rs.username);
    			$("#L_phone").val(rs.phone);
    			$("#L_mail").val(rs.email);
    			$("#L_img").val(rs.urlimg);
    			$("#urlimg").attr("src",rs.urlimg);
    		}
    		
    	});
    	
    	
    	
    	
    });
    
    
    </script>
    <body>
        <div class="layui-fluid">
         <div id="imgbox">
            <ul>
           	    <li><a href="javascript:;" onclick="changeImg('images/adminimg/t1.png')"><img src="images/adminimg/t1.png"></a></li>
            	<li><a href="javascript:;" onclick="changeImg('images/adminimg/t2.png')"><img src="images/adminimg/t2.png"></a></li>
            	<li><a href="javascript:;" onclick="changeImg('images/adminimg/t3.png')"><img src="images/adminimg/t3.png"></a></li>
            	<li><a href="javascript:;" onclick="changeImg('images/adminimg/t4.png')"><img src="images/adminimg/t4.png"></a></li>
            </ul>
            </div>
            <div class="layui-row">
                <form class="layui-form" id="formedit"  method="post">
                    <input type="text" id="L_uphone" name="username" required="" lay-verify="email"  ></div>
                    <div class="layui-form-item">
                        <label for="L_email" class="layui-form-label">
                            <span class="x-red">*</span>用户名</label>
                        <div class="layui-input-inline">
                            <input type="text" id="L_name" required="" lay-verify="email" autocomplete="off" class="layui-input" disabled="disabled"></div>
                       		
                        <div class="layui-form-mid layui-word-aux">
                            <span class="x-red">*不可变更</span></div></div>
                    <div class="layui-form-item">
                        <label for="L_username" class="layui-form-label">
                            <span class="x-red">*</span>手机</label>
                        <div class="layui-input-inline">
                            <input type="text"  id="L_phone" name="phone" required="" lay-verify="nikename" autocomplete="off" class="layui-input"></div>
                    </div>
                    <div class="layui-form-item">
                        <label for="L_pass" class="layui-form-label">
                            <span class="x-red">*</span>邮箱</label>
                        <div class="layui-input-inline">
                           <input type="text"  id="L_mail" name="email" required="" lay-verify="nikename" autocomplete="off" class="layui-input"></div>
								
                        <div class="layui-form-mid layui-word-aux" id="sexdis"></div></div>
                    <div class="layui-form-item" id="touxiang">
                        <label for="L_repass" class="layui-form-label">
                            <span class="x-red">*</span>头像</label>
                        <div class="layui-input-inline">
                        <a href="javascript:;" onclick="showselfimg()"><img id="urlimg" src=""></a>
                            <input type="hidden"  id="L_img" name="urlimg" required="" lay-verify="nikename" autocomplete="off" class="layui-input"></div>
                     <span class="x-red" id="ageerror"></span></div>
                  
                    <div class="layui-form-item">
                        <label for="L_repass" class="layui-form-label"></label>
                        <input type="button" id="editupdate" value="更新" class="layui-btn">
                       </div>
                </form>
                
              
            </div>
        </div>
   <script>
   layui.use(['layer', 'jquery'], function(){
	   layer = layui.layer //弹层
	   ,$ = layui.jquery//jquery
  
   $("#editupdate").click(function(){
	 
	   var phone = $('#L_phone').val();
	    if(!(/^1[3456789]\d{9}$/.test(phone))){ 
	    	layer.msg("手机号码有误，请重填");  
	        return false; 
	    }else{
	    	var sendData={"username":$("#L_name").val(),"phone":$("#L_phone").val(),"email":$("#L_mail").val(),"urlimg":$("#L_img").val()};
	    	 $.ajax({
	 			type:'POST',
	 			url:'AdminDetil/updateAdmindetilsByphone',
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
	 				}
	 			} 	
	 		});  

	    
	    } 
	   
   });
   
   
   //显示头像盒子
   function showselfimg(){
   	$("#imgbox").css("display","inline-block");
   }
   
   function changeImg(img){
   	$("#imgbox").css("display","none");
   	$("#urlimg").attr("src",img);
   	$("#L_img").val(img);
   	
   }
   
   });
   </script>
    </body>

</html>