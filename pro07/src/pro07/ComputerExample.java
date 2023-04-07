package pro07;
//활용 클래스.
public class ComputerExample {
	public static void main(String[] args) {
		Computer myCom = new Computer();
		
		int[] values1 = {1,2,3};
		int result1 = myCom.sum1(values1);
		System.out.println("result1 : " + result1); //result1 : 6
		
		int result2 = myCom.sum1(new int[] {1,2,3,4,5}); //result2 : 15
		System.out.println("result2 : " + result2);
		
		int result3 = myCom.sum2(1,2,3);
		System.out.println("result3 : " + result3); //result3 : 6
		
		int result4 = myCom.sum2(1,2,3,4,5);
		System.out.println("result4 : " + result4); //result4 : 15
	}

}
