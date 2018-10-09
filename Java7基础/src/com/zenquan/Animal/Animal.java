package com.zenquan.Animal;

public class Animal {
	private String name;
	private int month;
	private float price;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public Animal() {
		System.out.println("First");
	}
	public void run() {
		System.out.println("Animal can run!");
	}
	public void eat() {
		System.out.println("Animal can eat");
	}
}
