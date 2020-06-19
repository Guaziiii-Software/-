package com.atguigu.java;

import java.awt.List;

public class HelloWorld {
	public static void main(String[] args){
		final float YOUTH_AGE = 18.5555f;
		System.out.println(YOUTH_AGE);
		
		final float a=3.4f,b=4f;
		final int c=5;
		System.out.println(a+b+c);
		
		
		//final int own_name = 8;
		//own_name = 16;
		
		int a1 = 6;
		//a1 = 7;
		System.out.println(a1); 
		
		char c1 = 999;
		System.out.println(c1);
		
		boolean va = 6>3;
		boolean vb = 6<3;
		System.out.println("va is "+va);
		System.out.println("vb is "+vb);
		
		//引用数据类型
		Object object = null;
		List list = null;
		int[] months = null;
		System.out.println("object is "+object);
		System.out.println("list is "+list);
		
		
		byte b_1 = 75;
		char c_1 = 'c';
		int d_1 = 123123123;
		long l = 13124124124124l;
		long result = b_1 * c_1 - d_1 + l;
		System.out.println(result);
		
		//定义一个数组，并给予数组长度，不初始化。
		int[] boy = new int[10];
		System.out.println(boy.length);
		
		//定义一个数组，并初始化。
		int[] boy1 = new int[]{1,3,2};
		
		//定义一个数组，并初始化简写。
		int[] boy2 = {1,3,2};
		
		short s = '6';
		System.out.println(s);
		
		
		
	}

}
