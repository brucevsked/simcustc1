package com.vsked.service;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.apache.shiro.session.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.PageHelper;
import com.vsked.common.BaseJson;
import com.vsked.common.Page;
import com.vsked.dao.SysUserDao;
import com.vsked.dao.SysUserRoleDao;

@Service
@Transactional
public class SysUserRoleSer extends BaseService {
	
	private static final Logger log = Logger.getLogger(SysUserRoleSer.class);

	@Autowired
	SysUserRoleDao sysUserRoleDao;
	
	@Autowired
	SysUserDao sysUserDao;

	public String userRoleListPage(HttpServletRequest req){
		String resultPage="userRoleList";
		try{
			Map<String, Object> parMap=getMaps(req);
			if(parMap.containsKey("suId")){
				Map<String, Object> data=sysUserDao.getSysUserBySuId((String) parMap.get("suId"));
				getSession().setAttribute("data", data);
				
			}
		}catch(Exception e){
			log.error(e.getMessage());
		}
		return resultPage;
	}
	
	public String hasSysRoleList(HttpServletRequest req){
		StringBuilder sb=new StringBuilder();
		try{
			Map<String, Object> parMap=getMaps(req);
			if(parMap.containsKey("suId")){
				List<Map<String, Object>> dataList=sysUserRoleDao.getHasSysRoleList((String) parMap.get("suId"));
				String dataListJson=BaseJson.listToJson(dataList);
				sb.append(dataListJson);
			}
		}catch(Exception e){
			log.error(e.getMessage());
		}
		return sb.toString();
	}
	
	public String noSysRoleList(HttpServletRequest req){
		StringBuilder sb=new StringBuilder();
		try{
			Map<String, Object> parMap=getMaps(req);
			if(parMap.containsKey("suId")){
				List<Map<String, Object>> dataList=sysUserRoleDao.getNoSysRoleList((String) parMap.get("suId"));
				String dataListJson=BaseJson.listToJson(dataList);
				sb.append(dataListJson);
			}
		}catch(Exception e){
			log.error(e.getMessage());
		}
		return sb.toString();
	}

	public List<Map<String, Object>> getSysUserRoleListBySuId(String suId) {
		List<Map<String, Object>> dataList=new LinkedList<Map<String,Object>>();
		try{
			dataList=sysUserRoleDao.getSysUserRoleListBySuId(suId);
		}catch(Exception e){
			log.error(e.getMessage());
		}
		return dataList;
	}
	
	public boolean isPermitted(Map<String, Object> parMap){
		boolean flag=false;
		try{
			List<Map<String, Object>> dataList=sysUserRoleDao.isPermitted(parMap);
			if(dataList.size()>0){
				flag=true;
			}
		}catch(Exception e){
			log.error(e.getMessage());
		}
		return flag;
	}
}
