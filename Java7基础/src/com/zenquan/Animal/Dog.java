package com.zenquan.Animal;

public class Dog extends Animal{
	public void run() {
		System.out.println("Dog can run");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a = new Animal();
		Animal b = new Dog();
		// error Dog c = new Animal();
		a.run();
		b.run();
		Dog d = new Dog();
		Animal e = d;
		Dog f = (Dog)e;
	}

}
