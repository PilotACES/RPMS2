package com.rpms.pojos;

import java.util.Set;

public class ChargeDTO implements IPojo {
	
	private Integer id;
	
	private String ChargeName;
	
	private String ChargeUnit;
	
	private Set<PayDTO> pay;
	
	

	public ChargeDTO() {

	}



	public ChargeDTO(Integer id, String chargeName, String chargeUnit) {
		this.id = id;
		ChargeName = chargeName;
		ChargeUnit = chargeUnit;
	}



	public Integer getId() {
		return id;
	}



	public void setId(Integer id) {
		this.id = id;
	}



	public String getChargeName() {
		return ChargeName;
	}



	public void setChargeName(String chargeName) {
		ChargeName = chargeName;
	}



	public String getChargeUnit() {
		return ChargeUnit;
	}



	public void setChargeUnit(String chargeUnit) {
		ChargeUnit = chargeUnit;
	}



	public Set<PayDTO> getPay() {
		return pay;
	}



	public void setPay(Set<PayDTO> pay) {
		this.pay = pay;
	}
	
	
	
	

}
