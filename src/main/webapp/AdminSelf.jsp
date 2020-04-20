<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html class="x-admin-sm">
    
    <head>
        <meta charset="UTF-8">
        <title>个人中心</title>
        <meta name="renderer" content="webkit">
        <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
        <meta name="viewport" content="width=device-width,user-scalable=yes, minimum-scale=0.4, initial-scale=0.8,target-densitydpi=low-dpi" />
        <link rel="stylesheet" href="./css/font.css">
        <link rel="stylesheet" href="./css/xadmin.css">
        <script type="text/javascript" src="./lib/layui/layui.js" charset="utf-8"></script>
        <script type="text/javascript" src="./js/xadmin.js"></script>
        <script src="js/jquery-3.4.1.min.js"></script>
        <!-- 让IE8/9支持媒体查询，从而兼容栅格 -->
        <!--[if lt IE 9]>
            <script src="https://cdn.staticfile.org/html5shiv/r29/html5.min.js"></script>
            <script src="https://cdn.staticfile.org/respond.js/1.4.2/respond.min.js"></script>
        <![endif]-->
        <style>
        .layui-input-inline img{width:55px,height:55px;border-radius:8px;opacity:0.8;}
        #imgbox{transition:all 4000;width:275px;height:55px;overflow:hidden;position:absolute;left:290px;top:227px;display:none}
		#imgbox ul li img{
			border-radius:8px;
			opacity:0.8;
			margin-left:10px;
			display:inline-block;
			float:left;
			box-shadow: 2px 2px 4px #888888;
}
        </style> 
        <script>
        $(function(){
        	//获取用户名 
        	var username =${param.username};
        	$("#username").val(username);
        	$("#reusername").val(username);
     
        	/*//打印已有信息*/
        	$.ajax({
        		type:'POST',	
        		url:'${pageContext.request.contextPath}/AdminDetil/getAllAdminDetils',
        		data:{'username':${param.username}},
        		dataType:'json',     		
        		success:function(rs){
        			$("#phone").val(rs.ad.phone);
        			$("#L_email").val(rs.ad.email);
            	    $("#urlimg").attr("src",rs.ad.urlimg);
            	    $("#hidenurlimg").val(rs.ad.urlimg);
        		}
        		
        	})
        	
        	
        });//end function
        
        
        </script>
    </head>
    <body>
        <div class="layui-fluid">
            <div class="layui-row">
            <div id="imgbox">
            <ul>
           	    <li><a href="javascript:;" onclick="changeImg('images/adminimg/t1.png')"><img src="images/adminimg/t1.png"></a></li>
            	<li><a href="javascript:;" onclick="changeImg('images/adminimg/t2.png')"><img src="images/adminimg/t2.png"></a></li>
            	<li><a href="javascript:;" onclick="changeImg('images/adminimg/t3.png')"><img src="images/adminimg/t3.png"></a></li>
            	<li><a href="javascript:;" onclick="changeImg('images/adminimg/t4.png')"><img src="images/adminimg/t4.png"></a></li>
            </ul>
            </div>
            
                <form class="layui-form">
                
                  <div class="layui-form-item">
                      <label for="username" class="layui-form-label">
                          <span class="x-red">*</span>登录名
                      </label>
                      <div class="layui-input-inline">
                      	<input type="hidden" id="reusername" name="username">
                          <input type="text" id="username"  required="" lay-verify="required"
                          autocomplete="off" class="layui-input" disabled="disabled">
                      </div>
                      <div class="layui-form-mid layui-word-aux">
                          <span class="x-red">*</span>将会成为您唯一的登入名
                      </div>
                  </div>
                  <div class="layui-form-item">
                      <label for="phone" class="layui-form-label">
                          <span class="x-red">*</span>手机
                      </label>
                      <div class="layui-input-inline">
                          <input type="text" id="phone" name="phone" required="" lay-verify="phone"
                          autocomplete="off" class="layui-input">
                      </div>
                      <div class="layui-form-mid layui-word-aux">
                          <span class="x-red"></span>
                      </div>
                  </div>
                 
                  
                  <div class="layui-form-item">
                      <label for="L_email" class="layui-form-label">
                          <span class="x-red">*</span>邮箱
                      </label>
                      <div class="layui-input-inline">
                          <input type="text" id="L_email" name="email" required="" lay-verify="email"
                          autocomplete="off" class="layui-input">
                      </div>
                      <div class="layui-form-mid layui-word-aux">
                          <span class="x-red">*</span>
                      </div>
                  </div>
                  <div class="layui-form-item">
                      <label class="layui-form-label"><span class="x-red">*</span>角色</label>
                      <div class="layui-input-block">
                        <input type="checkbox" name="like1[write]" lay-skin="primary" title="管理员" checked="" disabled="disabled">
                         </div>
                  </div>
                    <div class="layui-form-item">
                      <label for="L_email" class="layui-form-label">
                          <span class="x-red">*</span>聊天头像
                      </label>
                      <div class="layui-input-inline">
                      <input id="hidenurlimg" username="urlimg" value="" type="hidden">
                      	<a href="javascript:;" onclick="showselfimg()"><img id="urlimg" src=""></a>
                      </div>
                      <div class="layui-form-mid layui-word-aux">
                          
                      </div>
                  </div>
                  <div class="layui-form-item">
                      <label for="L_pass" class="layui-form-label">
                          <span class="x-red">*</span>密码
                      </label>
                      <div class="layui-input-inline">
                          <input type="password" id="L_pass" name="pass" required="" lay-verify="pass"
                          autocomplete="off" class="layui-input">
                      </div>
                      <div class="layui-form-mid layui-word-aux">
                          6到16个字符(确认密码或者修改密码)
                      </div>
                  </div>
                  <div class="layui-form-item">
                      <label for="L_repass" class="layui-form-label">
                          <span class="x-red">*</span>确认密码
                      </label>
                      <div class="layui-input-inline">
                          <input type="password" id="L_repass" name="repass" required="" lay-verify="repass"
                          autocomplete="off" class="layui-input">
                      </div>
                  </div>
                  <div class="layui-form-item">
                      <label for="L_repass" class="layui-form-label">
                      </label>
                      <button  class="layui-btn" lay-filter="add" lay-submit="">
                          更新
                      </button>
                  </div>
                  
                  
              </form>
            </div>
        </div>
        <script>layui.use(['form', 'layer'],
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
                    
                    //发异步，把数据提交给php
                     let dataform = {"username":$("#username").val(),"phone":$("#phone").val(),"email":$("#L_email").val(),"urlimg":$("#hidenurlimg").val(),"password":$("#L_pass").val()};		
                                              
                             $.ajax({
                             	type:"POST",
                             	url:"AdminDetil/editUDetils",
                             	data:dataform,
                             	dataType:"json",
                             	async:true,
                             	success:function(rs){}     	
                             })
                    layer.alert("增加成功", {
                        icon: 6
                    },
                    function() {
                    	
                        //关闭当前frame
                        xadmin.close();

                        // 可以对父窗口进行刷新 
                        xadmin.father_reload();
                    });
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
        	$("#hidenurlimg").val(img);
        	
        }
        </script>
      
    </body>

</html>
