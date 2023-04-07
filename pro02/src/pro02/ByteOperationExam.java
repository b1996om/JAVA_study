package pro02;

public class ByteOperationExam {

	public static void main(String[] args) {
		byte result1 = 10 + 20;
		System.out.println(result1);  //30
		
		byte x = 10;
		byte y = 20;
		int result2 = x + y; //byte, char, short 타입변수는 int타입으로 자동변환!!
		System.out.println(result2);  //30
	}

}
