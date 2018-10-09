package com.zenquan.Animal;

import com.zenquan.designpattern.TableWare;

//具体餐具 Knife 的定义如下
public class Knife implements TableWare {
	public String getToolName() {
		return "knife";
	}
}