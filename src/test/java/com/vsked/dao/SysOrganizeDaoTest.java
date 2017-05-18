package com.vsked.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.vsked.test.TestMyBatis;

public class SysOrganizeDaoTest extends TestMyBatis{
	
	private static Logger log = Logger.getLogger(SysOrganizeDaoTest.class);
	
	@Autowired
	SysOrganizeDao sysOrganizeDao;
	
//	@Test
	public void getSysOrganizeCount(){
		Map<String, Object> m=new HashMap<String, Object>();
		m.put("soName", "B");
		m.put("soCode", "b");
		m.put("soName1", "山东");
		int count=sysOrganizeDao.getSysOrganizeCount(m);
		log.debug(count);
	}
	
//	@Test
	public void getSysOrganizeList(){
		Map<String, Object> m=new HashMap<String, Object>();
//		m.put("soName", "B");
		m.put("soCode", "b");
//		m.put("soName1", "山东");
		List<Map<String, Object>> dataList=sysOrganizeDao.getSysOrganizeList(m);
		log.debug(dataList);
		log.debug(dataList.size());
	}
	
	

}
