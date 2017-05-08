
/**
 * 项目路径配合base标签使用
 */
var basePath=document.getElementsByTagName('base')[0].href;

/**
 * toastr提示消息全局设置
 */
toastr.options = {
		closeButton : true,
		progressBar : true,
		showMethod : 'slideDown',
		positionClass : "toast-bottom-right",
		timeOut : 5000
};

/**
 * 系统登录成功后运行函数
 */
$(function(){
	console.log('welcome to simcustc1 system')
});

/**
 * 将指定页面载入mainDiv
 * @param pageUrl 页面地址不包括项目地址只写controller那层就可以 只有本参数时会用get方法载入
 * @param data 要传的数据 注意使用本参数时会用post方法载入后台controller需要用post接收
 * @param callback 回调函数
 */
function loadPage(pageUrl,data,callback){
	$('#mainDiv').load(basePath+pageUrl,data,callback);
}

/**
 * 载入用户列表页
 */
function userListPage(){
	loadPage('userListPage');
}

/**
 * 载入用户添加页
 */
function userAddPage(){
	loadPage('userAddPage');
}

/**
 * 载入角色列表页
 */
function roleListPage(){
	loadPage('roleListPage');
}

/**
 * 载入角色添加页
 */
function roleAddPage(){
	loadPage('roleAddPage');
}

/**
 * 载入权限列表页
 */
function permissionListPage(){
	loadPage('permissionListPage');
}

/**
 * 载入权限添加页
 */
function permissionAddPage(){
	loadPage('permissionAddPage');
}

