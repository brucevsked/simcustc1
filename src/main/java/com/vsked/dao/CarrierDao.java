package com.vsked.dao;

import java.util.List;
import java.util.Map;

public interface CarrierDao {
	
	public int getSysCarrierCount(Map<String, Object> m);
	
	public List<Map<String,Object>> getSysCarrierList(Map<String, Object> m);
	
	public Map<String,Object> getSysCarrierByCarrierId(String carrierId);
	
}
