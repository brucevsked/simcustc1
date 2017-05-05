package com.vsked.service;

import java.util.Map;
import org.apache.log4j.Logger;
import org.apache.shiro.session.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.vsked.dao.SysRoleDao;


@Service
@Transactional
public class SysRoleSer extends BaseService{
	
	private static final  Logger log = Logger.getLogger(SysRoleSer.class);
	
	@Autowired
	SysRoleDao sysRoleDao;
	
	
	public int getSysRoleCount(Map<String, Object> m){
		int count=0;
		try{
			count=sysRoleDao.getSysRoleCount(m);
		}catch(Exception e){
			log.error(e.getMessage());
		}
		return count;
	}
	
	public Map<String, Object> getSysRoleBySrId(String srId){
		return sysRoleDao.getSysRoleBySrId(srId);
	}
	
	
	public String sysRoleEditPage(String srId){
		try{
			Map<String, Object> sysRole=getSysRoleBySrId(srId);
			Session session=getSession();
			session.setAttribute("sysRole", sysRole);
		}catch(Exception e){
			log.error(e.getMessage());
		}
		return "system/sysRoleEdit";
	}
	
	
}
