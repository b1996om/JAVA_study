package sec03_exam02;

public class LongExample {

	public static void main(String[] args) {
		long var1 = 10;  //4바이트
		long var2 = 20L;  //8바이트(long형)
//		long var3 = 1000000000000;  //  ->컴파일 에러
		long var4 = 1000000000000L; //뒤에 L은 꼭 대문자로 써줘야 숫자 1과 헷갈리지 않는다.
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var4);
	}

}
