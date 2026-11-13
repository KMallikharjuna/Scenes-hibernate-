package com.lpa.tourism.scenes.entities;

public class Employee {
	private int id;
	private String ename, email, gender, dob, qualification, phone;
	private Boolean status = true;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Boolean getStatus() {
		return status;
	}
	public void setStatus(Boolean status) {
		this.status = status;
	}
	public Employee(String ename, String email, String gender, String dob, String qualification, String phone) {
		super();
		this.ename = ename;
		this.email = email;
		this.gender = gender;
		this.dob = dob;
		this.qualification = qualification;
		this.phone = phone;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", ename=" + ename + ", email=" + email + ", gender=" + gender + ", dob=" + dob
				+ ", qualification=" + qualification + ", phone=" + phone + ", status=" + status + "]";
	}
	
	
}
