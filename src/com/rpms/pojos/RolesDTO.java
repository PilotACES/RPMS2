package com.rpms.pojos;

import java.util.Set;

public class RolesDTO implements IPojo {
	
	private Integer id;
	
	private String roleName;
	
	private Set<RolePower> rolePower;
	
	private Set<UserDTO> user;

	

	public RolesDTO() {

	}

	public RolesDTO(Integer id, String roleName) {
		this.id = id;
		this.roleName = roleName;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public Set<UserDTO> getUser() {
		return user;
	}

	public void setUser(Set<UserDTO> user) {
		this.user = user;
	}

	public Set<RolePower> getRolePower() {
		return rolePower;
	}

	public void setRolePower(Set<RolePower> rolePower) {
		this.rolePower = rolePower;
	}

}
