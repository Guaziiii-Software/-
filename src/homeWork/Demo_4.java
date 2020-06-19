package homeWork;

public class Demo_4 {
	public static void main(String[] args) {
		int[] arr = {24,12,25,101,96,28};
		method1(arr);
	}

	private static void method1(int[] arr) {
		float sum = 0;
		for(int i = 0; i < arr.length ; i++){
			sum = sum + arr[i];
			
			
		}
		System.out.println(sum/arr.length);
		
	}

}
