package com.atguigu.java;

public class test {
	int i1 = 1;
	int i2;
	public static void main(String[] args){
		int i = 3;
		test test = new test();
		System.out.println(i + test.i1 + test.i2);
		
		
		int[] num = {1,2,3,4,5};
		for(int a : num){
			System.out.print(a+" ");
		}
	}

}
