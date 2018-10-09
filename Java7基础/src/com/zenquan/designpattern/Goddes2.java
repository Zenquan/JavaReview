package com.zenquan.designpattern;

import java.io.IOException;

public class Goddes2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		HumanFactory2 hf = new ManFactory();
		Human2 h = hf.createHuman("man");
		h.eat();
		h.sleep();
		h.beat();
	}

}
