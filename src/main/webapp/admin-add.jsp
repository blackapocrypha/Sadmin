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
        <!-- 让IE8/9支持媒体查询，从而兼容栅格 -->
        <!--[if lt IE 9]>
            <script src="https://cdn.staticfile.org/html5shiv/r29/html5.min.js"></script>
            <script src="https://cdn.staticfile.org/respond.js/1.4.2/respond.min.js"></script>
        <![endif]-->
        <style>
        #hiddeninput{display:none;}
                 #imgbox{z-index:200;transition:all 4000;width:275px;height:55px;overflow:hidden;position:absolute;left:200px;top:69px;display:none;}
		#imgbox ul li img{
			border-radius:8px;
			opacity:0.8;
			margin-left:10px;
			display:inline-block;
			float:left;
			box-shadow: 2px 2px 4px #888888;}
        
        </style>
    </head>
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
                <form class="layui-form" id="addform" method="post">
                     <input value="http://www.pslywebsite.top/imgfactory/useimg/timg.jpg" name="userimg" id="hiddeninput">
                    <div class="layui-form-item">
                        <label for="L_email" class="layui-form-label">
                            <span class="x-red">*</span>用户名</label>
                        <div class="layui-input-inline">
                            <input type="text" id="L_phone" name="username" class="layui-input"></div>
                        <div class="layui-form-mid layui-word-aux">
                            <span class="x-red">*</span>将会成为您唯一的登入名</div></div>
                    <div class="layui-form-item">
                        <label for="L_username" class="layui-form-label">
                            <span class="x-red">*</span>头像</label>
                        <div class="layui-input-inline">
                         <a href="javascript:;" onclick="showselfimg()"><img id="urlimg" src="images/adminimg/t1.png"></a>
                            <input type="hidden"  id="L_img" name="urlimg" required="" value="images/adminimg/t1.png" lay-verify="nikename" autocomplete="off" class="layui-input">
                            </div>
                    </div>
                    <div class="layui-form-item">
                        <label for="L_pass" class="layui-form-label">
                            <span class="x-red">*</span>密码</label>
                        <div class="layui-input-inline">
                            <input type="password" id="L_pass"  required="" lay-verify="pass" autocomplete="off" class="layui-input"></div>
                        <div class="layui-form-mid layui-word-aux">6到16个字符</div></div>
                    <div class="layui-form-item">
                        <label for="L_repass" class="layui-form-label">
                            <span class="x-red">*</span>确认密码</label>
                        <div class="layui-input-inline">
                            <input type="password" id="L_repass" name="password" required="" lay-verify="repass" autocomplete="off" class="layui-input"></div>
                    </div>
                    <div class="layui-form-item">
                        <label for="L_repass" class="layui-form-label"></label>
                        <button class="layui-btn" onclick="adduser()" lay-filter="add" lay-submit="">增加</button></div>
                </form>
            </div>
        </div>
        <script>
        //添加用户
        function adduser(){
        	if($("#L_phone").val()==null){
        		return false;
        	}
        	
        }
        </script>
        <script>layui.use(['form', 'layer','jquery'],
            function() {
                $ = layui.jquery;
                var form = layui.form,
                layer = layui.layer;

                //自定义验证规则
                form.verify({
                   
                    pass: [/(.+){6,12}$/, '密码必须6到12位'],
                    repass: function(value) {
                        if ($('#L_pass').val() != $('#L_repass').val()) {
                            return '两次密码不一致';
                        }
                    }
                });

                //监听提交
                form.on('submit(add)',
                function(data) {
                   
                    $.ajax({
        		type:"POST",
        		data:data.field,
        		dataType:"json",
        		url:"SAC/addNewAdmin",
        		success:function(rs){
        			if(rs=="true"){
        							
			        			}//end if
			        		}
			        	})
			        if(true){
                    	layer.alert("增加成功", {
                              icon: 6
                          },
                          function() {
                              //关闭当前frame
                              xadmin.close();

                              // 可以对父窗口进行刷新 
                              xadmin.father_reload();
                          });}	
                    return false;
                });

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
        </script>
      
    </body>

</html>