package com.zenquan.designpattern;
//抽象工厂
public interface KitchenFactory {
	public Food getFood();

	public TableWare getTableWare();
	public TableWare getTanleWare();
}
