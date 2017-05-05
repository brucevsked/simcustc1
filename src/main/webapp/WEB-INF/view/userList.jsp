<%@ page language="java" pageEncoding="UTF-8" %>
<%
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+request.getContextPath()+"/";
request.setAttribute("basePath", basePath);
%>

<!DOCTYPE html>
<html>
  <head>
    <base href="${basePath }">
    
    <title>用户列表</title>
    <meta http-equiv="content-type" content="text/html; charset=UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
  </head>
  
  <body>
    <table id="mytb">
    <thead>
      <tr>
        <th field="SUNAME" >用户名</th>
        <th field="SUMOBILE" >手机号</th>
        <th field="SUNICK" >别名</th>
        <th field="SUQQ" > qq号</th>
      </tr>
    </thead>
    </table>
    
  <script type="text/javascript" charset="UTF-8" src="${basePath }static/js/project/userList.js"></script>
  
  </body>
</html>
