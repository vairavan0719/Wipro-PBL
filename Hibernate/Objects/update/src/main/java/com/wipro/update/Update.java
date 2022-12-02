package com.wipro.update;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Update {
	@Id
	private int flower_id;
	private String flower_name;
	private String flower_color;
	private int price;
	
	public Update(int flower_id, String flower_name, String flower_color, int price) {
		super();
		this.flower_id = flower_id;
		this.flower_name = flower_name;
		this.flower_color = flower_color;
		this.price = price;
	}
	public Update(){
		
	}

	public String getFlower_color() {
		return flower_color;
	}

	public void setFlower_color(String flower_color) {
		this.flower_color = flower_color;
	}
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
		return "Update [flower_id=" + flower_id + ", flower_name=" + flower_name + ", flower_color=" + flower_color
				+ ", price=" + price + "]";
	}
	

}
