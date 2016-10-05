package com.rpms.action;

import java.io.UnsupportedEncodingException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.rpms.pojos.PowerDTO;
import com.rpms.pojos.RolePower;
import com.rpms.pojos.RolesDTO;
import com.rpms.service.GeneralService;

public class RolePowerAction extends ActionSupport{
	
	private GeneralService rolePowerService;
	
	private GeneralService powerService;
	
	private GeneralService roleService;
	
	private String[] xuanze;
	
	public String readyAdd() throws UnsupportedEncodingException{
		HttpServletRequest request=ServletActionContext.getRequest();
		request.setCharacterEncoding("utf-8");
		List roleList=roleService.getAll();
		List powerList=powerService.getAll();
		request.setAttribute("roleList", roleList);
		request.setAttribute("powerList", powerList);
		return "readyAdd";
	}

	public String add() throws UnsupportedEncodingException{
		HttpServletRequest request=ServletActionContext.getRequest();
		request.setCharacterEncoding("utf-8");
		String roleId=request.getParameter("roleName");
		int id;
		if(roleId==null||roleId.equals("")){
			return ERROR;
		}else{
			id=Integer.parseInt(roleId);
		}
		RolesDTO role = (RolesDTO) roleService.get(id);
		for(String s:xuanze){
			RolePower rp=new RolePower();
			PowerDTO power=(PowerDTO) powerService.get(Integer.parseInt(s));
			rp.setPower(power);
			rp.setRole(role);
			rolePowerService.add(rp);
		}
		return "add";
	}

	public GeneralService getRolePowerService() {
		return rolePowerService;
	}

	public void setRolePowerService(GeneralService rolePowerService) {
		this.rolePowerService = rolePowerService;
	}

	public GeneralService getPowerService() {
		return powerService;
	}

	public void setPowerService(GeneralService powerService) {
		this.powerService = powerService;
	}

	public GeneralService getRoleService() {
		return roleService;
	}

	public void setRoleService(GeneralService roleService) {
		this.roleService = roleService;
	}

	public String[] getXuanze() {
		return xuanze;
	}

	public void setXuanze(String[] xuanze) {
		this.xuanze = xuanze;
	}
	
	
	
}
