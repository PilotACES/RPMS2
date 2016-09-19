package com.rpms.pojos;

public class MemberDTO implements IPojo{
	
	private Integer id;
	
	private String memberName;
	
	private String memberSex;
	
	private String memberNative;
	
	private String memberTel;
	
	private String memberCompany;
	
	private OwnerDTO owner;
	
	

	public MemberDTO() {
		
	}



	public MemberDTO(Integer id, String memberName, String memberSex, String memberNative, String memberTel,
			String memberCompany) {
		this.id = id;
		this.memberName = memberName;
		this.memberSex = memberSex;
		this.memberNative = memberNative;
		this.memberTel = memberTel;
		this.memberCompany = memberCompany;
	}



	public Integer getId() {
		return id;
	}



	public void setId(Integer id) {
		this.id = id;
	}



	public String getMemberName() {
		return memberName;
	}



	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}



	public String getMemberSex() {
		return memberSex;
	}



	public void setMemberSex(String memberSex) {
		this.memberSex = memberSex;
	}



	public String getMemberNative() {
		return memberNative;
	}



	public void setMemberNative(String memberNative) {
		this.memberNative = memberNative;
	}



	public String getMemberTel() {
		return memberTel;
	}



	public void setMemberTel(String memberTel) {
		this.memberTel = memberTel;
	}



	public String getMemberCompany() {
		return memberCompany;
	}



	public void setMemberCompany(String memberCompany) {
		this.memberCompany = memberCompany;
	}



	public OwnerDTO getOwner() {
		return owner;
	}



	public void setOwner(OwnerDTO owner) {
		this.owner = owner;
	}

	
	
	
	
	

}
