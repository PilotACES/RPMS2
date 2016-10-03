package com.rpms.service;

import java.util.List;

import com.rpms.dao.IGenericDAO;
import com.rpms.pojos.RolePower;
import com.rpms.utils.PageUtil;

public class RolePowerService implements GeneralService{

	private IGenericDAO<RolePower, Integer> rolePowerQuery;

	public void add(Object obj) {
		rolePowerQuery.save((RolePower)obj);
	}

	public void update(Object obj) {
		rolePowerQuery.update((RolePower)obj);
	}

	public void delete(Object obj) {
		rolePowerQuery.delete((RolePower)obj);
	}

	public Object get(Integer id) {
		return rolePowerQuery.get(id);
	}

	public Object load(Integer id) {
		return rolePowerQuery.load(id);
	}

	public List getAll() {
		return rolePowerQuery.loadAll();
	}

	public PageUtil fenye(int pageNum, int pageSize) {
		return rolePowerQuery.fenye(pageNum, pageSize);
	}

	public PageUtil fenyeByEntity(int pageNum, int pageSize,
			String propertyName, String propertyValue) {
		return rolePowerQuery.fenyeEqualByEntity(pageNum, pageSize, propertyName, propertyValue);
	}

	public PageUtil fenyeManyToOne(int pageNum, int pageSize,
			String propertyName, String propertyValue) {
		return rolePowerQuery.fenyeManyToOne(pageNum, pageSize, propertyName, propertyValue);
	}

	public IGenericDAO<RolePower, Integer> getRolePowerQuery() {
		return rolePowerQuery;
	}

	public void setRolePowerQuery(IGenericDAO<RolePower, Integer> rolePowerQuery) {
		this.rolePowerQuery = rolePowerQuery;
	}
	
	
	
	
}
