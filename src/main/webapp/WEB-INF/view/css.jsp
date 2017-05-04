<%@ page language="java" pageEncoding="UTF-8" %>
<%
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+request.getContextPath()+"/";
request.setAttribute("basePath", basePath);
%>

<link rel="stylesheet" href="${basePath }static/js/lib/jquery-easyui/themes/default/easyui.css"/>
<link rel="stylesheet" href="${basePath }static/js/lib/jquery-easyui/themes/icon.css"/>