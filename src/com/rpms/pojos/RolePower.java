package com.rpms.pojos;

import java.util.Set;

public class RolePower implements IPojo{
	
	private Integer id;
	
	private RolesDTO role;
	
	private PowerDTO power;

	public RolePower() {

	}

	public RolePower(Integer id) {
		this.id = id;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public RolesDTO getRole() {
		return role;
	}

	public void setRole(RolesDTO role) {
		this.role = role;
	}

	public PowerDTO getPower() {
		return power;
	}

	public void setPower(PowerDTO power) {
		this.power = power;
	}

}
