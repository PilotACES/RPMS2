package com.rpms.service;

import com.rpms.dao.IGenericDAO;
import com.rpms.pojos.RoomDTO;
import com.rpms.utils.PageUtil;

public class RoomService implements GeneralService {
	
	private IGenericDAO<RoomDTO, Integer> genericDAO;

	public void add(Object obj) {
		genericDAO.save((RoomDTO)obj);
	}

	public void update(Object obj) {
		genericDAO.update((RoomDTO)obj);
	}

	public void delete(Object obj) {
		genericDAO.delete((RoomDTO)obj);
	}

	public Object get(Integer id) {
		// TODO Auto-generated method stub
		return genericDAO.get(id);
	}

	public Object load(Integer id) {
		// TODO Auto-generated method stub
		return genericDAO.load(id);
	}

	public PageUtil fenye(int pageNum, int pageSize) {
		// TODO Auto-generated method stub
		return genericDAO.fenye(pageNum, pageSize);
	}

	public PageUtil fenyeByEntity(int pageNum, int pageSize,
			String propertyName, String propertyValue) {
		// TODO Auto-generated method stub
		return genericDAO.fenyeEqualByEntity(pageNum, pageSize, propertyName, propertyValue);
	}

}
