package com.web.Model;

import org.springframework.stereotype.Component;



@Component

public class EmpModel {
	private int empId;
	private String name;
	private String email;
	private int deptId;
	private Gender gender;
	private String Designation;
	
	
	public EmpModel(int empId, String name, String email, int deptId, Gender gender, String designation) {
		this.empId = empId;
		this.name = name;
		this.email = email;
		this.deptId = deptId;
		this.gender = gender;
		Designation = designation;
	}
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empid) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getDeptId() {
		return deptId;
	}
	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	public String getDesignation() {
		return Designation;
	}
	public void setDesignation(String designation) {
		Designation = designation;
	}
	
	

}
