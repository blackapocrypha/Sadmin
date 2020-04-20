<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html class="x-admin-sm">
    <head>
        <meta charset="UTF-8">
        <title>综合软件导航后台</title>
        <meta name="renderer" content="webkit|ie-comp|ie-stand">
        <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
        <meta name="viewport" content="width=device-width,user-scalable=yes, minimum-scale=0.4, initial-scale=0.8,target-densitydpi=low-dpi" />
        <meta http-equiv="Cache-Control" content="no-siteapp" />
        <link rel="stylesheet" href="./css/font.css">
        <link rel="stylesheet" href="./css/xadmin.css">
        <link rel="shortcut icon" href="http://47.94.83.36/tools/img/soft.ico" /> 
        <!-- <link rel="stylesheet" href="./css/theme5.css"> -->
        <script src="./lib/layui/layui.js" charset="utf-8"></script>
         <script src="http://47.94.83.36/tools/js/jquery-3.4.1.min.js"></script>
        <script type="text/javascript" src="./js/xadmin.js"></script>
        <!-- 让IE8/9支持媒体查询，从而兼容栅格 -->
        <!--[if lt IE 9]>
          <script src="https://cdn.staticfile.org/html5shiv/r29/html5.min.js"></script>
          <script src="https://cdn.staticfile.org/respond.js/1.4.2/respond.min.js"></script>
        <![endif]-->
        <script>
        $(function(){
        	
        	var status = $("#statusAdmin").val();
        	if(status=="1"){
        		$("#userimportent").append("<li>"
                        +"<a onclick=\"xadmin.add_tab('管理员管理','admin-list.jsp')\">"
                        +"<i class='iconfont'>&#xe6a7;</i>"
                        +"<cite>管理员管理</cite></a>"
               	     	+" </li>");
        	}
        	
        });
        </script>
    </head>
    <body class="index">
    
     
        <!-- 顶部开始 -->
        <div class="container">
            <div class="logo">
                <a href="./index.jsp">综合软件导航</a></div>
            <div class="left_open">
                <a><i title="展开左侧栏" class="iconfont">&#xe699;</i></a>
            </div>
            
            <ul class="layui-nav right" lay-filter="">
                <li class="layui-nav-item">
                    
                <c:forEach items="${sessionScope.admin}" var="p" >
					<a href="javascript:;">
						${p.username}
					</a>
					<input id="statusAdmin" value="${p.status}" type="hidden">
				</c:forEach>     
		
					
                    <dl class="layui-nav-child">
                        <!-- 二级菜单 -->
                        <dd>
	                        <c:forEach items="${sessionScope.admin}" var="p" >
									 <a onclick="xadmin.open('个人信息','AdminSelf.jsp?username=${p.username}')">个人信息</a>
					 	
							</c:forEach>  
                        </dd>                    
                        <dd>
                            <a href="SAC/logout">退出</a></dd>
                    </dl>
                </li>
                <li class="layui-nav-item to-index">
                    <a href="http://www.pslywebsite.top:8080/Software">前台首页</a></li>
            </ul>
        </div>
        <!-- 顶部结束 -->
        <!-- 中部开始 -->
        <!-- 左侧菜单开始 -->
        <div class="left-nav">
            <div id="side-nav">
                <ul id="nav">
                    <li>
                        <a href="javascript:;">
                            <i class="iconfont left-nav-li" lay-tips="会员管理">&#xe6b8;</i>
                            <cite>会员管理</cite>
                            <i class="iconfont nav_right">&#xe697;</i></a>
                        <ul class="sub-menu" id="userimportent">
                           
                            <li>
                                <a onclick="xadmin.add_tab('会员列表(静态表格)','member-list.jsp')">
                                    <i class="iconfont">&#xe6a7;</i>
                                    <cite>用户管理</cite></a>
                            </li>
                           <!--  <li>
                                <a onclick="xadmin.add_tab('管理员列表','member-list1.html',true)">
                                    <i class="iconfont">&#xe6a7;</i>
                                    <cite>管理员列表</cite></a>
                            </li>
                            -->
                           
                        </ul>
                    </li>
                    
                    <li>
                        <a href="javascript:;">
                            <i class="iconfont left-nav-li" lay-tips="页面管理">&#xe723;</i>
                            <cite>页面管理</cite>
                            <i class="iconfont nav_right">&#xe697;</i></a>
                        <ul class="sub-menu">
                           <li>
                                <a onclick="xadmin.add_tab('软件管理','Soft-list.jsp')">
                                    <i class="iconfont">&#xe6a7;</i>
                                    <cite>软件管理</cite></a>
                            </li>
                            <li>
                                <a onclick="xadmin.add_tab('技术支持','Tsupport.jsp')">
                                    <i class="iconfont">&#xe6a7;</i>
                                    <cite>技术支持</cite></a>
                            </li>
                        </ul>
                    </li>
                  
                   
                    <li>
                        <a href="javascript:;">
                            <i class="iconfont left-nav-li" lay-tips="博客管理">&#xe6e9;</i>
                            <cite>博客管理</cite>
                            <i class="iconfont nav_right">&#xe697;</i></a>
                        <ul class="sub-menu">
                            <li>
                                <a onclick="xadmin.add_tab('在线工具','Blog_onlinetools.jsp')">
                                    <i class="iconfont">&#xe6a7;</i>
                                    <cite>在线工具</cite></a>
                            </li>
                            <li>
                                <a onclick="xadmin.add_tab('安卓软件','Blog_androidsof.jsp')">
                                    <i class="iconfont">&#xe6a7;</i>
                                    <cite>安卓软件</cite></a>
                            </li>
                            <li>
                                <a onclick="xadmin.add_tab('安卓游戏','Blog_androidgame.jsp')">
                                    <i class="iconfont">&#xe6a7;</i>
                                    <cite>安卓游戏</cite></a>
                            </li>
                            <li>
                                <a onclick="xadmin.add_tab('电子书籍','Blog_books.jsp')">
                                    <i class="iconfont">&#xe6a7;</i>
                                    <cite>电子书籍</cite></a>
                            </li>
                            <li>
                                <a onclick="xadmin.add_tab('电脑游戏','Blog_pcgame.jsp')">
                                    <i class="iconfont">&#xe6a7;</i>
                                    <cite>电脑游戏</cite></a>
                            </li>
                            <li>
                                <a onclick="xadmin.add_tab('音乐资源','Blog_music.jsp')">
                                    <i class="iconfont">&#xe6a7;</i>
                                    <cite>音乐资源</cite></a>
                            </li>
                        </ul>
                    </li>
                    
                     <li>
                        <a href="javascript:;">
                            <i class="iconfont left-nav-li" lay-tips="留言管理">&#xe713;</i>
                            <cite>留言管理</cite>
                            <i class="iconfont nav_right">&#xe697;</i></a>
                        <ul class="sub-menu">
                           <li>
                                <a onclick="xadmin.add_tab('在线工具留言','Blog_onlinetoolMessage.jsp')">
                                    <i class="iconfont">&#xe6a7;</i>
                                    <cite>在线工具留言</cite></a>
                            </li>
                            <li>
                                <a onclick="xadmin.add_tab('安卓软件留言','Blog_androidappMessage.jsp')">
                                    <i class="iconfont">&#xe6a7;</i>
                                    <cite>安卓软件留言</cite></a>
                            </li>
                            <li>
                                <a onclick="xadmin.add_tab('安卓游戏留言','Blog_androidgameMessage.jsp')">
                                    <i class="iconfont">&#xe6a7;</i>
                                    <cite>安卓游戏留言</cite></a>
                            </li>
                             <li>
                                <a onclick="xadmin.add_tab('电子书籍留言','Blog_txtMessage.jsp')">
                                    <i class="iconfont">&#xe6a7;</i>
                                    <cite>电子书籍留言</cite></a>
                            </li>
                            <li>
                                <a onclick="xadmin.add_tab('电脑游戏留言','Blog_pcgameMessage.jsp')">
                                    <i class="iconfont">&#xe6a7;</i>
                                    <cite>电脑游戏留言</cite></a>
                            </li>
                             <li>
                                <a onclick="xadmin.add_tab('音乐资源留言','Blog_musicMessage.jsp')">
                                    <i class="iconfont">&#xe6a7;</i>
                                    <cite>音乐资源留言</cite></a>
                            </li>
                        </ul>
                    </li>
                    
                    <li>
                        <a href="javascript:;">
                            <i class="iconfont left-nav-li" lay-tips="系统统计">&#xe6ce;</i>
                            <cite>系统工具</cite>
                            <i class="iconfont nav_right">&#xe697;</i></a>
                        <ul class="sub-menu">
                          
                        	 <li>
                                <a onclick="xadmin.add_tab('留言室','SystemTool_chatroom.jsp')">
                                    <i class="iconfont">&#xe6a7;</i>
                                    <cite>留言室</cite></a>
                            </li>
                            <li>
                                <a onclick="xadmin.add_tab('地图','echarts3.jsp')">
                                    <i class="iconfont">&#xe6a7;</i>
                                    <cite>地图</cite></a>
                            </li>
                            <li>
                                <a onclick="xadmin.add_tab('饼图','echarts4.jsp')">
                                    <i class="iconfont">&#xe6a7;</i>
                                    <cite>饼图</cite></a>
                            </li>
                           
                            <li>
                                <a onclick="xadmin.add_tab('仪表图','echarts8.jsp')">
                                    <i class="iconfont">&#xe6a7;</i>
                                    <cite>仪表图</cite></a>
                            </li>
                        </ul>
                    </li>
                    <li>
                        <a href="javascript:;">
                            <i class="iconfont left-nav-li" lay-tips="图标字体">&#xe6b4;</i>
                            <cite>图标字体</cite>
                            <i class="iconfont nav_right">&#xe697;</i></a>
                        <ul class="sub-menu">
                            <li>
                                <a onclick="xadmin.add_tab('图标对应字体','unicode.jsp')">
                                    <i class="iconfont">&#xe6a7;</i>
                                    <cite>图标对应字体</cite></a>
                            </li>
                        </ul>
                    </li>
                    <li>
                        <a href="javascript:;">
                            <i class="iconfont left-nav-li" lay-tips="其它页面">&#xe6b4;</i>
                            <cite>其它页面</cite>
                            <i class="iconfont nav_right">&#xe697;</i></a>
                        <ul class="sub-menu">
                            <li>
                                <a href="login.jsp" target="_blank">
                                    <i class="iconfont">&#xe6a7;</i>
                                    <cite>登录页面</cite></a>
                            </li>
                            <li>
                                <a onclick="xadmin.add_tab('错误页面','error.jsp')">
                                    <i class="iconfont">&#xe6a7;</i>
                                    <cite>错误页面</cite></a>
                            </li>
                           
                            <li>
                                <a onclick="xadmin.add_tab('更新日志','log.jsp')">
                                    <i class="iconfont">&#xe6a7;</i>
                                    <cite>更新日志</cite></a>
                            </li>
                        </ul>
                    </li>
                    
                </ul>
            </div>
        </div>
        <!-- <div class="x-slide_left"></div> -->
        <!-- 左侧菜单结束 -->
        <!-- 右侧主体开始 -->
        <div class="page-content">
            <div class="layui-tab tab" lay-filter="xbs_tab" lay-allowclose="false">
                <ul class="layui-tab-title">
                    <li class="home">
                        <i class="layui-icon">&#xe68e;</i>我的桌面</li></ul>
                <div class="layui-unselect layui-form-select layui-form-selected" id="tab_right">
                    <dl>
                        <dd data-type="this">关闭当前</dd>
                        <dd data-type="other">关闭其它</dd>
                        <dd data-type="all">关闭全部</dd></dl>
                </div>
                <div class="layui-tab-content">
                    <div class="layui-tab-item layui-show">
                        <iframe src='./welcome.jsp' frameborder="0" scrolling="yes" class="x-iframe"></iframe>
                    </div>
                </div>
                <div id="tab_show"></div>
            </div>
        </div>
        <div class="page-content-bg"></div>
        <style id="theme_style"></style>
        <!-- 右侧主体结束 -->
        <!-- 中部结束 -->
     
    </body>

</html>