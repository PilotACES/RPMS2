package com.rpms.service;

import java.util.List;

import com.rpms.dao.IGenericDAO;
import com.rpms.pojos.RolesDTO;
import com.rpms.utils.PageUtil;

public class RoleService implements GeneralService {
	
	private IGenericDAO<RolesDTO, Integer> rolesQuery;

	public void add(Object obj) {
		rolesQuery.save((RolesDTO)obj);
	}

	public void update(Object obj) {
		rolesQuery.update((RolesDTO)obj);
	}

	public void delete(Object obj) {
		rolesQuery.delete((RolesDTO)obj);
	}

	public Object get(Integer id) {
		return rolesQuery.get(id);
	}

	public Object load(Integer id) {
		return rolesQuery.load(id);
	}

	public List getAll() {
		return rolesQuery.loadAll();
	}

	public PageUtil fenye(int pageNum, int pageSize) {
		return rolesQuery.fenye(pageNum, pageSize);
	}

	public PageUtil fenyeByEntity(int pageNum, int pageSize,
			String propertyName, String propertyValue) {
		return rolesQuery.fenyeEqualByEntity(pageNum, pageSize, propertyName, propertyValue);
	}

	public PageUtil fenyeManyToOne(int pageNum, int pageSize,
			String propertyName, String propertyValue) {
		return rolesQuery.fenyeManyToOne(pageNum, pageSize, propertyName, propertyValue);
	}

	public IGenericDAO<RolesDTO, Integer> getRolesQuery() {
		return rolesQuery;
	}

	public void setRolesQuery(IGenericDAO<RolesDTO, Integer> rolesQuery) {
		this.rolesQuery = rolesQuery;
	}
	
	

}
