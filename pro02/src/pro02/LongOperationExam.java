package pro02;

public class LongOperationExam {

	public static void main(String[] args) {
		
		byte value1 = 10;
		int value2 = 100;
		long value3 = 1000L;
		long result = value1 + value2 + value3; 
        // 피 연산자 중 하나가 long 타입이면 다른 피연산자는 long 타입으로 자동 변환!
		System.out.println(result);  //1110
	}

}
