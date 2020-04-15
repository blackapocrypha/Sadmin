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
        <script src="./lib/layui/layui.js" charset="utf-8"></script>
        <script type="text/javascript" src="./js/xadmin.js"></script>
        <script src="http://47.94.83.36/tools/js/jquery-3.4.1.min.js"></script>
        <script type="text/javascript" src="./js/welcome.js"></script>
        <!-- 让IE8/9支持媒体查询，从而兼容栅格 -->
        <!--[if lt IE 9]>
          <script src="https://cdn.staticfile.org/html5shiv/r29/html5.min.js"></script>
          <script src="https://cdn.staticfile.org/respond.js/1.4.2/respond.min.js"></script>
        <![endif]-->
         <script>
   
         
         
        function writeCurrentDate() {
        var now = new Date();
        var year = now.getFullYear(); //得到年份
        var month = now.getMonth();//得到月份
        var date = now.getDate();//得到日期
        var day = now.getDay();//得到周几
        var hour = now.getHours();//得到小时
        var minu = now.getMinutes();//得到分钟
        var sec = now.getSeconds();//得到秒  
       
        month = month + 1;
        if (month < 10) month = "0" + month;
        if (date < 10) date = "0" + date;
        if (hour < 10) hour = "0" + hour;
        if (minu < 10) minu = "0" + minu;
        if (sec < 10) sec = "0" + sec;
       
       
        var time = "";
        time = year + "年" + month + "月" + date + "日" + " " + hour + ":" + minu ;
        //当前日期赋值给当前日期输入框中（jQuery easyUI）
        $("#currentDate2").html(time);
        //设置得到当前日期的函数的执行间隔时间，每1000毫秒刷新一次。
        var timer = setTimeout("writeCurrentDate()", 1000);
      }
   
    </script>
    </head>
    <body onload="writeCurrentDate()">
   
        <div class="layui-fluid">
            <div class="layui-row layui-col-space15">
                <div class="layui-col-md12">
                    <div class="layui-card">
                        <div class="layui-card-body ">
                            <blockquote  class="layui-elem-quote">欢迎管理员
                                <span class="x-red"></span>！当前时间:<font id="currentDate2"></font>
                            </blockquote>
                        </div>
                    </div>
                </div>
                <div class="layui-col-md12">
                    <div class="layui-card">
                        <div class="layui-card-header">数据统计</div>
                        <div class="layui-card-body ">
                            <ul class="layui-row layui-col-space10 layui-this x-admin-carousel x-admin-backlog">
                               
                                <li class="layui-col-md2 layui-col-xs6">
                                    <a href="javascript:;" class="x-admin-backlog-body">
                                        <h3>会员数</h3>
                                        <p>
                                            <cite id="Usersmember"></cite></p>
                                    </a>
                                </li>
                                <li class="layui-col-md2 layui-col-xs6">
                                    <a href="javascript:;" class="x-admin-backlog-body">
                                        <h3>留言数</h3>
                                        <p>
                                            <cite id="leaveMessage"></cite></p>
                                    </a>
                                </li>
                                 <li class="layui-col-md2 layui-col-xs6">
                                    <a href="javascript:;" class="x-admin-backlog-body">
                                        <h3>工具网站</h3>
                                        <p>
                                            <cite id="toolwebsite"></cite></p>
                                    </a>
                                </li>
                                <li class="layui-col-md2 layui-col-xs6">
                                    <a href="javascript:;" class="x-admin-backlog-body">
                                        <h3>音乐资源</h3>
                                        <p>
                                            <cite id="musicnumber"></cite></p>
                                    </a>
                                </li>
                                <li class="layui-col-md2 layui-col-xs6">
                                    <a href="javascript:;" class="x-admin-backlog-body">
                                        <h3>安卓工具</h3>
                                        <p>
                                            <cite id="anroidtools"></cite></p>
                                    </a>
                                </li>
                               
                            </ul>
                        </div>
                    </div>
                </div>
                <div class="layui-col-sm6 layui-col-md3">
                    <div class="layui-card">
                        <div class="layui-card-header">下载
                            <span class="layui-badge layui-bg-cyan layuiadmin-badge">月</span></div>
                        <div class="layui-card-body  ">
                            <p class="layuiadmin-big-font">33,555</p>
                            <p>新下载
                                <span class="layuiadmin-span-color">10%
                                    <i class="layui-inline layui-icon layui-icon-face-smile-b"></i></span>
                            </p>
                        </div>
                    </div>
                </div>
                <div class="layui-col-sm6 layui-col-md3">
                    <div class="layui-card">
                        <div class="layui-card-header">下载
                            <span class="layui-badge layui-bg-cyan layuiadmin-badge">月</span></div>
                        <div class="layui-card-body ">
                            <p class="layuiadmin-big-font">33,555</p>
                            <p>新下载
                                <span class="layuiadmin-span-color">10%
                                    <i class="layui-inline layui-icon layui-icon-face-smile-b"></i></span>
                            </p>
                        </div>
                    </div>
                </div>
                <div class="layui-col-sm6 layui-col-md3">
                    <div class="layui-card">
                        <div class="layui-card-header">下载
                            <span class="layui-badge layui-bg-cyan layuiadmin-badge">月</span></div>
                        <div class="layui-card-body ">
                            <p class="layuiadmin-big-font">33,555</p>
                            <p>新下载
                                <span class="layuiadmin-span-color">10%
                                    <i class="layui-inline layui-icon layui-icon-face-smile-b"></i></span>
                            </p>
                        </div>
                    </div>
                </div>
                <div class="layui-col-sm6 layui-col-md3">
                    <div class="layui-card">
                        <div class="layui-card-header">下载
                            <span class="layui-badge layui-bg-cyan layuiadmin-badge">月</span></div>
                        <div class="layui-card-body ">
                            <p class="layuiadmin-big-font">33,555</p>
                            <p>新下载
                                <span class="layuiadmin-span-color">10%
                                    <i class="layui-inline layui-icon layui-icon-face-smile-b"></i></span>
                            </p>
                        </div>
                    </div>
                </div>
                <div class="layui-col-md12">
                    <div class="layui-card">
                        <div class="layui-card-header">系统信息</div>
                        <div class="layui-card-body ">
                            <table class="layui-table">
                                <tbody>
                                    <tr>
                                        <th>当前浏览器</th>
                                        <td id="info_browser"></td></tr>
                                    <tr>
                                        <th>服务器地址</th>
                                        <td>www.pslywebsite.top:8080</td></tr>
                                    <tr>
                                        <th>操作系统</th>
                                        <td id="info_os"></td></tr>
                                    <tr>
                                        <th>运行环境</th>
                                        <td>Apache/2.4  Tomcat/9  </td></tr>
                                    <tr>
                                        <th>PHP版本</th>
                                        <td>7.2</td></tr>
                                    <tr>
                                        <th>PHP运行方式</th>
                                        <td>cgi-fcgi</td></tr>
                                    <tr>
                                        <th>MYSQL版本</th>
                                        <td>5.1</td></tr>
                                    
                                    <tr>
                                        <th>上传附件限制</th>
                                        <td>2M</td></tr>
                                    <tr>
                                        <th>执行时间限制</th>
                                        <td>30s</td></tr>
                                    <tr>
                                        <th>剩余空间</th>
                                        <td>36015.2M</td></tr>
                                </tbody>
                            </table>
                        </div>
                    </div>
                </div>
                
                <style id="welcome_style"></style>
                <div class="layui-col-md12">
                    <blockquote class="layui-elem-quote layui-quote-nm"></blockquote></div>
            </div>
        </div>
        </div>
        
    </body>
</html>