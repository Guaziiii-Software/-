package homeWork;

public class Demo_2 {
	public static void main(String[] args) {
		//定义一个整型数组并初始化。
		int[] arr = {24,12,25,101,96,28};
		//定义一个方法并将返回值赋给int min。
		int min = minofarr(arr);
		//输出值。
		System.out.println(min);
	}

	private static int minofarr(int[] arr) {
		//将数组中第一个数赋给int min。
		int min = arr[0];
		//遍历，从地址为1也就是数组中第二个数开始。
		for(int i = 1 ; i < arr.length; i++){
			//若第二个数小于第一个数则将第二个数赋给min。
			if(min > arr[i]){
				min = arr[i];
			}
			
		}
		return min;
	}

}
