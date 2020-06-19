package com.atguigu.java;

import homeWork.Person;

public class Use_Person {
	public static void main(String[] args) {
		Person per = new Person();
		per.name = "陈东宇";
		per.age = 21;
		per.height = "174cm";
		System.out.println(per.name);
		System.out.println(per.age);
		System.out.println(per.height);
		
		per.eat();
		per.exercise();
		per.stu();
		
		
	}

}
