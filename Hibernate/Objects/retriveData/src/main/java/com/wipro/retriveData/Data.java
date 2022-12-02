package com.wipro.retriveData;

public class Data {
private int flower_id;
private String flower_name;
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
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
@Override
public String toString() {
	return "Data [flower_id=" + flower_id + ", flower_name=" + flower_name + ", price=" + price + "]";
}

}
