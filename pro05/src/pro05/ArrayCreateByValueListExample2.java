package pro05;
// Array, Add
public class ArrayCreateByValueListExample2 {

	public static void main(String[] args) {
		int[] scores;
		scores = new int[] {83,90,87};
		int sum1 =0;
		for(int i=0; i<3; i++ ) {
			sum1 += scores[i];
		}
		System.out.println("รัวี : " + sum1 ); //รัวี : 260
		
		int sum2 = add(new int[] {83,90,87});
		System.out.println("รัวี : " + sum2); //รัวี : 260
		System.out.println();
	}
	
	public static int add(int[] scores) {
		int sum = 0;
		for(int i=0; i<3; i++) {
			sum += scores[i];
		}
		return sum;
	}

}
