package com.rpms.pojos;

import java.util.Date;
import java.util.Set;

public class RoomDTO implements IPojo{
	
	private Integer id;
	
	private String roomName;
	
	private Date roomDate;
	
	private String roomType;
	
	private String roomUse;
	
	private float roomArea;
	
	private float roomPercent;
	
	private BuildDTO build;
	
	private Set<RoomOwner> roomOwner;

	public RoomDTO() {

	}

	public RoomDTO(Integer id, String roomName, Date roomDate, String roomType, String roomUse, float roomArea,
			float roomPercent) {
		this.id = id;
		this.roomName = roomName;
		this.roomDate = roomDate;
		this.roomType = roomType;
		this.roomUse = roomUse;
		this.roomArea = roomArea;
		this.roomPercent = roomPercent;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getRoomName() {
		return roomName;
	}

	public void setRoomName(String roomName) {
		this.roomName = roomName;
	}

	public Date getRoomDate() {
		return roomDate;
	}

	public void setRoomDate(Date roomDate) {
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

	public float getRoomArea() {
		return roomArea;
	}

	public void setRoomArea(float roomArea) {
		this.roomArea = roomArea;
	}

	public float getRoomPercent() {
		return roomPercent;
	}

	public void setRoomPercent(float roomPercent) {
		this.roomPercent = roomPercent;
	}

	public BuildDTO getBuild() {
		return build;
	}

	public void setBuild(BuildDTO build) {
		this.build = build;
	}

	public Set<RoomOwner> getRoomOwner() {
		return roomOwner;
	}

	public void setRoomOwner(Set<RoomOwner> roomOwner) {
		this.roomOwner = roomOwner;
	}
	
}
