<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html class="x-admin-sm">
    <head>
        <meta charset="UTF-8">
        <title>欢迎页面-X-admin2.2</title>
        <script src="http://47.94.83.36/tools/js/jquery-3.4.1.min.js"></script>
        <meta name="renderer" content="webkit">
        <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
        <meta name="viewport" content="width=device-width,user-scalable=yes, minimum-scale=0.4, initial-scale=0.8,target-densitydpi=low-dpi" />
        <link rel="stylesheet" href="./css/font.css">
        <link rel="stylesheet" href="./css/xadmin.css">
        <script src="./lib/layui/layui.js" charset="utf-8"></script>
        <script type="text/javascript" src="./js/xadmin.js"></script>
        <!--[if lt IE 9]>
          <script src="https://cdn.staticfile.org/html5shiv/r29/html5.min.js"></script>
          <script src="https://cdn.staticfile.org/respond.js/1.4.2/respond.min.js"></script>
        <![endif]-->
       <style>
       #editpen{width:40px;height:40px;opacity:0.5;}
       </style>
   <script>
   $(function(){
	
   var thisid;
   var sex;var uage;var umail; var ufname;
   var rememberpage;
   var usersnumber;
   function searchmessage(fid){//searchmessage start
	
	   $('#tbmessage').html(" ");
	   if(fid==null){fid=1;}
	   thisid=fid;
	   $('#tbmessage').html(" ");
   	$.ajax({//ajax begin
		type:'GET',
     	url:'${pageContext.request.contextPath}/Bandroid/getAllApp?number='+fid,
     	dataType:'json',
     	async: false,
     	success:function(rs){ 		
     		$.each(rs,function(index,item){
     			
               	$('#tbmessage').append("<tr>"
                     +"<td>"
                     +"<input type='checkbox' name='id' value='1' lay-skin='primary'>" 
                     +"</td>"
                     +"<td>"+item.nid+"</td>"
                     +"<td>"+item.appname+"</td>"
                     +"<td><img src='"+item.appimgurl+"'></td>"
                     +"<td>"+item.appdis+"</td>"
                     +"<td> <a href='"+item.appdownurl+"'>"+item.appdownurl+"</a></td>"
                     +"<td class='td-manage'>"
                     
                     +"<a title='编辑'  onclick=\"xadmin.open('编辑','Blog_androidapp-edit.jsp?nid="+item.nid+"',600,400)\" href='javascript:;'>"
                     +" <i class='layui-icon'>&#xe642;</i> </a>"
                    
                     +"<a title='删除' onclick=\"checkdelete("+item.nid+")\" href='javascript:;' >"
                     +" <i class='layui-icon'>&#xe640;</i>  </a></td>"    
                  	 +"</tr>");	
     		});//each1 end
     	}//success end		  
 	});//ajax end
   }//searchmessage end
   
   
   //方法用于获取多少软件
   function getcount(){
	   
	   $.ajax({
			type:'GET',
	     	url:'${pageContext.request.contextPath}/Bandroid/howmanyapp',
	     	dataType:'json',
	     	async: false,
	     	success:function(rs){ 
	     		usersnumber = rs;
	     	}//success end
	   });//ajax end
   }//getcount() end
   getcount();
  
	//根据后台数据打印下标所在
   $.ajax({
	   	type:"GET",
	   	url:"${pageContext.request.contextPath}/Bandroid/returnPage",
	   	datatype:"json",
	   	async: false,
	   	success:function(rs){
	   		if(rs==1){
	   			
	   			if(parseInt(usersnumber)<2){
	   				$("#countpage").html("<a class='prev' href=''>&lt;&lt;</a>"
	                        +"<span class='current' id='currentthis'>"+rs+"</span>"
	                        +"<a class='num' href=''>2</a>"
	                        +"<a class='num'  href=''>3</a>"                          
	                        +"<a class='next'  href=''>&gt;&gt;</a>");
	   			} if(parseInt(usersnumber)>=2){
	   				$("#countpage").html("<a class='prev'  id='prev' onclick='goprev()'  href='javascript:;'>&lt;&lt;</a>"
	   						+"<a class='num'  href='Bandroid/changePage?num=1'>首页</a>"        
	   						+"<span class='current' id='currentthis'>"+rs+"</span>"
	                        +"<a class='num' onclick='chosenthis("+(parseInt(rs)+1)+")' href='Bandroid/changePage?num="+(parseInt(rs)+1)+"'>"+(parseInt(rs)+1)+"</a>"
	                        +"<a class='num' onclick='chosenthis("+(parseInt(rs)+2)+")'  href='Bandroid/changePage?num="+(parseInt(rs)+2)+"'>"+(parseInt(rs)+2)+"</a>"
	                        +"<a class='num'  href='Bandroid/changePage?num="+usersnumber+"'>尾页</a>" 
	                        +"<a class='next' id='next' onclick='gonext()' href='javascript:;'>&gt;&gt;</a>");
	   			}
	   		
	   		}else{
	   			$("#countpage").html("<a class='prev' id='prev' onclick='goprev()' href=''>&lt;&lt;</a>"
	   				    +"<a class='num'  href='Bandroid/changePage?num=1'>首页</a>"
	   				    +"<a class='num' onclick='chosenthis("+(parseInt(rs)-1)+")' href='Bandroid/changePage?num="+(parseInt(rs)-1)+"'>"+(parseInt(rs)-1)+"</a>"
                        +"<span class='current' id='currentthis'>"+rs+"</span>"
                        +"<a class='num'  href='Bandroid/changePage?num="+(parseInt(rs)+1)+"'>"+(parseInt(rs)+1)+"</a>" 
                        +"<a class='num'  href='Bandroid/changePage?num="+usersnumber+"'>尾页</a>" 
                        +"<a class='next' id='next' onclick='gonext()' href=''>&gt;&gt;</a>");
	   		}
	   	}// success end
	   	
   });//ajax end
   
   
 //开始即调用
	searchmessage($("#currentthis").text());
   });
   </script>
    </head>
    <body>
      
        <div class="x-nav">
          <span class="layui-breadcrumb">
            <a href="">首页</a>
            <a href="">演示</a>
            <a>
              <cite>导航元素</cite></a>
          </span>
          <a class="layui-btn layui-btn-small" style="line-height:1.6em;margin-top:3px;float:right" onclick="location.reload()" title="刷新">
            <i class="layui-icon layui-icon-refresh" style="line-height:30px"></i></a>
        </div>
        <div class="layui-fluid">
            <div class="layui-row layui-col-space15">
                <div class="layui-col-md12">
                    <div class="layui-card">
                        <div class="layui-card-body ">
                            <form class="layui-form layui-col-space5">
                           
                                <div class="layui-inline layui-show-xs-block">
                                    <input class="layui-input"  autocomplete="off" placeholder="开始日" name="start" id="start">
                                </div>
                                <div class="layui-inline layui-show-xs-block">
                                    <input class="layui-input"  autocomplete="off" placeholder="截止日" name="end" id="end">
                                </div>
                                
                                <div class="layui-inline layui-show-xs-block">
                                    <input type="text"  id="mohusearch" placeholder="请输入app名"  class="layui-input">
                                </div>
                                <div class="layui-inline layui-show-xs-block">
                                
                                    <button type="button" class="layui-btn" id="searchbutton" ><i class="layui-icon">&#xe615;</i></button>
                                
                                </div>
                            </form>
                        </div>
                        
                        <div class="layui-card-header">
                            
                            <button class="layui-btn" onclick="xadmin.open('添加用户','./Blog_androidapp-add.jsp',600,400)"><i class="layui-icon"></i>添加</button>
                        </div>
                        
                        <div class="layui-card-body layui-table-body layui-table-main">
                            <table class="layui-table layui-form" id="layui-table">
                                <thead>
                                  <tr>
                                    <th>
                                      <input type="checkbox" lay-filter="checkall" name="" lay-skin="primary">
                                    </th>
                                    <th>ID</th>
                                    <th>app名称</th>
                                    <th>图片</th>
                                    <th>介绍</th>
                                   <th>下载</th>
                                    <th>操作</th></tr>
                                </thead>
                                <tbody id="tbmessage">
                                                                
                                  
                                </tbody>
                            </table>
                        </div>
                        <div class="layui-card-body ">
                            <div class="page">
                                <div id="countpage">
                                
                                  
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div> 
    </body>
    <script>
 //前进翻页
 function gonext(){
	var currentthis = parseInt($("#currentthis").text());
	//href='users/changePage?num="+(parseInt(rs)+1)+"
	if(currentthis>=1){currentthis=currentthis+1;
	$("#next").attr("href","Bandroid/changePage?num="+currentthis);
	}	
 }
 
 //回退翻页
  function goprev(){
	var currentthis = parseInt($("#currentthis").text());
	//href='users/changePage?num="+(parseInt(rs)+1)+"
	
	if(currentthis<=1){
	$("#prev").attr("href","Bandroid/changePage?num="+currentthis);
	}else if(currentthis>1)	{currentthis=currentthis-1;
		$("#prev").attr("href","Bandroid/changePage?num="+currentthis);
	}
 }


 //搜索
 $("#searchbutton").click(function(){ 
	 var mohusearch = $("#mohusearch").val();	
	 $.ajax({		 
		 type:"POST",
		 url:"${pageContext.request.contextPath}/Bandroid/selectappByName",
		 data:{"appname":mohusearch},
		 async:false,
		 dataType:"json",
		 success:function(rs){
			 $('#tbmessage').html("");
			 $('#tbmessage').append("<tr>"
                     +"<td>"
                     +"<input type='checkbox' name='id' value='1' lay-skin='primary'>" 
                     +"</td>"
                     +"<td>"+rs.nid+"</td>"
                     +"<td>"+rs.appname+"</td>"
                     +"<td><img src='"+rs.appimgurl+"'></td>"
                     +"<td>"+rs.appdis+"</td>"
                     +"<td> <a href='"+rs.appdis+"'>"+rs.appdis+"</a></td>"
                     +"<td class='td-manage'>"  
                     +"<a title='编辑'  onclick=\"xadmin.open('编辑','Blog_androidapp-edit.jsp?nid="+rs.nid+"',600,400)\" href='javascript:;'>"
                     +" <i class='layui-icon'>&#xe642;</i> </a>"
                     +"<a title='删除' onclick=\"checkdelete("+rs.nid+")\" href='javascript:;' >"
                     +" <i class='layui-icon'>&#xe640;</i>  </a></td>"    
                  	 +"</tr>");	
		 }
	 })//ajax结束
 });
 
 $("#mohusearch").keydown(function(event){
	 if(event.keyCode==13){
		 var mohusearch = $("#mohusearch").val();	
		 $.ajax({		 
			 type:"POST",
			 url:"${pageContext.request.contextPath}/Bandroid/selectappByName",
			 data:{"appname":mohusearch},
			 async:false,
			 dataType:"json",
			 success:function(rs){
				 $('#tbmessage').html("");
				 $('#tbmessage').append("<tr>"
	                     +"<td>"
	                     +"<input type='checkbox' name='id' value='1' lay-skin='primary'>" 
	                     +"</td>"
	                     +"<td>"+rs.nid+"</td>"
	                     +"<td>"+rs.appname+"</td>"
	                     +"<td><img src='"+rs.appimgurl+"'></td>"
	                     +"<td>"+rs.appdis+"</td>"
	                     +"<td> <a href='"+rs.appdis+"'>"+rs.appdis+"</a></td>"
	                     +"<td class='td-manage'>"  
	                     +"<a title='编辑'  onclick=\"xadmin.open('编辑','Blog_androidapp-edit.jsp?nid="+rs.nid+"',600,400)\" href='javascript:;'>"
	                     +" <i class='layui-icon'>&#xe642;</i> </a>"
	                     +"<a title='删除' onclick=\"checkdelete("+rs.nid+")\" href='javascript:;' >"
	                     +" <i class='layui-icon'>&#xe640;</i>  </a></td>"    
	                  	 +"</tr>");	
			 }
		 })//ajax结束
	 }
	});

