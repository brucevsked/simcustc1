<%@ page language="java" pageEncoding="UTF-8" %>
<%
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+request.getContextPath()+"/";
request.setAttribute("basePath", basePath);
%>

<!DOCTYPE html>
<html>
  <head>
    <base href="${basePath }">
    
    <title>用户添加</title>
    <meta http-equiv="content-type" content="text/html; charset=UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
  </head>
  
  <body>
	<div class="easyui-panel" title="用户添加">
		<form id="fm" method="post" action="${basePath }userAddproc">
			<div style="margin-bottom:20px">
     <input class="easyui-textbox" type="text" name="suName" id="suName"   size="35"  label="用户名:" data-options="required:true,missingMessage:'请输入用户名'" />
			</div>
<div style="margin-bottom:20px">
<input class="easyui-textbox" type="text" name="suPass" id="suPass" size="35" label="密码:" data-options="required:true,missingMessage:'请输入用户密码'" />
</div>
<div style="margin-bottom:20px">
<input class="easyui-textbox" type="text" name="suPass1" id="suPass1" size="35" label="确认密码:"  data-options="required:true,missingMessage:'请确认用户密码'" />
</div>
<div style="margin-bottom:20px">
<input class="easyui-textbox" type="text" name="suMobile" id="suMobile" label="手机号:" size="35" ></input>
</div>
<div style="margin-bottom:20px">
    <button type="button" class="easyui-linkbutton" onclick="submitForm();">增加</button> 
    <button type="reset" class="easyui-linkbutton">重写</button> 
</div>
		</form>
	</div>
	
  <script type="text/javascript" charset="UTF-8" src="${basePath }static/js/project/userAdd.js"></script>
  
  </body>
</html>
