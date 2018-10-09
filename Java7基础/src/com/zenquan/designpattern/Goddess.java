package com.zenquan.designpattern;

import java.io.IOException;

public class Goddess {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Human human = HumanFactory.createHuman("man");
		human.eat();
		human.sleep();
		human.beat();
	}

}
