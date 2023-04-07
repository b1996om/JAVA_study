package pro08;

public class CalculatorExample {

	public static void main(String[] args) {
		double result1 = 10 * 10 * Calculator.pi;  //Calculator.pi == Calculator클래스 안에 있는 pi 라는 뜻.
		int result2 = Calculator.plus(10,5);
		int result3 = Calculator.minus(10, 5);
		
		System.out.println("result1 : " + result1);  //result1 : 314.159
		System.out.println("result2 : " + result2);
		System.out.println("result3 : " + result3);
	}

}
