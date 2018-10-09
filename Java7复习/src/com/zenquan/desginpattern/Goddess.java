package com.zenquan.desginpattern;
import java.io.IOException;

public class Goddess {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		Human hf = HumanFactory.createHuman("man");
		hf.eat();
		hf.sleep();
		hf.beat();
	}

}
