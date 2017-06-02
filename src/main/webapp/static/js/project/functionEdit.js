
$(function(){
	
	$('#spId').combobox({
	    url:basePath+'permissionListDataAll',
	    valueField:'SPID',
	    textField:'SPNICK',
	    value:$('#spIdOld').val() //设置combobox默认选中值
	});
    $.parser.parse();//重新加载样式
	initPagePermission(); //权限初始化
    $('#sfValue').textbox('textbox').focus(); 
});

function submitForm(){
	if(!$("#fm").form('validate')){
		return false;
    }
	
	var sfId=$('#sfId').val();
	var sfValue=$('#sfValue').val();
	var spId=$('#spId').val();
	var sfType=$('input:radio[name="sfType"]:checked').val();
	
	var myBasePath=$('#fm').attr("action");
	
	$.post(myBasePath,
			{
		sfId:sfId,
		sfValue: sfValue,
		spId:spId,
		sfType:sfType
		    },function (dt){
		    	toastr.info(dt, '修改结果');
		    	}
		    );
}

/**
 * 初始化权限,将没权限的按钮移除
 */
function initPagePermission(){
	isExistPermission('functionEditProc:post','editBt');
}