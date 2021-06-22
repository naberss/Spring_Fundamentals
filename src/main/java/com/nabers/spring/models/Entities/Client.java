package com.nabers.spring.models.Entities;

public class Client {

	private int ID;
	private String name;
	private int age;
	private double height;

	public Client(int ID, String name, int age, double height) {
		this.ID = ID;
		this.name = name;
		this.age = age;
		this.height = height;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	@Override
	public String toString() {
		return "Client [ID=" + ID + ", name=" + name + ", age=" + age + ", height=" + height + "]";
	}

}
