package com.vsked.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.vsked.service.SysMenuSer;

@Controller
public class MenuController {
	
	@Autowired
	SysMenuSer sysMenuSer;
	
	@GetMapping("menuListPage")
	public String menuListPage(){
		return "menuList";
	}
	
	@PostMapping("menuListData")
	@ResponseBody
	public String menuListData(HttpServletRequest req){
		return sysMenuSer.sysMenuList(req);
	}
	
	@PostMapping("menuListDataAll")
	@ResponseBody
	public String menuListDataAll(){
		return sysMenuSer.sysMenuList();
	}
	
	@GetMapping("menuAddPage")
	public String menuAddPage(){
		return "menuAdd";
	}
	
	@PostMapping("menuAddProc")
	@ResponseBody
	public String menuAddProc(HttpServletRequest req){
		return sysMenuSer.menuAddProc(req);
	}
}
