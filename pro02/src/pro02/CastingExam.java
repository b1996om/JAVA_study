package pro02;
//강제형변환(casting) : 큰 허용 범위 타입을 작은 허용 범위 타입으로 강제로 나누어 한 조각만 저장
//캐스팅 연산자 괄호 () 사용: 괄호 안이 나누는 단위
public class CastingExam {

	public static void main(String[] args) {
		int intValue = 44032;
		char charValue = (char) intValue;
		System.out.println(charValue); //가
		
		long longValue = 500;
		intValue = (int) longValue;
		System.out.println(intValue); //500
		
		double doubleValue = 3.14;
		intValue = (int) doubleValue;
		System.out.println(intValue); //3
		
	}

}
