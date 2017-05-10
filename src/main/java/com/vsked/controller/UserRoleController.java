package com.vsked.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserRoleController {

	@GetMapping("userRoleListPage")
	public String userRoleListPage(){
		return "userRoleList";
	}
	
	/*
	@PostMapping("userRoleListData")
	@ResponseBody
	public String userRoleListData(HttpServletRequest req){
		return sysUserSer.sysUserRoleList(req);
	}
	*/
}
