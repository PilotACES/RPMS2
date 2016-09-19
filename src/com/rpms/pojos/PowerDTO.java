package com.rpms.pojos;

import java.util.Set;

public class PowerDTO implements IPojo {

	private Integer id;
	
	private String powerName;
	
	private Set<RolePower> rolePower;
	
	public PowerDTO() {

	}
	
	public PowerDTO(Integer id, String powerName) {
		this.id = id;
		this.powerName = powerName;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPowerName() {
		return powerName;
	}

	public void setPowerName(String powerName) {
		this.powerName = powerName;
	}

	public Set<RolePower> getRolePower() {
		return rolePower;
	}

	public void setRolePower(Set<RolePower> rolePower) {
		this.rolePower = rolePower;
	}

}
