package com.vsked.dao;

import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.vsked.test.TestMyBatis;

public class SysMenuDaoTest extends TestMyBatis{
	
	private static Logger log = Logger.getLogger(SysMenuDaoTest.class);
	
	@Autowired
	SysMenuDao sysMenuDao;
	
//	@Test
	public void getSysMenuCount(){
		Map<String, Object> m=new HashMap<String, Object>();
		m.put("smName", "");
		m.put("smHref", "");
		m.put("smClick", "");
		m.put("smName1", "");
		int count=sysMenuDao.getSysMenuCount(m);
		log.debug(count);
	}

}
