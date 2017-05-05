package com.vsked.service;


import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.session.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.PageHelper;
import com.vsked.common.BaseJson;
import com.vsked.common.Page;
import com.vsked.dao.SysUserDao;
import com.vsked.service.BaseService;


@Service
@Transactional
public class SysUserSer extends BaseService{
	
	private static final Logger log = Logger.getLogger(SysUserSer.class);
	
	@Autowired
	private SysUserDao sysUserDao;
	
	/**
	 * 登录业务逻辑
	 * @param req
	 * @return
	 */
	public String login(HttpServletRequest req){
		try{
			Map<String, Object> m=getMaps(req);
			String suName=(String)m.get("suName");
			String suPass=(String)m.get("suPass");
			if(StringUtils.isNotEmpty(suName) && StringUtils.isNotEmpty(suPass) ){
				suPass=DigestUtils.md5Hex(suPass.getBytes());
				AuthenticationToken token=new UsernamePasswordToken(suName, suPass);
				//使用shiro管理登录
				SecurityUtils.getSubject().login(token);
				log.info("i has login ok"+suName);
				return "index";
			}else{
				req.setAttribute("error", "用户名或密码为空！");
				return "login";
			}
		}catch(Exception e){
			log.error(e.getMessage());
			req.setAttribute("error", "用户名或密码错误请重新输入！");
			return "login";
		}
	}
	
	/**
	 * 根据用户名获取记录
	 * @param suName
	 * @return
	 */
	public Map<String, Object> getSysUserBySuName(String suName) {
		Map<String, Object> m=null;
		try{
			m=sysUserDao.getSysUserBySuName(suName);
		}catch(Exception e){
			log.error(e.getMessage());
		}
		return m;
	}
	
	/**
	 * 根据主键获取记录
	 * @param suId
	 * @return
	 */
	public Map<String, Object> getSysUserBySuId(String suId) {
		Map<String, Object> m=null;
		try{
			m=sysUserDao.getSysUserBySuId(suId);
		}catch(Exception e){
			log.error(e.getMessage());
		}
		return m;
	}
	
	/**
	 * 获取用户数量
	 * @param m
	 * @return
	 */
	public int getSysUserCount(Map<String, Object> m){
		int sysUserCount=0;
		try{
			sysUserCount=sysUserDao.getSysUserCount(m);
		}catch(Exception e){
			log.error(e.getMessage());
		}
		return sysUserCount;
	}

	
	/**
	 * 跳转到编辑用户页
	 * @param suId
	 * @return
	 */
	public String sysUserEditPage(String suId){
		try{
			Map<String, Object> sysUser=getSysUserBySuId(suId);
			Session session=getSession();
			session.setAttribute("sysUser", sysUser);
		}catch(Exception e){
			log.error(e.getMessage());
		}
		return "system/sysUserEdit";
	}
	
	/**
	 * 跳转到密码修改页
	 * @param suId
	 * @return
	 */
	public String sysUserChangePassPage(String suId){
		try{
			Map<String, Object> sysUser=getSysUserBySuId(suId);
			Session session=getSession();
			session.setAttribute("sysUser", sysUser);
		}catch(Exception e){
			log.error(e.getMessage());
		}
		return "system/sysUserChangePass";
	}
	
	public void getParTest(HttpServletRequest req){
		Map<String, Object> m=getMaps(req);
		log.debug(m);
	}
	
	public String sysUserList(HttpServletRequest req){
		StringBuilder sb=new StringBuilder();
		try{
		Map<String, Object> m=getMaps(req); //封装前台参数为map
		Page p=getPage(m);//提取分页参数
		int total=getSysUserCount(m);
		p.setCount(total);
		int pageNum=p.getCurrentPage();
		int pageSize=p.getPageSize();
		
		sb.append("{");
		sb.append(""+getKey("page")+":"+p.getCurrentPage()+",");
		sb.append(""+getKey("total")+":"+p.getNumCount()+",");
		sb.append(""+getKey("records")+":"+p.getCount()+",");
		sb.append(""+getKey("rows")+":"+"");
		
		PageHelper.startPage(pageNum, pageSize);//mybatis分页插件
		List<Map<String, Object>> dataList=sysUserDao.getSysUserList(m);
		String dataListJson=BaseJson.listToJson(dataList);
		sb.append(dataListJson);
		sb.append("}");
		}catch(Exception e){
			log.error(e.getMessage());
		}
		
		return sb.toString();
	}
	
}
