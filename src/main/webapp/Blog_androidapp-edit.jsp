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
        <link rel="stylesheet" href="http://47.94.83.36/tools/css/imgupload.css">
        <script type="text/javascript" src="./lib/layui/layui.js" charset="utf-8"></script>
        <script type="text/javascript" src="./js/xadmin.js"></script>
        <script src="http://47.94.83.36/tools/js/jquery-3.4.1.min.js"></script>
         <script src="http://47.94.83.36/tools/js/imgupload.js"></script>
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
    		url:'Bandroid/memberedit',
    		data:{"nid":${param.nid}},
    		dataType:"json",
    		async: true,
    		success:function(rs){	
    			$("#L_uphone").val(rs.nid);
    			$("#nid").val(rs.nid);
    			$("#appname").val(rs.appname);
    			$("#appimgurl").val(rs.appimgurl);
    			$("#appdis").val(rs.appdis);
    			$("#appdownurl").val(rs.appdownurl);
    		}
    		
    	});
    	
    	
    	
    	
    });
    
    
    </script>
    <body>
        <div class="layui-fluid">
            <div class="layui-row">
                <form class="layui-form" action="${pageContext.request.contextPath}/Bandroid/updateappByid" id="formedit"  method="get">
                    <input type="text" id="L_uphone" name="nid" required="" lay-verify="email"  ></div>
                    <div class="layui-form-item">
                        <label for="L_email" class="layui-form-label">
                            <span class="x-red">*</span>id</label>
                        <div class="layui-input-inline">
                            <input type="text" id="nid"  required="" lay-verify="email" autocomplete="off" class="layui-input" disabled="disabled"></div>
                       		
                        <div class="layui-form-mid layui-word-aux">
                            <span class="x-red">*不可变更</span></div></div>
                    <div class="layui-form-item">
                        <label for="L_username" class="layui-form-label">
                            <span class="x-red"></span>软件名称</label>
                        <div class="layui-input-inline">
                            <input type="text"  id="appname" name="appname" required="" lay-verify="nikename" autocomplete="off" class="layui-input"></div>
                    </div>
                    <div class="layui-form-item">
                        <label for="L_pass" class="layui-form-label">
                            <span class="x-red"></span>图片链接</label>
                        <div class="layui-input-inline">
                           <input type="text"  id="appimgurl" name="appimgurl" required="" lay-verify="nikename" autocomplete="off" class="layui-input"></div>
								
                        <div class="layui-form-mid layui-word-aux" id="sexdis"></div></div>
                    <div class="layui-form-item">
                        <label for="L_repass" class="layui-form-label">
                            <span class="x-red"></span>软件介绍</label>
                        <div class="layui-input-inline">
                            <input type="text"  id="appdis" name="appdis" required="" lay-verify="nikename" autocomplete="off" class="layui-input"></div>
                     <span class="x-red" id="ageerror"></span></div>
                      <div class="layui-form-item">
                        <label for="L_repass" class="layui-form-label">
                            <span class="x-red"></span>下载地址</label>
                        <div class="layui-input-inline">
                            <input type="text"  id="appdownurl" name="appdownurl" required="" lay-verify="nikename" autocomplete="off" class="layui-input"></div>
                     <span class="x-red" id="ageerror"></span></div>
                    <div class="layui-form-item">
                        <label for="L_repass" class="layui-form-label"></label>
                        <input type="button" id="editupdate" value="更新" class="layui-btn">
                       </div>
                </form>
                
                <!-- 图片上传 -->
                <div id="addimg">
					<form id="fileup" method="post">
						<div id="divshowimg"><span>添加</span></div>
					</form>
					<a href="#">
						<form enctype="multipart/form-data" id="uploadform1" action="http://www.pslywebsite.top/imgfactory/upload_server.php"
						 method="post">
							<input type="file" name="file" multiple="multiple" class="inputlabelBox" id="upfile" value="上传" />
						</form>
						添加图片
					</a>
				</div><!-- 图片上传 -->
                
                
            </div>
        </div>
   <script>
   $("#editupdate").click(function(){
	  var appname = $("#appname").val();
	  var appimgurl = $("#appimgurl").val();
	  var appdis = $("#appdis").val();
	  var appdownurl = $("#appdownurl").val();
	  if(appname!=null&&appimgurl!=null&&appdis!=null&&appdownurl!=null){
		  
			  $("#formedit").submit();	 
			 
	  }
   
   });
   
   
	$("#upfile").change(function(){
	    showthis();
	});
	function showthis(){
		var fileList = document.getElementById('upfile').files;
		 
         var filename ="http://www.pslywebsite.top/imgfactory/uploads/"+fileList[0].name;
        
      	 $("#appimgurl").val(filename);
		 var img = window.webkitURL.createObjectURL(fileList[0]);
		 var formData = new FormData();
		 formData.append('file', fileList[0]);
		 $.ajax({
				url: 'http://www.pslywebsite.top/imgfactory/upload_server.php',
				type: 'POST',
				data: formData,
				//这两个设置项必填
				contentType: false,
				processData: false,
				async:true,
				success: function(data) {	
					console.log("success");						
				}
			})
		 
		 $("#divshowimg").css("display","none");
		 $("#upfile").css("display","none");
		 $("#fileup").append("<img id='preimg' src='"+img+"'>"); 
	}
	
   </script>
    </body>

</html>