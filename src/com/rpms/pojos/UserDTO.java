package com.rpms.pojos;

public class UserDTO implements IPojo {
	
	private Integer id;
	
	private String userName;
	
	private String passWord;
	
	private RolesDTO roles;
	
	private OwnerDTO owner;

	public UserDTO() {

	}

	public UserDTO(String userName, String passWord) {
		this.userName = userName;
		this.passWord = passWord;
	}

	public UserDTO(Integer id, String userName, String passWord) {
		this.id = id;
		this.userName = userName;
		this.passWord = passWord;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public RolesDTO getRoles() {
		return roles;
	}

	public void setRoles(RolesDTO roles) {
		this.roles = roles;
	}

	public OwnerDTO getOwner() {
		return owner;
	}

	public void setOwner(OwnerDTO owner) {
		this.owner = owner;
	}
	
	

	
}
