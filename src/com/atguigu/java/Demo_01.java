package com.atguigu.java;

public class Demo_01 {
	public static void main(String[] args){
		int i=1,num,num1;
		System.out.println("100以内能被3和7整除的数为：");
		while(i<=100){
			for(i=1;i<=100;i++){
				num=i%3;
				num1=i%7;
				if(num == 0){
					if(num1 == 0){
						System.out.println(i);
						System.out.println();
					}
					
				}
			}
		}
	}

}
