package com.example.demo.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="bikes")
public class Bike {
	@Id
	int bikeid;
	@Column(name="regnumber")
	String regNumber;
	@Column(name="ownername")
	String ownerName;
	@Column(name="year")
	int year;
	@Column(name="bikename")
	String bikeName;
	@Column(name="modelname")
	String modelName;
	public Bike() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Bike(int bikeid, String regNumber, String ownerName, int year, String bikeName, String modelName) {
		super();
		this.bikeid = bikeid;
		this.regNumber = regNumber;
		this.ownerName = ownerName;
		this.year = year;
		this.bikeName = bikeName;
		this.modelName = modelName;
	}
	public int getBikeid() {
		return bikeid;
	}
	public void setBikeid(int bikeid) {
		this.bikeid = bikeid;
	}
	public String getRegNumber() {
		return regNumber;
	}
	public void setRegNumber(String regNumber) {
		this.regNumber = regNumber;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getBikeName() {
		return bikeName;
	}
	public void setBikeName(String bikeName) {
		this.bikeName = bikeName;
	}
	public String getModelName() {
		return modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	

}
