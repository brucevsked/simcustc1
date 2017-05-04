package com.vsked.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.vsked.service.SysUserSer;


@Controller
public class UserController {
	
	private Logger log = Logger.getLogger(UserController.class);
	
	@Autowired
	private SysUserSer sysUserSer;
	
	@GetMapping("login")
	public String loginPage(HttpServletRequest req){
		log.debug(""+req.getRequestedSessionId());
		return "login";
	}
	
	/**
	 * 创建用户会话 只能用post方式提交
	 * @param req
	 * @return
	 */
	@PostMapping("/login")
	public String login(HttpServletRequest req) {
		return sysUserSer.login(req);
	}
	
	@GetMapping("index")
	public String index(){
		return "index";
	}

}
