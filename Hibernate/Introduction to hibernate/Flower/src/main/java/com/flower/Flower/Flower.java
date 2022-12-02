package com.flower.Flower;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Flower {
	@Id
private int flower_id;
private String flower_name;
private String color;
private int price;
public int getFlower_id() {
	return flower_id;
}
public void setFlower_id(int flower_id) {
	this.flower_id = flower_id;
}
public String getFlower_name() {
	return flower_name;
}
public void setFlower_name(String flower_name) {
	this.flower_name = flower_name;
}
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
@Override
public String toString() {
	return "Flower [flower_id=" + flower_id + ", flower_name=" + flower_name + ", color=" + color + ", price=" + price
			+ "]";
}

}
