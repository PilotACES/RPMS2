package com.rpms.service;

import java.util.List;

import com.rpms.dao.IGenericDAO;
import com.rpms.pojos.RoomDTO;
import com.rpms.utils.PageUtil;

public class RoomService implements GeneralService {
	
	private IGenericDAO<RoomDTO, Integer> roomQuery;

	public void add(Object obj) {
		roomQuery.save((RoomDTO)obj);
	}

	public void update(Object obj) {
		roomQuery.update((RoomDTO)obj);
	}

	public void delete(Object obj) {
		roomQuery.delete((RoomDTO)obj);
	}

	public Object get(Integer id) {
		// TODO Auto-generated method stub
		return roomQuery.get(id);
	}

	public Object load(Integer id) {
		// TODO Auto-generated method stub
		return roomQuery.load(id);
	}

	public PageUtil fenye(int pageNum, int pageSize) {
		// TODO Auto-generated method stub
		return roomQuery.fenye(pageNum, pageSize);
	}

	public PageUtil fenyeByEntity(int pageNum, int pageSize,
			String propertyName, String propertyValue) {
		// TODO Auto-generated method stub
		return roomQuery.fenyeEqualByEntity(pageNum, pageSize, propertyName, propertyValue);
	}

	public List getAll() {
		// TODO Auto-generated method stub
		return roomQuery.find("from RoomDTO");
	}

	public IGenericDAO<RoomDTO, Integer> getRoomQuery() {
		return roomQuery;
	}

	public void setRoomQuery(IGenericDAO<RoomDTO, Integer> roomQuery) {
		this.roomQuery = roomQuery;
	}
	
}
