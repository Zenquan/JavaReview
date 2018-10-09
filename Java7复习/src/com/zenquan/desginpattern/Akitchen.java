package com.zenquan.desginpattern;

public class Akitchen implements KitenFactory{
	public Food getFood() {
		return new Apple();
	};
	public TableWare getTableWare() {
		return new Kiffen();
	};
	@Override
	public TableWare getTanleWare() {
		return null;
	};	
}
