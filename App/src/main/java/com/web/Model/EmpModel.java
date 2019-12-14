package com.web.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.stereotype.Component;

@Entity
@Table(name="Emp_Details")
public class EmpModel {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int empId;
	
	@Column(name="Emp_Name")
	private String name;
	
	@Column(name="Emp_Email")
	private String email;
	
	@Column(name="Emp_Dept_Id")
	private int deptId;
	
	@Column(name="Emp_Gender")
	private Gender gender;
	
	@Column(name="Emp_Designation")
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
	public void setEmpId(int empId) {
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
