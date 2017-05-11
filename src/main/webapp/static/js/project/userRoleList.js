
$(function(){
	initNoSysRoleList();
	initHasSysRoleList();
	$.parser.parse();//重新加载样式
});

function initNoSysRoleList(){
	var suId=$('#suId').val();
	var myBasePath=basePath+'noSysRoleList';
	
	$('#noSysRoleList').empty();
	
	$.post(myBasePath,{ suId: suId },function (dt){
		dt=JSON.parse(dt);
		$.each(dt,function (index,el){
			$('#noSysRoleList').append('<option value="'+el.SRID+'">'+el.SRNAME+'</option>');
		});
	});
	
}

function initHasSysRoleList(){
	var suId=$('#suId').val();
	var myBasePath=basePath+'hasSysRoleList';
	
	$('#srIds').empty();
	
	$.post(myBasePath,{ suId: suId },function (dt){
		dt=JSON.parse(dt);
		$.each(dt,function (index,el){
			$('#srIds').append('<option value="'+el.SRID+'">'+el.SRNAME+'</option>');
		});
	});
}

function submitForm(){
	var suId=$('#suId').val();
	var hasSysRoleList=getSelectValues('srIds');
	//TODO goon fixed here
	console.log(hasSysRoleList)
}