function chosenthis(obj){
$("#countpage").html("");
for(var i=1;i<=4;i++){
	if(obj==i){
		$("#countpage").append("<span class='current' id='currentthis'>"+i+"</span>");
	}else{
		$("#countpage").append("<a class='num' onclick='chosenthis("+i+")' href='Blog/changePage?num="+i+"'>"+i+"</a>");
	}
}
}
    
      layui.use(['laydate','form'], function(){
        var laydate = layui.laydate;
        var  form = layui.form;

        

        // 监听全选
        form.on('checkbox(checkall)', function(data){

          if(data.elem.checked){
            $('tbody input').prop('checked',true);
          }else{
            $('tbody input').prop('checked',false);
          }
          form.render('checkbox');
        }); 
        
        //执行一个laydate实例
        laydate.render({
          elem: '#start' //指定元素
        });

        //执行一个laydate实例
        laydate.render({
          elem: '#end' //指定元素
        });


      });



      /*用户-删除*/
      function member_del(obj,id){
          layer.confirm('确认要删除吗？',function(index){
              //发异步删除数据
              $(obj).parents("tr").remove();
              layer.msg('已删除!',{icon:1,time:1000});
          });
      }


      function checkdelete(obj){
    	  if(confirm("确定要删除？")){
    		  $.ajax({
    			  type:"POST",
    			  url:"Bandroid/deleteapp",
    			  data:{"nid":obj},
    			  async:true,
    			  success:function(rs){
    				  if(rs=="yes"){
    					  alert("删除成功");
    					  window.location.reload();
    				  }else{
    					  alert("删除失败");
    					  window.location.reload();
    				  }
    			  }
    		  })
    	  }/**/
      }
    </script>
</html>
</html>