package com.zenquan.designpattern;

import com.zenquan.Animal.Apple;
import com.zenquan.Animal.Knife;

//以具体工厂 AKitchen 为例
public class AKitchen implements KitchenFactory {

	public Food getFood() {
		return new Apple();
	}

	public TableWare getTableWare() {
		return new Knife();
	}

	@Override
	public TableWare getTanleWare() {
		// TODO Auto-generated method stub
		return null;
	}
}
