package pro07;
//활용 클래스.
public class CalculatorExample {
	public static void main(String[] args) {
		
		Calculator myCalc = new Calculator();
		myCalc.powerOn();  //전원을 켭니다.
		
		int result1 = myCalc.plus(5,  6);
		System.out.println("result1 : " + result1); //result1 : 11
		
		byte x = 10;
		byte y = 4;
		double result2 = myCalc.divide(x, y);
		System.out.println("result2 : " + result2); //result2 : 2.5
		
		myCalc.powerOff(); //전원을 끕니다.
	}

}
