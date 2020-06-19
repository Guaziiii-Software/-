package com.atguigu.java;

public class StudentDemo {
	
	public static void main(String[] args) {
	//	引用对象的属性
	
		//!!!!---(0)在使用对象之前需要new对象。---!!!!
	
		//(1)new Student() 在jvm中申请一片内存空间。
	
		//(2)Student stu 定义了一个引用类型的变量。
	
		Student stu = new Student();
	
	
		//将引用对象的属性赋给此函数中的新建变量；
	
		int age = stu.age;
	
		String name = stu.name;
	
	
		//若不给面向对象属性赋值则输出默认值。
	
		System.out.println(age);
	
		System.out.println(name);
	
	
		//若赋值，则输出所赋值。
	
	
		//1.首先将值赋给面向对象的stu.age
	
		//2.将引用对象的stu.age赋值给新建的变量age.
	
		stu.age = 10;
	
		stu.name = "陈东宇";
	
	
		age = stu.age;
	
		name = stu.name;
	
	
		System.out.println(age);
	
		System.out.println(name);
	
	
	//引用对象的方法。必须先new对象才能使用。
		stu.eat();
		
		stu.study();
		
		stu.sleep();
	
	
	

    }
}
