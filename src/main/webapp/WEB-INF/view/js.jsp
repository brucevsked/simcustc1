<%@ page language="java" pageEncoding="UTF-8" %>
<%
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+request.getContextPath()+"/";
request.setAttribute("basePath", basePath);
%>

  <script type="text/javascript" charset="UTF-8" src="${basePath }static/js/lib/jquery.min.js"></script>
  <script type="text/javascript" charset="UTF-8" src="${basePath }static/js/lib/jquery-easyui/jquery.easyui.min.js"></script>