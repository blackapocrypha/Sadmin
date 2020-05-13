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
                <form class="layui-form" action="" id="formedit"  method="post">
                   
                    <div class="layui-form-item">
                        <label for="L_email" class="layui-form-label">
                            <span class="x-red"></span>网站名</label>
                        <div class="layui-input-inline">
                            <input type="text" id="webname" name="webname" required="" lay-verify="nikename1" autocomplete="off" class="layui-input" ></div>
                       		
                        <div class="layui-form-mid layui-word-aux">
                            <span class="x-red"></span></div></div>
                    <div class="layui-form-item">
                        <label for="L_username" class="layui-form-label">
                            <span class="x-red"></span>网站地址</label>
                        <div class="layui-input-inline">
                            <input type="text"  id="weburl" name="weburl" required="" lay-verify="nikename2" autocomplete="off" class="layui-input"></div>
                    </div>
                    <div class="layui-form-item">
                        <label for="L_pass" class="layui-form-label">
                            <span class="x-red">*</span>网站介绍</label>
                        <div class="layui-input-inline">
                           <input type="text"  id="webdis" name="webdis" required="" lay-verify="nikename3" autocomplete="off" class="layui-input"></div>
								
                        <div class="layui-form-mid layui-word-aux" id="sexdis"></div></div>
                
                    <div class="layui-form-item">
                        <label for="L_repass" class="layui-form-label"></label>
                        <input type="button" id="editupdate" value="添加" lay-filter="add" lay-submit="" class="layui-btn">
                       </div>
                </form>
            </div>
        </div>
   <script>
   $("#editupdate1").click(function(){
	  var webname = $("#webname").val();
	  var weburl = $("#weburl").val();
	  var webdis = $("#webdis").val();
	 
	  if(webname!=null&&weburl!=null&&webdis!=null){
			  $("#formedit").submit();
	  }
	 
	   
   });
   
   
   </script>
   
   
    <script>layui.use(['form', 'layer','jquery'],
            function() {
                $ = layui.jquery;
                var form = layui.form,
                layer = layui.layer;

                //自定义验证规则
                form.verify({
                    nikename1: function(value) {
                        if (value.length < 1) {
                            return '网站名不能为空';
                        }
                    },
                    nikename2: function(value) {
                        if (value.length < 1) {
                            return '网站地址不能为空';
                        }
                    },  
                    nikename3: function(value) {
                        if (value.length < 1) {
                            return '网站介绍不能为空';
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
        		url:"Blog/addnewwebsite",
        		
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
         
        </script>
        
    </body>

</html>