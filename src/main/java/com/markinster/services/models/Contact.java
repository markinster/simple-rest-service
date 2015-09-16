package com.markinster.services.models;

import java.util.Date;

public class Contact {

	private String name;
	private String phone;
	private String color;
	private Date data;

	public Contact() {
		// TODO Auto-generated constructor stub
	}

	public Contact(String name, String phone, String color) {
		super();
		this.name = name;
		this.phone = phone;
		this.color = color;
		this.data = new Date();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

}
