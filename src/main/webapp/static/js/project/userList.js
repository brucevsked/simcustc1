
$(function(){
	
	$('#mytb').datagrid({ 
        height: 'auto', 
        nowrap: true, 
        striped: true, 
        border: true,  
        fit: true,//自动大小 
        url:basePath+'sys',
        remoteSort:false,  
        idField:'SUID', 
        singleSelect:true,//是否单选 
        pagination:true,//分页控件 
        rownumbers:true //行号 
    });
	
	
});