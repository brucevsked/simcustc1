package com.vsked.service;

import java.util.HashMap;
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
import com.vsked.dao.SysMenuDao;

@Service
@Transactional
public class SysMenuSer extends BaseService {
	
	private static final Logger log = Logger.getLogger(SysMenuSer.class);
	
	@Autowired
	SysMenuDao sysMenuDao;
	
	public int getSysMenuCount(Map<String, Object> m) {
		int count = 0;
		try {
			count = sysMenuDao.getSysMenuCount(m);
		} catch (Exception e) {
			log.error(e.getMessage());
		}
		return count;
	}
	
	public String sysMenuList(HttpServletRequest req){
		StringBuilder sb=new StringBuilder();
		try{
		Map<String, Object> m=getMaps(req); //封装前台参数为map
		Page p=getPage(m);//提取分页参数
		int total=getSysMenuCount(m);
		p.setCount(total);
		int pageNum=p.getCurrentPage();
		int pageSize=p.getPageSize();
		
		sb.append("{");
		sb.append(""+getKey("total")+":"+total+",");
		sb.append(""+getKey("rows")+":"+"");
		
		PageHelper.startPage(pageNum, pageSize);//mybatis分页插件
		List<Map<String, Object>> dataList=sysMenuDao.getSysMenuList(m);
		String dataListJson=BaseJson.listToJson(dataList);
		sb.append(dataListJson);
		sb.append("}");
		}catch(Exception e){
			log.error(e.getMessage());
		}
		
		return sb.toString();
	}
	
	public String sysMenuList(){
		StringBuilder sb=new StringBuilder();
		try{
		Map<String, Object> m=new HashMap<String, Object>();
		List<Map<String, Object>> dataList=sysMenuDao.getSysMenuList(m);
		String dataListJson=BaseJson.listToJson(dataList);
		sb.append(dataListJson);
		}catch(Exception e){
			log.error(e.getMessage());
		}
		
		return sb.toString();
	}
	
	public String menuAddProc(HttpServletRequest req){
		String result="";
		try{
			Map<String, Object> data=getMaps(req);
			int effectLine=sysMenuDao.sysMenuAdd(data);
			if(effectLine<=0){
				result="菜单添加失败。";
			}else{
				result="菜单:"+data.get("smName")+"添加成功.";
			}
		}catch(Exception e){
			log.error(e.getMessage());
			result="菜单添加出现异常,请联系管理员.";
		}
		return result;
	}

}
