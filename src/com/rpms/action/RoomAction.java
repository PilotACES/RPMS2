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
	
	private String sdfFormat="yyyy-MM-dd";
	
	private int pageSize=5;
	
	private GeneralService  buildService;
	
	private GeneralService  roomService;
	
	private String buildId;
	
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
		System.out.println(build.getBuildName());
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
	
	public String readyUpdate() throws UnsupportedEncodingException{
		HttpServletRequest request=ServletActionContext.getRequest();
		request.setCharacterEncoding("utf-8");
		int id;
		String updateId=request.getParameter("id");
		if(updateId==null||updateId.equals("")){
			id=1;
		}else{
			id=Integer.parseInt(updateId);
		}
		RoomDTO room=(RoomDTO)roomService.get(id);
		List list=buildService.getAll();
		request.setAttribute("room", room);
		request.setAttribute("builds", list);
		return "readyUpdate";
	}
	
	public String update() throws UnsupportedEncodingException, ParseException{
		BuildDTO build=null;
		HttpServletRequest request=ServletActionContext.getRequest();
		request.setCharacterEncoding("utf-8");
		String roomId=request.getParameter("id");
		System.out.println(roomId+"-------"+roomId);
		int id;
		if(roomId==null||roomId.equals("")){
			return ERROR;
		}else{
			id=Integer.parseInt(roomId);
		}
		if(buildId==null||buildId.equals("")){
			return ERROR;
		}else{
			build=(BuildDTO) buildService.get(Integer.parseInt(buildId));
		}
		SimpleDateFormat sdf=new SimpleDateFormat(sdfFormat);
		RoomDTO room=new RoomDTO(id, roomName, sdf.parse(roomDate), roomType, roomUse, Float.parseFloat(roomArea), Float.parseFloat(roomPercent));
		room.setBuild(build);
		roomService.update(room);
		return "update";
	}
	
	public String delete() throws UnsupportedEncodingException{
		HttpServletRequest request= ServletActionContext.getRequest();
		request.setCharacterEncoding("utf-8");
		String paraId=request.getParameter("checkone");
		int id;
		if(paraId==null||paraId.equals("")){
			return ERROR;
		}else{
			id=Integer.parseInt(paraId);
			roomService.delete(id);
		}
		return "delete";
	}
	
	public String advance() throws UnsupportedEncodingException{
		PageUtil page=null;
		String propertyName=null;
		HttpServletRequest request=ServletActionContext.getRequest();
		request.setCharacterEncoding("utf-8");
		String num=request.getParameter("pageNum");
		String select=request.getParameter("oneway");
		String onetext=request.getParameter("onetext");
		int pageNum;
		if(num==null||num.equals("")){
			pageNum=1;
		}else{
			pageNum=Integer.parseInt(num);
		}
		if(select!=null||select.equals("")){
			int oneway=Integer.parseInt(select);
			switch(oneway){
			case 0:
				page=roomService.fenye(pageNum, pageSize);
				request.setAttribute("list", page);
				break;
			case 1:
				propertyName="build.buildName";
				page=roomService.fenyeManyToOne(pageNum, pageSize, propertyName, onetext);
				request.setAttribute("list", page);
				break;
			case 2:
				propertyName="roomName";
				page=roomService.fenyeByEntity(pageNum, pageSize, propertyName, onetext);
				request.setAttribute("list", page);
				break;
			case 3:
				propertyName="roomDate";
				page=roomService.fenyeByEntity(pageNum, pageSize, propertyName, onetext);
				request.setAttribute("list", page);
				break;
			case 4:
				propertyName="roomType";
				page=roomService.fenyeByEntity(pageNum, pageSize, propertyName, onetext);
				request.setAttribute("list", page);
				break;
			case 5:
				propertyName="roomUse";
				page=roomService.fenyeByEntity(pageNum, pageSize, propertyName, onetext);
				request.setAttribute("list", page);
				break;
			case 6:
				propertyName="roomArea";
				page=roomService.fenyeByEntity(pageNum, pageSize, propertyName, onetext);
				request.setAttribute("list", page);
				break;
			case 7:
				propertyName="roomPercent";
				page=roomService.fenyeByEntity(pageNum, pageSize, propertyName, onetext);
				request.setAttribute("list", page);
				break;
			}
		}
		return "search";
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

	public String getBuildId() {
		return buildId;
	}

	public void setBuildId(String buildId) {
		this.buildId = buildId;
	}
	
	
	
}
