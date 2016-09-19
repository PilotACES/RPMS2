package com.rpms.pojos;

import java.util.Date;
import java.util.Set;

public class BuildDTO implements IPojo {
	
	private Integer id;
	
	private String buildName;
	
	private Date buildStart;
	
	private Date buildFinish;
	
	private String buildLeak;
	
	private float buildArea;
	
	private Set<RoomDTO> roomSet;
	
	

	public BuildDTO() {
		
	}



	public BuildDTO(Integer id, String buildName, Date buildStart, Date buildFinish, String buildLeak,
			float buildArea) {
		this.id = id;
		this.buildName = buildName;
		this.buildStart = buildStart;
		this.buildFinish = buildFinish;
		this.buildLeak = buildLeak;
		this.buildArea = buildArea;
	}



	public Integer getId() {
		return id;
	}



	public void setId(Integer id) {
		this.id = id;
	}



	public String getBuildName() {
		return buildName;
	}



	public void setBuildName(String buildName) {
		this.buildName = buildName;
	}



	public Date getBuildStart() {
		return buildStart;
	}



	public void setBuildStart(Date buildStart) {
		this.buildStart = buildStart;
	}



	public Date getBuildFinish() {
		return buildFinish;
	}



	public void setBuildFinish(Date buildFinish) {
		this.buildFinish = buildFinish;
	}



	public String getBuildLeak() {
		return buildLeak;
	}



	public void setBuildLeak(String buildLeak) {
		this.buildLeak = buildLeak;
	}



	public float getBuildArea() {
		return buildArea;
	}



	public void setBuildArea(float buildArea) {
		this.buildArea = buildArea;
	}



	public Set<RoomDTO> getRoomSet() {
		return roomSet;
	}



	public void setRoomSet(Set<RoomDTO> roomSet) {
		this.roomSet = roomSet;
	}
	
	
	
	

}
