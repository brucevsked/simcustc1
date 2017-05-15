package com.vsked.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import com.vsked.test.TestMyBatis;

public class CarrierDaoTest extends TestMyBatis{
	
	private static Logger log = Logger.getLogger(CarrierDaoTest.class);
	
	@Autowired
	CarrierDao carrierDao;
	
//	@Test
	public void getSysCarrierCount(){
		Map<String, Object> m=new HashMap<String, Object>();
//		m.put("carrierName", "通信");
//		m.put("carrierNick", "远特");
//		m.put("carrierShortName", "远特");
		int count=carrierDao.getSysCarrierCount(m);
		log.debug(count);
	}
	
	@Test
	public void getSysCarrierList(){
		Map<String, Object> m=new HashMap<String, Object>();
//		m.put("carrierName", "通信");
//		m.put("carrierNick", "远特");
//		m.put("carrierShortName", "远特");
		List<Map<String, Object>> dataList=carrierDao.getSysCarrierList(m);
		log.debug(dataList);
		log.debug(dataList.size());
	}

}
