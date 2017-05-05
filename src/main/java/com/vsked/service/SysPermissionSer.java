package com.vsked.service;

import java.util.HashMap;
import java.util.Map;
import org.apache.log4j.Logger;
import org.apache.shiro.session.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.vsked.dao.SysPermissionDao;


@Service
@Transactional
public class SysPermissionSer extends BaseService{
	
	private static final Logger log = Logger.getLogger(SysPermissionSer.class);
	
	@Autowired
	SysPermissionDao sysPermissionDao;
	
	public int getSysPermissionCount(Map<String, Object> m){
		int count=0;
		try{
			count=sysPermissionDao.getSysPermissionCount(m);
		}catch(Exception e){
			log.error(e.getMessage());
		}
		return count;
	}
	
	public Map<String, Object> getSysPermissionBySpId(String spId) {
		Map<String, Object> m=new HashMap<String, Object>();
		try{
			m=sysPermissionDao.getSysPermissionBySpId(spId);
		}catch(Exception e){
			log.error(e.getMessage());
		}
		return m;
	}
	
	public String sysPermissionEditPage(String spId){
		try{
			Map<String, Object> sysPermission=getSysPermissionBySpId(spId);
			Session session=getSession();
			session.setAttribute("sysPermission", sysPermission);
		}catch(Exception e){
			log.error(e.getMessage());
		}
		return "system/sysPermissionEdit";
	}
	
}
