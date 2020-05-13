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
        <style>
        #L_uphone{
        	display:none;
        }</style>
        <!-- 让IE8/9支持媒体查询，从而兼容栅格 -->
        <!--[if lt IE 9]>
            <script src="https://cdn.staticfile.org/html5shiv/r29/html5.min.js"></script>
            <script src="https://cdn.staticfile.org/respond.js/1.4.2/respond.min.js"></script>
        <![endif]--></head>
  
    <body>
        <div class="layui-fluid">
            <div class="layui-row">
                <form class="layui-form"  id="formedit"  method="post">
  
                    <div class="layui-form-item">
                        <label for="L_username" class="layui-form-label">
                            <span class="x-red"></span>书籍名称</label>
                        <div class="layui-input-inline">
                            <input type="text"  id="appname" name="appname" required="" lay-verify="nikename1" autocomplete="off" class="layui-input"></div>
                    </div>
                    <div class="layui-form-item">
                        <label for="L_pass" class="layui-form-label">
                            <span class="x-red"></span>图片链接</label>
                        <div class="layui-input-inline">
                           <input type="text"  id="appimgurl" name="appimgurl" required="" lay-verify="nikename2" autocomplete="off" class="layui-input"></div>
								
                        <div class="layui-form-mid layui-word-aux" id="sexdis"></div></div>
                    <div class="layui-form-item">
                        <label for="L_repass" class="layui-form-label">
                            <span class="x-red"></span>介绍</label>
                        <div class="layui-input-inline">
                            <input type="text"  id="appdis" name="appdis" required="" lay-verify="nikename3" autocomplete="off" class="layui-input"></div>
                     <span class="x-red" id="ageerror"></span></div>
                      <div class="layui-form-item">
                        <label for="L_repass" class="layui-form-label">
                            <span class="x-red"></span>下载地址</label>
                        <div class="layui-input-inline">
                            <input type="text"  id="appdownurl" name="appdownurl" required="" lay-verify="nikename4" autocomplete="off" class="layui-input"></div>
                     <span class="x-red" id="ageerror"></span></div>
                    <div class="layui-form-item">
                        <label for="L_repass" class="layui-form-label"></label>
                        <input type="button" id="editupdate"  lay-filter="add" lay-submit="" value="添加" class="layui-btn">
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
   
        <script>layui.use(['form', 'layer','jquery'],
            function() {
                $ = layui.jquery;
                var form = layui.form,
                layer = layui.layer;

                //自定义验证规则
                form.verify({
                    nikename1: function(value) {
                        if (value.length < 1) {
                            return '书名不能为空';
                        }
                    },
                    nikename2: function(value) {
                        if (value.length < 1) {
                            return '图片不能为空';
                        }
                    },
                    nikename3: function(value) {
                        if (value.length < 1) {
                            return '介绍不能为空';
                        }
                    },
                    nikename4: function(value) {
                        if (value.length < 1) {
                            return '下载地址不能为空';
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
        		url:"${pageContext.request.contextPath}/BBook/addnewbook",
        		
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