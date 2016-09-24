package com.rpms.service;

import java.util.List;
import com.rpms.utils.PageUtil;

public interface GeneralService {
	
	public void add(Object obj);
	
	public void update(Object obj);
	
	public void delete(Object obj);
	
	public Object get(Integer id);
	
	public Object load(Integer id);
	
	public List getAll();
	
	public PageUtil fenye(int pageNum,int pageSize);
	
	public PageUtil fenyeByEntity(int pageNum,int pageSize,String propertyName,String propertyValue);
}
