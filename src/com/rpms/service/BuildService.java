package com.rpms.service;

import java.util.List;

import com.rpms.dao.IGenericDAO;
import com.rpms.pojos.BuildDTO;
import com.rpms.pojos.IPojo;
import com.rpms.utils.PageUtil;

public class BuildService implements GeneralService {
	
	private IGenericDAO<BuildDTO,Integer> generalDAO;

	public void add(Object obj) {
		generalDAO.save((BuildDTO)obj);
		
	}

	public void update(Object obj) {
		generalDAO.update((BuildDTO)obj);
		
	}

	public void delete(Object obj) {
		generalDAO.delete((BuildDTO)obj);
		
	}
	
	public Object get(Integer id){
		return generalDAO.get(id);
	}
	
	public Object load(Integer id){
		return generalDAO.load(id);
	}

	public PageUtil fenye(int pageNum,int pageSize) {
		return generalDAO.fenye(pageNum, pageSize);
	}

	public PageUtil fenyeByEntity(int pageNum, int pageSize, String propertyName, String propertyValue) {
		return generalDAO.fenyeEqualByEntity(pageNum, pageSize, propertyName, propertyValue);
	}

	public IGenericDAO<BuildDTO, Integer> getGeneralDAO() {
		return generalDAO;
	}

	public void setGeneralDAO(IGenericDAO<BuildDTO, Integer> generalDAO) {
		this.generalDAO = generalDAO;
	}
	
	

}
