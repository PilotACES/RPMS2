package com.rpms.pojos;

import java.util.Set;

public class MaterialType implements IPojo{
	
	private Integer id;
	
	private String typeName;
	
	private Set<MaterialDTO> material;
	
	

	public MaterialType() {

	}



	public MaterialType(Integer id, String typeName) {
		this.id = id;
		this.typeName = typeName;
	}



	public Integer getId() {
		return id;
	}



	public void setId(Integer id) {
		this.id = id;
	}



	public String getTypeName() {
		return typeName;
	}



	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}



	public Set<MaterialDTO> getMaterial() {
		return material;
	}



	public void setMaterial(Set<MaterialDTO> material) {
		this.material = material;
	}
	
	
	
	
	
	
}
