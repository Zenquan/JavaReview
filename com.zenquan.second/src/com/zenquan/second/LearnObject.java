package com.zenquan.second;

class Student {
 	protected String Name;
	protected String Sex;
	protected int age;
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getSex() {
		return Sex;
	}
	public void setSex(String sex) {
		Sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
public class LearnObject {
	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student();
		s1.setName("zenquan");
		s2 = s1;
		s1.setName("can");
		System.out.println(s2.getName());
	}
}
