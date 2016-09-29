package com.rpms.service;

import java.util.List;

import com.rpms.dao.IGenericDAO;
import com.rpms.pojos.OwnerDTO;
import com.rpms.utils.PageUtil;

public class OwnerService implements GeneralService{
	
	private IGenericDAO<OwnerDTO, Integer> ownerQuery;

	public void add(Object obj) {
		ownerQuery.save((OwnerDTO)obj);
		
	}

	public void update(Object obj) {
		ownerQuery.update((OwnerDTO)obj);
		
	}

	public void delete(Object obj) {
		ownerQuery.delete((OwnerDTO)obj);
	}

	public Object get(Integer id) {
		// TODO Auto-generated method stub
		return ownerQuery.get(id);
	}

	public Object load(Integer id) {
		// TODO Auto-generated method stub
		return ownerQuery.load(id);
	}

	public List getAll() {
		// TODO Auto-generated method stub
		return ownerQuery.loadAll();
	}

	public PageUtil fenye(int pageNum, int pageSize) {
		// TODO Auto-generated method stub
		return ownerQuery.fenye(pageNum, pageSize);
	}

	public PageUtil fenyeByEntity(int pageNum, int pageSize,
			String propertyName, String propertyValue) {
		// TODO Auto-generated method stub
		return ownerQuery.fenyeEqualByEntity(pageNum, pageSize, propertyName, propertyValue);
	}

	public PageUtil fenyeManyToOne(int pageNum, int pageSize,
			String propertyName, String propertyValue) {
		// TODO Auto-generated method stub
		return ownerQuery.fenyeManyToOne(pageNum, pageSize, propertyName, propertyValue);
	}
	
	
}
