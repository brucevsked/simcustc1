package com.vsked.service;

import java.util.HashMap;
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
import com.vsked.dao.SysFunctionDao;


@Service
@Transactional
public class SysFunctionSer extends BaseService {
	
	private static final Logger log = Logger.getLogger(SysFunctionSer.class);

	@Autowired
	SysFunctionDao sysFunctionDao;
	

	public int getSysFunctionCount(Map<String, Object> m) {
		int count = 0;
		try {
			count = sysFunctionDao.getSysFunctionCount(m);
		} catch (Exception e) {
			log.error(e.getMessage());
		}
		return count;
	}

	public List<Map<String, Object>> getSysFunctionList() {
		List<Map<String, Object>> dataList=new LinkedList<Map<String,Object>>();
		try{
		Map<String, Object> m=new HashMap<String, Object>();
		dataList=sysFunctionDao.getSysFunctionList(m);
		}catch(Exception e){
			log.error(e.getMessage());
		}
		return dataList;
	}
	
	public String sysFunctionList(HttpServletRequest req){
		StringBuilder sb=new StringBuilder();
		try{
		Map<String, Object> m=getMaps(req); //封装前台参数为map
		Page p=getPage(m);//提取分页参数
		int total=getSysFunctionCount(m);
		p.setCount(total);
		int pageNum=p.getCurrentPage();
		int pageSize=p.getPageSize();
		
		sb.append("{");
		sb.append(""+getKey("total")+":"+total+",");
		sb.append(""+getKey("rows")+":"+"");
		
		PageHelper.startPage(pageNum, pageSize);//mybatis分页插件
		List<Map<String, Object>> dataList=sysFunctionDao.getSysFunctionList(m);
		String dataListJson=BaseJson.listToJson(dataList);
		sb.append(dataListJson);
		sb.append("}");
		}catch(Exception e){
			log.error(e.getMessage());
		}
		
		return sb.toString();
	}

	public String getSysFunction() {
		Session session = getSession();
		Map<String, Object> m=new HashMap<String, Object>();
		List<Map<String, Object>> sysFunctionList = sysFunctionDao.getSysFunctionList(m);
		session.setAttribute("sysFunction", sysFunctionList);
		return "system/sysFunctionAdd";
	}
	

	public String sysFunctionEditPage(String sfId) {
		try {
			Map<String, Object> sysFunction = sysFunctionDao.getSysFunctionBySfId(sfId);
			Session session = getSession();
			session.setAttribute("sysFunction", sysFunction);
		} catch (Exception e) {
			log.error(e.getMessage());
		}
		return "system/sysFunctionEdit";
	}

}
