package com.rpms.pojos;

public class RoomOwner implements IPojo{
	
	private Integer id;
	
	private RoomDTO room;
	
	private OwnerDTO owner;
	
	

	public RoomOwner() {
		
	}



	public RoomOwner(RoomDTO room, OwnerDTO owner) {
		this.room = room;
		this.owner = owner;
	}



	public RoomOwner(Integer id, RoomDTO room, OwnerDTO owner) {
		this.id = id;
		this.room = room;
		this.owner = owner;
	}



	public Integer getId() {
		return id;
	}



	public void setId(Integer id) {
		this.id = id;
	}



	public RoomDTO getRoom() {
		return room;
	}



	public void setRoom(RoomDTO room) {
		this.room = room;
	}



	public OwnerDTO getOwner() {
		return owner;
	}



	public void setOwner(OwnerDTO owner) {
		this.owner = owner;
	}
	
	
	
	

	

}
