package pro02;
//실수 연산에서의 자동형변환
public class OperationsPromotionExam {

	public static void main(String[] args) {
		byte byteValue1 = 10;
		byte byteValue2 = 20;
//		byte byteValue1= byteValue1 + byteValue2;  - 컴파일에러
		int intValue1 = byteValue1 + byteValue2;  //int형으로 바꿔줘야함.
		System.out.println(intValue1); //30
		
		char charValue1 = 'A';
		char charValue2 = 1;
		int intValue2 = charValue1 + charValue2;
		System.out.println("유니코드=" + intValue2); //유니코드=66
		System.out.println("출력문자=" + (char)intValue2); //출력문자=B
		
		int intValue3 = 10;
		int intValue4 = intValue3 / 4;
		System.out.println(intValue4); //2  - int형(정수형)이라 뒤에 소숫점 날라감.
		
		int intValue5 = 10;
//      int intValue6 = 10 / 4.0;  - 컴파일 에러		
		double doubleValue = intValue5 / 4.0;  //double형이 있으면 double로 바꿔줘야함.
		System.out.println(doubleValue); //2.5
		
		int x = 1;
		int y = 2;
		double result = (double) x / y;
		System.out.println(result); //0.5
	}

}
