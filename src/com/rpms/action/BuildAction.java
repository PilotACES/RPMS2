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
import com.rpms.service.BuildService;
import com.rpms.service.GeneralService;
import com.rpms.utils.PageUtil;

public class BuildAction extends ActionSupport{
	
	private static final String FIND="find";
	
	private static final String LIST="list";
	
	private String[] checkone;
	
	private SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
	
	private static GeneralService buildService;
	
	private String buildName;
	
	private String buildStart;
	
	private String buildFinish;
	
	private String buildLeak;
	
	private String buildArea;
	
	private static PageUtil page=null;
	
	private String onetext;
	
	private String condition;
	
	private int pageSize=5;
	
	public String list(){
		HttpServletRequest request=ServletActionContext.getRequest();
		try {
			request.setCharacterEncoding("UTF-8");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String pageNum=request.getParameter("pageNum");
		int currentPage;
		if(pageNum==null||pageNum.equals("")){
			currentPage=1;
		}else{
			currentPage=Integer.parseInt(pageNum);
			}
		page=buildService.fenye(currentPage, pageSize);
		request.setAttribute("list", page);
		return LIST;
	}
	
	public String find() {
		HttpServletRequest request=ServletActionContext.getRequest();
		try {
			request.setCharacterEncoding("UTF-8");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String pageNum=request.getParameter("pageNum");
		int currentPage;
		if(pageNum==null||pageNum.equals("")){
			currentPage=1;
		}else{currentPage=Integer.parseInt(pageNum);}
		String propertyValue=request.getParameter("onetext");
		if(condition.equals("0")){
			page=buildService.fenye(currentPage, pageSize);
			request.setAttribute("list", page);
			return LIST;
		}
		else if(condition.equals("1")){
			page=buildService.fenyeByEntity(currentPage, pageSize, "buildName", propertyValue);
			request.setAttribute("list", page);
			return FIND;
		}else if(condition.equals("2")){
			page=buildService.fenyeByEntity(currentPage, pageSize, "buildStart", propertyValue);
			request.setAttribute("list", page);
			return FIND;
		}else if(condition.equals("3")){
			page=buildService.fenyeByEntity(currentPage, pageSize, "buildFinish", propertyValue);
			request.setAttribute("list", page);
			return FIND;
		}else if(condition.equals("4")){
			page=buildService.fenyeByEntity(currentPage, pageSize, "buildLeak", propertyValue);
			request.setAttribute("list", page);
			return FIND;
		}else if(condition.equals("5")){
			page=buildService.fenyeByEntity(currentPage, pageSize, "buildArea", propertyValue);
			request.setAttribute("list", page);
			return FIND;
		}else{
			return INPUT;
		}
		
	}
	
	public String add(){
		try {
			Date startTime=sdf.parse(buildStart);
			Date finishTime=sdf.parse(buildFinish);
			BuildDTO build=new BuildDTO(0, buildName, startTime, finishTime, buildLeak, Float.parseFloat(buildArea));
			buildService.add(build);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "add";
	}
	
	public String readyUpdate(){
		BuildDTO build=null;
		HttpServletRequest request=ServletActionContext.getRequest();
		int id =Integer.parseInt(request.getParameter("id"));
		build=(BuildDTO)buildService.get(id);
		request.setAttribute("build", build);
		return "ready";
	}
	
	public String update(){
		BuildDTO build=new BuildDTO();
		HttpServletRequest request=ServletActionContext.getRequest();
		int id=Integer.parseInt(request.getParameter("id"));
		try {
			build.setId(id);
			build.setBuildName(buildName);
			build.setBuildStart(sdf.parse(buildStart));
			build.setBuildFinish(sdf.parse(buildFinish));
			build.setBuildLeak(buildLeak);
			build.setBuildArea(Float.parseFloat(buildArea));
			buildService.update(build);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "update";
	}

	public String delect(){
		if(checkone!=null){
			for(String s:checkone){
				delectObject(s);
			}
		}
		return "delect";
	}
	
	public static void delectObject(String s){
		BuildDTO build=(BuildDTO)buildService.get(Integer.parseInt(s));
		buildService.delete(build);
	}

	public GeneralService getBuildService() {
		return buildService;
	}

	public void setBuildService(GeneralService buildService) {
		this.buildService = buildService;
	}

	public PageUtil getPage() {
		return page;
	}

	public void setPage(PageUtil page) {
		this.page = page;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public String getOnetext() {
		return onetext;
	}

	public void setOnetext(String onetext) {
		this.onetext = onetext;
	}

	public String getCondition() {
		return condition;
	}

	public void setCondition(String condition) {
		this.condition = condition;
	}

	public String getBuildName() {
		return buildName;
	}

	public void setBuildName(String buildName) {
		this.buildName = buildName;
	}

	public String getBuildStart() {
		return buildStart;
	}

	public void setBuildStart(String buildStart) {
		this.buildStart = buildStart;
	}

	public String getBuildFinish() {
		return buildFinish;
	}

	public void setBuildFinish(String buildFinish) {
		this.buildFinish = buildFinish;
	}

	public String getBuildLeak() {
		return buildLeak;
	}

	public void setBuildLeak(String buildLeak) {
		this.buildLeak = buildLeak;
	}

	public String getBuildArea() {
		return buildArea;
	}

	public void setBuildArea(String buildArea) {
		this.buildArea = buildArea;
	}

	public String[] getCheckone() {
		return checkone;
	}

	public void setCheckone(String[] checkone) {
		this.checkone = checkone;
	}
	
	

}
