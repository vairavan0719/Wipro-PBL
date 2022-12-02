package com.wipro.Demo5;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Demo {
	@Id
	private int rollnumber;
	private String name;
	private String department;
	public int getRollnumber() {
		return rollnumber;
	}
	public void setRollnumber(int rollnumber) {
		this.rollnumber = rollnumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}

}
