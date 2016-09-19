package com.rpms.pojos;

import java.util.Set;

public class OwnerDTO implements IPojo {
	
	private Integer id;
	
	private String ownerName;
	
	private String ownerSex;
	
	private String ownerNative;
	
	private String ownerTel;
	
	private String ownerIdCard;
	
	private String ownerCompany;
	
	private Set<RoomDTO> roomSet;
	
	private Set<MemberDTO> memberSet;
	
	private Set<PayDTO> pay;
	
	private Set<RoomOwner> roomOwner;
	
	private RolesDTO role;
	
	private UserDTO user;

	public OwnerDTO() {
		
	}

	public OwnerDTO(Integer id, String ownerName, String ownerSex, String ownerNative, String ownerTel,
			String ownerIdCard, String ownerCompany) {
		this.id = id;
		this.ownerName = ownerName;
		this.ownerSex = ownerSex;
		this.ownerNative = ownerNative;
		this.ownerTel = ownerTel;
		this.ownerIdCard = ownerIdCard;
		this.ownerCompany = ownerCompany;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getOwnerSex() {
		return ownerSex;
	}

	public void setOwnerSex(String ownerSex) {
		this.ownerSex = ownerSex;
	}

	public String getOwnerNative() {
		return ownerNative;
	}

	public void setOwnerNative(String ownerNative) {
		this.ownerNative = ownerNative;
	}

	public String getOwnerTel() {
		return ownerTel;
	}

	public void setOwnerTel(String ownerTel) {
		this.ownerTel = ownerTel;
	}

	public String getOwnerIdCard() {
		return ownerIdCard;
	}

	public void setOwnerIdCard(String ownerIdCard) {
		this.ownerIdCard = ownerIdCard;
	}

	public String getOwnerCompany() {
		return ownerCompany;
	}

	public void setOwnerCompany(String ownerCompany) {
		this.ownerCompany = ownerCompany;
	}

	public Set<RoomDTO> getRoomSet() {
		return roomSet;
	}

	public void setRoomSet(Set<RoomDTO> roomSet) {
		this.roomSet = roomSet;
	}

	public Set<MemberDTO> getMemberSet() {
		return memberSet;
	}

	public void setMemberSet(Set<MemberDTO> memberSet) {
		this.memberSet = memberSet;
	}

	public RolesDTO getRole() {
		return role;
	}

	public void setRole(RolesDTO role) {
		this.role = role;
	}


	public Set<PayDTO> getPay() {
		return pay;
	}

	public void setPay(Set<PayDTO> pay) {
		this.pay = pay;
	}

	public Set<RoomOwner> getRoomOwner() {
		return roomOwner;
	}

	public void setRoomOwner(Set<RoomOwner> roomOwner) {
		this.roomOwner = roomOwner;
	}

	public UserDTO getUser() {
		return user;
	}

	public void setUser(UserDTO user) {
		this.user = user;
	}
	
	

}
