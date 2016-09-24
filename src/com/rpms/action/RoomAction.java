package com.rpms.action;

import java.io.UnsupportedEncodingException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.Servlet;
import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.rpms.pojos.BuildDTO;
import com.rpms.pojos.RoomDTO;
import com.rpms.service.GeneralService;
import com.rpms.utils.PageUtil;

public class RoomAction extends ActionSupport {
	
	private String sdfFormat="yyyy-mm-dd";
	
	private int pageSize=5;
	
	private GeneralService  buildService;
	
	private GeneralService  roomService;
	
	private String roomName;
	
	private String roomDate;
	
	private String roomType;
	
	private String roomUse;
	
	private String roomArea;
	
	private String roomPercent;
	
	public String addBuildList() throws UnsupportedEncodingException{
		List list=buildService.getAll();
		HttpServletRequest request=ServletActionContext.getRequest();
		request.setCharacterEncoding("utf-8");
		request.setAttribute("list", list);
		return "type";
	}
	
	public String add() throws ParseException{
		HttpServletRequest request=ServletActionContext.getRequest();
		int buildId=Integer.parseInt(request.getParameter("buildId"));
		BuildDTO build=(BuildDTO) buildService.get(buildId);
		SimpleDateFormat sdf=new SimpleDateFormat(sdfFormat);
		RoomDTO room=new RoomDTO(1, roomName, sdf.parse(roomDate), roomType, roomUse, Float.parseFloat(roomArea), Float.parseFloat(roomPercent));
		room.setBuild(build);
		roomService.add(room);
		return "add";
	}
	
	public String list() throws UnsupportedEncodingException{
		HttpServletRequest request=ServletActionContext.getRequest();
		request.setCharacterEncoding("utf-8");
		int pageNum;
		String num=request.getParameter("pageNum");
		if(num==null||num.equals("")){
			pageNum=1;
		}else{
			pageNum=Integer.parseInt(num);
		}
		PageUtil page=roomService.fenye(pageNum, pageSize);
		request.setAttribute("list", page);
		return "list";
	}

	public GeneralService getBuildService() {
		return buildService;
	}

	public void setBuildService(GeneralService buildService) {
		this.buildService = buildService;
	}

	public String getRoomName() {
		return roomName;
	}

	public void setRoomName(String roomName) {
		this.roomName = roomName;
	}

	public String getRoomDate() {
		return roomDate;
	}

	public void setRoomDate(String roomDate) {
		this.roomDate = roomDate;
	}

	public String getRoomType() {
		return roomType;
	}

	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}

	public String getRoomUse() {
		return roomUse;
	}

	public void setRoomUse(String roomUse) {
		this.roomUse = roomUse;
	}

	public String getRoomArea() {
		return roomArea;
	}

	public void setRoomArea(String roomArea) {
		this.roomArea = roomArea;
	}

	public String getRoomPercent() {
		return roomPercent;
	}

	public void setRoomPercent(String roomPercent) {
		this.roomPercent = roomPercent;
	}

	public GeneralService getRoomService() {
		return roomService;
	}

	public void setRoomService(GeneralService roomService) {
		this.roomService = roomService;
	}
	
	
}
