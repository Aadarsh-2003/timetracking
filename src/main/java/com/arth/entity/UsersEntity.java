package com.arth.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Users")
public class UsersEntity {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Integer userId;
	private String FirstName1;
	private String LastName;
	private String Email;
	private String Password;
	private String Gender;
	private Integer ContactNumber;
	private Integer DOB;
	private String Address;
	private String City;
	private String State;
	private Integer OTP;
	private String roleId;
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getFirstName1() {
		return FirstName1;
	}
	public void setFirstName1(String firstName1) {
		FirstName1 = firstName1;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public Integer getContactNumber() {
		return ContactNumber;
	}
	public void setContactNumber(Integer contactNumber) {
		ContactNumber = contactNumber;
	}
	public Integer getDOB() {
		return DOB;
	}
	public void setDOB(Integer dOB) {
		DOB = dOB;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public Integer getOTP() {
		return OTP;
	}
	public void setOTP(Integer oTP) {
		OTP = oTP;
	}
	public String getRoleId() {
		return roleId;
	}
	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}
	

	
}
