package com.vsked.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.vsked.test.TestMyBatis;

public class SysFunctionDaoTest extends TestMyBatis{
	
	private static Logger log = Logger.getLogger(SysFunctionDaoTest.class);
	
	@Autowired
	SysFunctionDao sysFunctionDao;

	@Test
	public void getSysFunction(){
		Map<String, Object> m=new HashMap<String, Object>();
//		m.put("sfId", "40000000000000000000000000000001");
//		m.put("sfValue", "/LoginController/login.html");
		List<Map<String, Object>> functionList=sysFunctionDao.getSysFunctionList(m);
		log.debug(functionList);
		log.debug(functionList.size());
	}
}
