package com.rpms.action;

import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.rpms.pojos.PowerDTO;
import com.rpms.service.GeneralService;
import com.rpms.utils.PageUtil;

public class PowerAction extends ActionSupport{
	
	private GeneralService powerService;
	
	private String powerName;
	
	private String oneway;
	
	private String onetext;
	
	private String[] checkone;
	
	private Integer pageSize=5;
	
	public String add() throws UnsupportedEncodingException{
		HttpServletRequest request=ServletActionContext.getRequest();
		request.setCharacterEncoding("utf-8");
		String powerName=request.getParameter("powerName");
		if(powerName==null||powerName.equals("")){
			return ERROR;
		}
		PowerDTO power=new PowerDTO(0, powerName);
		powerService.add(power);
		return "add";
	}
	
	public String list() throws UnsupportedEncodingException{
		HttpServletRequest request=ServletActionContext.getRequest();
		request.setCharacterEncoding("utf-8");
		String page=request.getParameter("pageNum");
		int pageNum;
		if(page==null||page.equals("")){
			pageNum=1;
		}else{
			pageNum=Integer.parseInt(page);
		}
		PageUtil pageUtil=powerService.fenye(pageNum, pageSize);
		request.setAttribute("list", pageUtil);
		return "list";
	}
	
	public String readyUpdate() throws UnsupportedEncodingException{
		HttpServletRequest request=ServletActionContext.getRequest();
		request.setCharacterEncoding("utf-8");
		String id=request.getParameter("id");
		Integer powerId;
		if(id==null||id.equals("")){
			powerId=1;
		}else{
			powerId=Integer.parseInt(id);
		}
		PowerDTO power=(PowerDTO) powerService.get(powerId);
		request.setAttribute("power", power);
		return "ready";
	}
	
	public String update() throws UnsupportedEncodingException{
		HttpServletRequest request=ServletActionContext.getRequest();
		request.setCharacterEncoding("utf-8");
		String powerId=request.getParameter("powerId");
		int id;
		if(powerId==null||powerId.equals("")){
			return ERROR;
		}else{
			id=Integer.parseInt(powerId);
		}
		PowerDTO power=(PowerDTO) powerService.get(id);
		power.setPowerName(powerName);
		powerService.update(power);
		return "update";
	}
	
	public String delete() throws UnsupportedEncodingException{
		for(String powerId:checkone){
			queryAndDelete(powerId);
		}
		return "delete";
	}
	
	public String advance() throws UnsupportedEncodingException{
		HttpServletRequest request=ServletActionContext.getRequest();
		request.setCharacterEncoding("utf-8");
		int pageNum;
		if(request.getParameter("pageNum")==null||request.getParameter("pageNum").equals("")){
			pageNum=1;
		}else{
			pageNum=Integer.parseInt(request.getParameter("pageNum"));
		}
		switch(Integer.parseInt(oneway)){
		case 0:
			PageUtil page=powerService.fenye(pageNum, pageSize);
			request.setAttribute("list", page);
			break;
		case 1:
			String propertyName="powerName";
			PageUtil page1=powerService.fenyeByEntity(pageNum, pageSize, propertyName, onetext);
			request.setAttribute("list", page1);
			break;
		}
		return "search";
	}
	
	public void queryAndDelete(String powerId){
		PowerDTO power=null;
		int id=Integer.parseInt(powerId);
		power=(PowerDTO)powerService.get(id);
		powerService.delete(power);
	}

	public GeneralService getPowerService() {
		return powerService;
	}

	public void setPowerService(GeneralService powerService) {
		this.powerService = powerService;
	}

	public String getPowerName() {
		return powerName;
	}

	public void setPowerName(String powerName) {
		this.powerName = powerName;
	}

	public String[] getCheckone() {
		return checkone;
	}

	public void setCheckone(String[] checkone) {
		this.checkone = checkone;
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
	
}
