package com.rpms.service;

import java.util.List;

import com.rpms.dao.IGenericDAO;
import com.rpms.pojos.PowerDTO;
import com.rpms.utils.PageUtil;

public class PowerService implements GeneralService{

	private IGenericDAO<PowerDTO, Integer> powerQuery;

	public void add(Object obj) {
		powerQuery.save((PowerDTO)obj);
	}

	public void update(Object obj) {
		powerQuery.update((PowerDTO)obj);
	}

	public void delete(Object obj) {
		powerQuery.delete((PowerDTO)obj);
	}

	public Object get(Integer id) {
		return powerQuery.get(id);
	}

	public Object load(Integer id) {
		return powerQuery.load(id);
	}

	public List getAll() {
		return powerQuery.loadAll();
	}

	public PageUtil fenye(int pageNum, int pageSize) {
		// TODO Auto-generated method stub
		return powerQuery.fenye(pageNum, pageSize);
	}

	public PageUtil fenyeByEntity(int pageNum, int pageSize,
			String propertyName, String propertyValue) {
		return powerQuery.fenyeEqualByEntity(pageNum, pageSize, propertyName, propertyValue);
	}

	public PageUtil fenyeManyToOne(int pageNum, int pageSize,
			String propertyName, String propertyValue) {
		return powerQuery.fenyeManyToOne(pageNum, pageSize, propertyName, propertyValue);
	}
	
}
