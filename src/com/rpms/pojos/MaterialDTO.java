package com.rpms.pojos;

import java.util.Date;

public class MaterialDTO implements IPojo {
	
	private Integer id;
	
	private String materialName;
	
	private Integer materialCount;
	
	private float materialPrice;
	
	private MaterialType materialType;
	
	private Date materialInDate;
	
	private Date materialOutDate;
	
	private Integer materialStat;
	
	

	public MaterialDTO() {

	}



	public MaterialDTO(Integer id, String materialName, Integer materialCount, float materialPrice, Date materialInDate,
			Date materialOutDate, Integer materialStat) {
		this.id = id;
		this.materialName = materialName;
		this.materialCount = materialCount;
		this.materialPrice = materialPrice;
		this.materialInDate = materialInDate;
		this.materialOutDate = materialOutDate;
		this.materialStat = materialStat;
	}



	public Integer getId() {
		return id;
	}



	public void setId(Integer id) {
		this.id = id;
	}



	public String getMaterialName() {
		return materialName;
	}



	public void setMaterialName(String materialName) {
		this.materialName = materialName;
	}



	public Integer getMaterialCount() {
		return materialCount;
	}



	public void setMaterialCount(Integer materialCount) {
		this.materialCount = materialCount;
	}



	public float getMaterialPrice() {
		return materialPrice;
	}



	public void setMaterialPrice(float materialPrice) {
		this.materialPrice = materialPrice;
	}



	public MaterialType getMaterialType() {
		return materialType;
	}



	public void setMaterialType(MaterialType materialType) {
		this.materialType = materialType;
	}



	public Date getMaterialInDate() {
		return materialInDate;
	}



	public void setMaterialInDate(Date materialInDate) {
		this.materialInDate = materialInDate;
	}



	public Date getMaterialOutDate() {
		return materialOutDate;
	}



	public void setMaterialOutDate(Date materialOutDate) {
		this.materialOutDate = materialOutDate;
	}



	public Integer getMaterialStat() {
		return materialStat;
	}



	public void setMaterialStat(Integer materialStat) {
		this.materialStat = materialStat;
	}
	
	
	
	

}
