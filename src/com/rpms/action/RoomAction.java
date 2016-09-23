package com.rpms.action;

import java.io.UnsupportedEncodingException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.rpms.pojos.BuildDTO;
import com.rpms.pojos.RoomDTO;
import com.rpms.service.BuildService;
import com.rpms.service.GeneralService;
import com.rpms.utils.PageUtil;

public class RoomAction extends ActionSupport{
	
	private static final String LIST="list";
	
	private static final String FIND="find";
	
	private static final String ADD="add";
	
	private static final String UPDATE="update";
	
	private static final String DELETE="delete";
	
	private static final String READY="ready";
	
	private static final String READYADD="readyAdd";
	
	private String buildId;
	
	private String roomName;
	
	private String roomDate;
	
	private String roomType;
	
	private String roomUse;
	
	private String roomArea;
	
	private String roomPercent;
	
	private static final String sdfFormat="yyyy-mm-dd";
	
	private GeneralService genericService;
	
	private final int pageSize=5;
	
	private String oneway;
	
	private String onetext;
	
	private String[] checkone;
	
	public String list(){
		HttpServletRequest request=ServletActionContext.getRequest();
		String page=request.getParameter("pageNum");
		int currentPage;
		if(page==null||page.equals("")){
			currentPage=1;
		}else{
			currentPage=Integer.parseInt(page);
		}
		PageUtil pageUtil=genericService.fenye(currentPage, pageSize);
		request.setAttribute("list", pageUtil);
		return LIST;
	}
	
	public String find(){
		HttpServletRequest request = ServletActionContext.getRequest();
		PageUtil pageUtil=null;
		try {
			request.setCharacterEncoding("UTF-8");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String page=request.getParameter("pageNum");
		int currentPage;
		if(page==null||page.equals("")){
			currentPage=1;
		}else{
			currentPage=Integer.parseInt(page);
		}
		if(oneway.equals("0")){
			pageUtil=genericService.fenye(currentPage, pageSize);
			request.setAttribute("list", pageUtil);
			return LIST;
		}else if(oneway.equals("1")){
			String propertyName="build.buildName";
			String propertyValue=onetext;
			pageUtil=genericService.fenyeByEntity(currentPage, pageSize, propertyName, propertyValue);
			request.setAttribute("list", pageUtil);
			return FIND;
		}else if(oneway.equals("2")){
			String propertyName="roomName";
			String propertyValue=onetext;
			pageUtil=genericService.fenyeByEntity(currentPage, pageSize, propertyName, propertyValue);
			request.setAttribute("list", pageUtil);
			return FIND;
		}else if(oneway.equals("3")){
			String propertyName="roomDate";
			String propertyValue=onetext;
			pageUtil=genericService.fenyeByEntity(currentPage, pageSize, propertyName, propertyValue);
			request.setAttribute("list", pageUtil);
			return FIND;
		}else if(oneway.equals("4")){
			String propertyName="roomType";
			String propertyValue=onetext;
			pageUtil=genericService.fenyeByEntity(currentPage, pageSize, propertyName, propertyValue);
			request.setAttribute("list", pageUtil);
			return FIND;
		}else if(oneway.equals("5")){
			String propertyName="roomUse";
			String propertyValue=onetext;
			pageUtil=genericService.fenyeByEntity(currentPage, pageSize, propertyName, propertyValue);
			request.setAttribute("list", pageUtil);
			return FIND;
		}else if(oneway.equals("6")){
			String propertyName="roomArea";
			String propertyValue=onetext;
			pageUtil=genericService.fenyeByEntity(currentPage, pageSize, propertyName, propertyValue);
			request.setAttribute("list", pageUtil);
			return FIND;
		}else if(oneway.equals("7")){
			String propertyName="roomPercent";
			String propertyValue=onetext;
			pageUtil=genericService.fenyeByEntity(currentPage, pageSize, propertyName, propertyValue);
			request.setAttribute("list", pageUtil);
			return FIND;
		}else{
			return INPUT;
		}
	}
	
	public String readyAdd(){
		try {
			HttpServletRequest request=ServletActionContext.getRequest();
			List<BuildDTO> builds=new BuildService().getAll();
			request.setCharacterEncoding("UTF-8");
			request.setAttribute("builds", builds);
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return READYADD;
	}
	
	public String add(){
		try {
			if(buildId!=null||buildId.equals("")==false||buildId.equals("0")==false){
			BuildDTO build=(BuildDTO) new BuildService().get(Integer.parseInt(buildId));
			SimpleDateFormat sdf=new SimpleDateFormat(sdfFormat);
			Date date=sdf.parse(roomDate);
			RoomDTO room=new RoomDTO(0, roomName, date, roomType, roomUse, Float.parseFloat(roomArea), Float.parseFloat(roomPercent));
			genericService.add(room);
			}else{
				return INPUT;
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		return ADD;
	}
	
	public String ready() {
		HttpServletRequest request=ServletActionContext.getRequest();
		try {
			request.setCharacterEncoding("utf-8");
			String para=request.getParameter("id");
			int id;
			if(para==null||para.equals("")){
				return ERROR;
			}else{
				id=Integer.parseInt(para);
			}
			List<BuildDTO> builds=new BuildService().getAll();
			RoomDTO room=(RoomDTO)genericService.get(id);
			request.setAttribute("builds", builds);
			request.setAttribute("room", room);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return READY;
	}
	
	public String update() throws UnsupportedEncodingException, ParseException {
		HttpServletRequest request=ServletActionContext.getRequest();
		request.setCharacterEncoding("utf-8");
		int id;
		String para = request.getParameter("id");
		if(para==null||para.equals("")){
			return ERROR;
		}else{
			id=Integer.parseInt(para);
		}
		if(buildId!=null||buildId.equals("")==false||buildId.equals("0")==false){
		BuildDTO build=(BuildDTO) new BuildService().get(Integer.parseInt(buildId));
		SimpleDateFormat sdf=new SimpleDateFormat(sdfFormat);
		Date date=sdf.parse(roomDate);
		RoomDTO room=(RoomDTO)genericService.get(id);
		room.setBuild(build);
		room.setRoomName(roomName);
		room.setRoomDate(date);
		room.setRoomType(roomType);
		room.setRoomUse(roomUse);
		room.setRoomArea(Float.parseFloat(roomArea));
		room.setRoomPercent(Float.parseFloat(roomPercent));
		genericService.update(room);
		}else{
			return INPUT;
		}
		return UPDATE;
	}
	
	public String delete(){
		if(checkone!=null){
			for(String check:checkone){
				int id=Integer.parseInt(check);
				deleteObject(id);
			}
		}
		return DELETE;
	}
	
	public void deleteObject(Integer id){
		RoomDTO room=(RoomDTO)genericService.get(id);
		genericService.delete(room);
	}

	public GeneralService getGenericService() {
		return genericService;
	}

	public void setGenericService(GeneralService genericService) {
		this.genericService = genericService;
	}

	public String getOneway() {
		return oneway;
	}

	public void setOneway(String oneway) {
		this.oneway = oneway;
	}

	public String getOnetext() {
		return onetext;
	}

	public void setOnetext(String onetext) {
		this.onetext = onetext;
	}

	public String getBuildId() {
		return buildId;
	}

	public void setBuildId(String buildId) {
		this.buildId = buildId;
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

	public String getRoomUse() {
		return roomUse;
	}

	public void setRoomUse(String roomUse) {
		this.roomUse = roomUse;
	}

	public String[] getCheckone() {
		return checkone;
	}

	public void setCheckone(String[] checkone) {
		this.checkone = checkone;
	}

	
	
}
