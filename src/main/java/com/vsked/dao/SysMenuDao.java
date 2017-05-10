package com.vsked.dao;

import java.util.List;
import java.util.Map;

public interface SysMenuDao {
	
	public int getSysMenuCount(Map<String, Object> m);
	
	public List<Map<String,Object>> getSysMenuList(Map<String, Object> m);
	
	public int sysMenuAdd(Map<String, Object> m);
}
