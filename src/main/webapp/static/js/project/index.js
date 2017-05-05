
var basePath=document.getElementsByTagName('base')[0].href;

$(function(){
	console.log('here is index page')
});

function loadPage(pageUrl,data,callback){
	$('#mainDiv').load(basePath+pageUrl,data,callback);
}

function userList(){
	loadPage('userListPage');
}