package pro02;
//자동형변환(promotion) : 값의 허용 범위가 작은 타입이 큰 타입으로 저장될 경우
public class PromotionExam {

	public static void main(String[] args) {
		//자동 타입 변환
		byte byteValue = 10;
		int intValue = byteValue;
		System.out.println("intValue:" + intValue); //intValue:10
		
		char charValue = '가';
		intValue = charValue;
		System.out.println("가의 유니코드:" + intValue); //가의 유니코드:44032
		
		intValue =50;
		long longValue = intValue;
		System.out.println("longValue:" + longValue); //longValue:50
		
		longValue = 100;
		float floatValue = longValue;
		System.out.println("floatValue:" + floatValue); //floatValue:100.0
		
		floatValue = 100.5F;
		double doubleValue = floatValue;
		System.out.println("doubleValue:" + doubleValue); //doubleValue:100.5
	}
}
