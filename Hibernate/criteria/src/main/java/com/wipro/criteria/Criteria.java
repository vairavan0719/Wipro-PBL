package com.wipro.criteria;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Table(name="car_details")
@Entity
public class Criteria {
	@Id
	@Column(name="reg_no")
private String reg_no;
	@Column(name="model")
private String model;
	@Column(name="color")
private String color;
	@Column(name="manufacturing")
private String manufacturing;
public String getReg_no() {
	return reg_no;
}
public void setReg_no(String reg_no) {
	this.reg_no = reg_no;
}
public String getModel() {
	return model;
}
public void setModel(String model) {
	this.model = model;
}
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
public String getManufacturing() {
	return manufacturing;
}
public void setManufacturing(String manufacturing) {
	this.manufacturing = manufacturing;
}
@Override
public String toString() {
	return "Criteria [reg_no=" + reg_no + ", model=" + model + ", color=" + color + ", manufacturing=" + manufacturing
			+ "]";
}


}
