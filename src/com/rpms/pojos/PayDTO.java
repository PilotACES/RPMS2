package com.rpms.pojos;

import java.util.Date;

public class PayDTO implements IPojo{

	private Integer id;
	
	private ChargeDTO charge;
	
	private float payMoney;
	
	private float payReceive;
	
	private float payLack;
	
	private Date payDate;
	
	private OwnerDTO Owner;
	
	private Integer payState;
	
	private Date payMonth;

	public PayDTO() {
		
	}

	public PayDTO(Integer id, float payMoney, float payReceive, float payLack, Date payDate, Integer payState,
			Date payMonth) {
		this.id = id;
		this.payMoney = payMoney;
		this.payReceive = payReceive;
		this.payLack = payLack;
		this.payDate = payDate;
		this.payState = payState;
		this.payMonth = payMonth;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public ChargeDTO getCharge() {
		return charge;
	}

	public void setCharge(ChargeDTO charge) {
		this.charge = charge;
	}

	public float getPayMoney() {
		return payMoney;
	}

	public void setPayMoney(float payMoney) {
		this.payMoney = payMoney;
	}

	public float getPayReceive() {
		return payReceive;
	}

	public void setPayReceive(float payReceive) {
		this.payReceive = payReceive;
	}

	public float getPayLack() {
		return payLack;
	}

	public void setPayLack(float payLack) {
		this.payLack = payLack;
	}

	public Date getPayDate() {
		return payDate;
	}

	public void setPayDate(Date payDate) {
		this.payDate = payDate;
	}

	public OwnerDTO getOwner() {
		return Owner;
	}

	public void setOwner(OwnerDTO owner) {
		Owner = owner;
	}

	public Integer getPayState() {
		return payState;
	}

	public void setPayState(Integer payState) {
		this.payState = payState;
	}

	public Date getPayMonth() {
		return payMonth;
	}

	public void setPayMonth(Date payMonth) {
		this.payMonth = payMonth;
	}
	
	
	
	
	
	
}
