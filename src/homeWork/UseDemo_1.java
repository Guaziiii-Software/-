package homeWork;

public class UseDemo_1 {
	public static void bubbleSort(int[] arr) {
		for(int i = 1 ; i < arr.length ; i++){
			for(int j = 0 ; j < arr.length - i ; j++){
				if(arr[j+1] < arr[j]){
					
				int temp = arr[j];
				arr[j] = arr[j+1];
				arr[j+1] = temp;
				}
			}
		}
	}
		

}
