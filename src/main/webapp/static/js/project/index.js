
var basePath=document.getElementsByTagName('base')[0].href;

toastr.options = {
		closeButton : true,
		progressBar : true,
		showMethod : 'slideDown',
		positionClass : "toast-bottom-right",
		timeOut : 5000
};

$(function(){
	console.log('welcome to simcustc1 system')
});

function loadPage(pageUrl,data,callback){
	$('#mainDiv').load(basePath+pageUrl,data,callback);
}

function userListPage(){
	loadPage('userListPage');
}

function userAddPage(){
	loadPage('userAddPage');
}

function roleListPage(){
	loadPage('roleListPage');
}

function roleAddPage(){
	loadPage('roleAddPage');
}