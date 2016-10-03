package com.rpms.action;

import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.springframework.http.HttpRequest;

import com.opensymphony.xwork2.ActionSupport;
import com.rpms.pojos.RolesDTO;
import com.rpms.service.GeneralService;
import com.rpms.utils.PageUtil;

public class RoleAction extends ActionSupport {
	
	private GeneralService roleService;
	
	private Integer pageSize=5;
	
	private String checkone;
	
	private String oneway;
	
	private String onetext;
	
	private String roleName;

	public GeneralService getRoleService() {
		return roleService;
	}

	public void setRoleService(GeneralService roleService) {
		this.roleService = roleService;
	}
	
	public String getCheckone() {
		return checkone;
	}

	public void setCheckone(String checkone) {
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

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public String add(){
		HttpServletRequest request=ServletActionContext.getRequest();
		String roleName=request.getParameter("roleName");
		if(roleName==null||roleName.equals("")){
			return ERROR;
		}
		RolesDTO role=new RolesDTO(0, roleName);
		roleService.add(role);
		return "add";
	}
	
	public String list() throws UnsupportedEncodingException{
		HttpServletRequest request=ServletActionContext.getRequest();
		request.setCharacterEncoding("utf-8");
		String number=request.getParameter("pageNum");
		int pageNum;
		if(number==null||number.equals("")){
			pageNum=1;
		}else{
			pageNum=Integer.parseInt(number);
		}
		PageUtil page=roleService.fenye(pageNum, pageSize);
		request.setAttribute("list", page);
		return "list";
	} 
	
	public String delete(){
		if(checkone!=null||checkone.equals("")!=true){
			executeDelete(checkone);
		}
		return "delete";
	}
	
	public void executeDelete(String roleId){
		RolesDTO role=(RolesDTO) roleService.get(Integer.parseInt(roleId));
		roleService.delete(role);
	}
	
	public String readyUpdate() throws UnsupportedEncodingException{
		HttpServletRequest request=ServletActionContext.getRequest();
		request.setCharacterEncoding("utf-8");
		String number=request.getParameter("id");
		int id;
		if(number==null||number.equals("")){
			id=1;
		}else{
			id=Integer.parseInt(number);
		}
		RolesDTO role=(RolesDTO) roleService.get(id);
		request.setAttribute("role", role);
		return "ready";
	}
	
	public String update() throws UnsupportedEncodingException{
		HttpServletRequest request=ServletActionContext.getRequest();
		request.setCharacterEncoding("utf-8");
		String number=request.getParameter("id");
		int id;
		if(number==null||number.equals("")){
			return ERROR;
		}else{
			id=Integer.parseInt(number);
			executeUpdate(id, roleName);
		}
		return "update";
	}
	
	public void executeUpdate(Integer roleId,String roleName){
		RolesDTO role=(RolesDTO)roleService.get(roleId);
		role.setRoleName(roleName);
		roleService.update(role);
	}
	
	public String advance() throws UnsupportedEncodingException{
		PageUtil page=null;
		HttpServletRequest request=ServletActionContext.getRequest();
		request.setCharacterEncoding("utf-8");
		String number=request.getParameter("pageNum");
		int pageNum;
		if(number==null||number.equals("")){
			pageNum=1;
		}else{
			pageNum=Integer.parseInt(number);
		}
		switch(Integer.parseInt(oneway)){
		case 0:
			page=roleService.fenye(pageNum, pageSize);
			request.setAttribute("list", page);
			break;
		case 1:
			page=roleService.fenyeByEntity(pageNum, pageSize, "roleName", onetext);
			request.setAttribute("list", page);
			break;
		}
		return "search";
	}
}
