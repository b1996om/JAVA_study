package Retest;

public class again_3 {
	public static void main(String[] args) {
		
		int[] array = { 83, 90, 87 };
		int sum = 0;
		int avg = 0;
		
		for(int i=0; i<array.length; i++) {
			sum += array[i];
		}
		avg = sum / array.length;
		
		System.out.println(sum);
		System.out.println(avg);
	}

}
