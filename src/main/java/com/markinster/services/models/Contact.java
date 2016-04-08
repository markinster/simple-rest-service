package com.markinster.services.models;

import java.util.Date;

public class Contact {

	private int id;
	private String name;
	private String phone;
	private String color;
	private Date data;

	public Contact() {
		// TODO Auto-generated constructor stub
	}

	public Contact(int id) {
		this.id = id;
	}

	public Contact(int id, String name, String phone, String color) {
		super();
		this.id = id;
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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Contact other = (Contact) obj;
		if (id != other.id)
			return false;
		return true;
	}

}
