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
  
  <div id="searchPanel" class="easyui-panel">
  <label>用户名</label><input id="suName" name="suName" >
  <button class="easyui-linkbutton" type="button" onclick="query()">查询</button> <br>
  <button class="easyui-linkbutton" type="button" onclick="edit()">编辑</button>
  </div>
  
    <table id="mytb" toolbar="#searchPanel">
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
