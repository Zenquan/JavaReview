package com.zenquan.designpattern;
import java.io.IOException;

abstract class Human2 {
	abstract void eat();
	abstract void sleep();
	abstract void beat();
}
class Man2 extends Human2 {
	public void eat() {
		System.out.println("Man can eat");
	}
	public void sleep() {
		System.out.println("Man can sleep");
	}
	public void beat() {
		System.out.println("Man can beat");
	}
}
class Female2 extends Human2 {
	public void eat() {
		System.out.println("Female can eat");
	}
	public void sleep() {
		System.out.println("Female can sleep");
	}
	public void beat() {
		System.out.println("Female can beat");
	}
}
abstract class HumanFactory2 {
	abstract Human2 createHuman(String gender) throws IOException;
}
class ManFactory extends HumanFactory2 {
	public Human2 createHuman(String gender) throws IOException {
		return new Man2();
	}
}
class FemaleFactory extends HumanFactory2 {
	public Human2 createHuman(String gender) throws IOException {
		return new Female2();
	}
}