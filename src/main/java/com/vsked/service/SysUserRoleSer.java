package com.vsked.service;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.github.pagehelper.PageHelper;
import com.vsked.common.BaseJson;
import com.vsked.common.Page;
import com.vsked.dao.SysUserRoleDao;

@Service
@Transactional
public class SysUserRoleSer extends BaseService {
	
	private static final Logger log = Logger.getLogger(SysUserRoleSer.class);

	@Autowired
	SysUserRoleDao sysUserRoleDao;


	public List<Map<String, Object>> getSysUserRoleListBySuId(String suId) {
		List<Map<String, Object>> dataList=new LinkedList<Map<String,Object>>();
		try{
			dataList=sysUserRoleDao.getSysUserRoleListBySuId(suId);
		}catch(Exception e){
			log.error(e.getMessage());
		}
		return dataList;
	}
	/*
	public String sysUserRoleList(HttpServletRequest req){
		StringBuilder sb=new StringBuilder();
		try{
		Map<String, Object> m=getMaps(req); //封装前台参数为map
		Page p=getPage(m);//提取分页参数
		int total=getSysUserCount(m);
		p.setCount(total);
		int pageNum=p.getCurrentPage();
		int pageSize=p.getPageSize();
		
		sb.append("{");
		sb.append(""+getKey("total")+":"+total+",");
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
	
	*/
	
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
