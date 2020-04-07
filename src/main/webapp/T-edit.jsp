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
        #T_tid{
        	display:none;
        }</style>
        <!-- 让IE8/9支持媒体查询，从而兼容栅格 -->
        <!--[if lt IE 9]>
            <script src="https://cdn.staticfile.org/html5shiv/r29/html5.min.js"></script>
            <script src="https://cdn.staticfile.org/respond.js/1.4.2/respond.min.js"></script>
        <![endif]--></head>
    <script>
    $(function(){
    	var tid = ${param.tid};
    	$.ajax({
    		type:"GET",
    		url:'Ts/memberedit',
    		data:{"tid":tid},
    		dataType:"json",
    		async: true,
    		success:function(rs){	
    			$("#T_tid").val(rs.tid);
    			$("#T_id").val(rs.tid);
    			$("#T_name").val(rs.tname);
    			$("#T_type").val(rs.ttype);
    			$("#T_typetwo").val(rs.ttypetwo);
    			$("#T_dis").val(rs.tdis);
    			$("#T_e").val(rs.tenglist);
    			$("#T_url").val(rs.turl);
    			$("#T_imgurl").val(rs.imgurl);
    		}
    		
    	});
    	
    	
    	
    	
    });
    
    
    </script>
    <body>
        <div class="layui-fluid">
            <div class="layui-row">
                <form class="layui-form" action="${pageContext.request.contextPath}/Ts/updateSupport" id="formedit"  method="get">
                    <input type="text" id="T_tid" name="tid" required="" lay-verify="email"  ></div>
                    <div class="layui-form-item">
                        <label for="L_email" class="layui-form-label">
                            <span class="x-red">*</span>软件id</label>
                        <div class="layui-input-inline">
                            <input type="text" id="T_id" required="" lay-verify="email" autocomplete="off" class="layui-input" disabled="disabled"></div>
                       		
                        <div class="layui-form-mid layui-word-aux">
                            <span class="x-red">*不可变更</span></div></div>
                    <div class="layui-form-item">
                        <label for="L_username" class="layui-form-label">
                            <span class="x-red">*</span>名称</label>
                        <div class="layui-input-inline">
                            <input type="text"  id="T_name" name="tname" required="" lay-verify="nikename" autocomplete="off" class="layui-input"></div>
                    </div>
                    <div class="layui-form-item">
                        <label for="L_pass" class="layui-form-label">
                            <span class="x-red">*</span>定位</label>
                        <div class="layui-input-inline">
                           <input type="text"  id="T_type" name="ttype" required="" lay-verify="nikename" autocomplete="off" class="layui-input"></div>
								
                        <div class="layui-form-mid layui-word-aux" id="sexdis"></div></div>
                    <div class="layui-form-item">
                        <label for="L_repass" class="layui-form-label">
                            <span class="x-red">*</span>介绍</label>
                        <div class="layui-input-inline">
                            <input type="text"  id="T_typetwo" name="ttypetwo" required="" lay-verify="nikename" autocomplete="off" class="layui-input"></div>
                     <span class="x-red" id="ageerror"></span></div>
                     
                      <div class="layui-form-item">
                        <label for="L_repass" class="layui-form-label">
                            <span class="x-red">*</span>详细</label>
                        <div class="layui-input-inline">
                            <input type="text"  id="T_dis" name="tdis" required="" lay-verify="nikename" autocomplete="off" class="layui-input"></div>
                     <span class="x-red" id="ageerror"></span></div>
                     
                     <div class="layui-form-item">
                        <label for="L_repass" class="layui-form-label">
                            <span class="x-red">*</span>英文</label>
                        <div class="layui-input-inline">
                            <input type="text"  id="T_e" name="tenglist" required="" lay-verify="nikename" autocomplete="off" class="layui-input"></div>
                     <span class="x-red" id="ageerror"></span></div>
                     
                     <div class="layui-form-item">
                        <label for="L_repass" class="layui-form-label">
                            <span class="x-red">*</span>链接</label>
                        <div class="layui-input-inline">
                            <input type="text"  id="T_url" name="turl" required="" lay-verify="nikename" autocomplete="off" class="layui-input"></div>
                     <span class="x-red" id="ageerror"></span></div>
                     
                     <div class="layui-form-item">
                        <label for="L_repass" class="layui-form-label">
                            <span class="x-red">*</span>图片链接</label>
                        <div class="layui-input-inline">
                            <input type="text"  id="T_imgurl" name="imgurl" required="" lay-verify="nikename" autocomplete="off" class="layui-input"></div>
                     <span class="x-red" id="ageerror"></span></div>
                    <div class="layui-form-item">
                        <label for="L_repass" class="layui-form-label"></label>
                        <input type="button" id="editupdate"  value="更新" class="layui-btn">
                       </div>
                </form>
            </div>
        </div>
   <script>
   function fresh(){history.go(0);}
   
   $("#editupdate").click(function(){
	  var T_name = $("#T_name").val();
	  var T_type = $("#T_type").val();
	  var T_typetwo = $("#T_typetwo").val();
	  var T_dis = $("#T_dis").val();
	  var T_e = $("#T_e").val();
	  var T_url = $("#T_url").val();
	  var T_imgurl = $("#T_imgurl").val();
	 
	  if(T_name!=null&&T_type!=null&&T_dis!=null&&T_typetwo!=null&&T_e!=null&T_url!=null&&T_imgurl!=null){
	  $("#formedit").submit();
		 
		  }
   });
   
   
   </script>
    </body>

</html>