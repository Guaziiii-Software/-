package homeWork;

import java.util.Arrays;

public class Demo_1 {
	public static void main(String[] args) {
		//(1)定义一个整型数组并初始化。
		int[] arr = {24,12,25,101,96,28};
		//(2)定义一个方法。
		bubbleSort(arr);
		//(3)输出排序后的数组。
		System.out.println(Arrays.toString(arr));
	}

	private static void bubbleSort(int[] arr) {
		//*******冒泡排序********//
			//一趟比较arr.length-1次且可以确定数组中一个位置//
				//1.外层遍历
		for(int i = 1 ; i < arr.length ; i++){
				//2.第二层遍历
			for(int j = 0 ; j < arr.length - i ; j++){
				//****若数组排序原本就符合要求便排序次数较少****//
				boolean flag = true;
				//3.若后一个数比前一个小则前后对调。
				if(arr[j+1] < arr[j]){
					
				int temp = arr[j];
				arr[j] = arr[j+1];
				arr[j+1] = temp;
				flag = false;
				}
				if(flag){
					break;
				}
			}
		
		}
		
	}
}