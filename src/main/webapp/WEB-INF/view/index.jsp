<%@ page language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
<%
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+request.getContextPath()+"/";
request.setAttribute("basePath", basePath);
%>
<!DOCTYPE html>
<html>
<head>
    <base href="${basePath }">
    <meta http-equiv="content-type" content="text/html; charset=UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    
    <link rel="stylesheet" href="${basePath }static/js/lib/jquery-easyui/themes/default/easyui.css"/>
    <link rel="stylesheet" href="${basePath }static/js/lib/jquery-easyui/themes/icon.css"/>
    <link rel="stylesheet" href="${basePath }static/js/lib/toastr/toastr.min.css"/>
    <link rel="stylesheet" href="${basePath }static/css/global.css"/>

</head>
<body>
    <div id="cc" class="easyui-layout" style="width:100%;height:100%;">
        <div data-options="region:'north',title:'菜单',split:true" style="height:80px;" id="menuDiv">
        <!-- menu start -->
        <div class="easyui-panel" style="padding:5px;">
        <a href="${basePath }index" class="easyui-linkbutton" data-options="plain:true">主页</a>
        <a href="#" class="easyui-splitbutton" data-options="menu:'#mm1'">系统管理</a>
        <a href="${basePath }logout" class="easyui-linkbutton" >退出登录</a>
        </div>
<div id="mm1">
<div onclick="userList();">用户列表</div>
<div>用户添加</div>
<div>角色列表</div>
<div>角色添加</div>
<div>权限列表</div>
<div>权限添加</div>
</div>
         <!-- menu end -->
        </div>
        <div data-options="region:'center'" id="mainDiv"></div>
    </div>

  <script type="text/javascript" charset="UTF-8" src="${basePath }static/js/jquery.min.js"></script>
  <script type="text/javascript" charset="UTF-8" src="${basePath }static/js/lib/jquery-easyui/jquery.easyui.min.js"></script>
  <script type="text/javascript" charset="UTF-8" src="${basePath }static/js/lib/toastr/toastr.min.js"></script>
  <script type="text/javascript" charset="UTF-8" src="${basePath }static/js/project/index.js"></script>
</body>
</html>