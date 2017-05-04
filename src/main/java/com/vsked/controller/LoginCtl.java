package com.vsked.controller;

import javax.servlet.http.HttpServletRequest;
import org.apache.log4j.Logger;
import org.apache.shiro.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.vsked.service.SysUserSer;



@Controller
//@Scope("prototype") //开启非单例模式 用于并发控制
public class LoginCtl {
	
	public Logger log = Logger.getLogger(LoginCtl.class);
	
	@Autowired
	private SysUserSer sysUserSer;
	
	
	@PostMapping("user")
	public String userAdd(HttpServletRequest req){
		sysUserSer.getParTest(req);
		log.info("user/add");
		return "useradd";
	}
	
	@GetMapping("user")
	@ResponseBody
	public String userList(HttpServletRequest req){
		log.info("user/list");
		return sysUserSer.sysUserList(req);
	}
	
	@PutMapping("user")
	@ResponseBody
	public String userEdit(HttpServletRequest req){
		log.info("user/edit");
		sysUserSer.getParTest(req);
		return "useredit";
	}
	
	
	@DeleteMapping("user")
	@ResponseBody
	public String userDel(){
		log.info("user/del");
		return "userdel";
	}
	
	@PatchMapping("user")
	@ResponseBody
	public String userChangePass(HttpServletRequest req){
		sysUserSer.getParTest(req);
		log.info("user/userChangePass");
		return "userpass";
	}
	
	/**
	 * 跳转到403页面只能用get方式提交
	 * @param request
	 * @return
	 */
	@GetMapping("/page403")
	public String page403() {
		return "page403";
	}
	

	
	
    @RequestMapping(value="/logout",method=RequestMethod.GET)
    public String logout(RedirectAttributes attr){
        //使用权限管理工具进行用户的退出，注销登录
        SecurityUtils.getSubject().logout();
        sysUserSer.addMessage(attr, "您已安全退出");
        return "login";
    }
	
}
