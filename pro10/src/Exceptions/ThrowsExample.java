package Exceptions;
//throws 키워드 : 예외 떠넘기기
//메소드 선언부 끝에 작성되어 메소드에서 처리하지 않은 예외를 호출한 곳으로 넘기는 역할.
//호출한 곳에서 예외를 처리한다.
public class ThrowsExample {
	public static void main(String[] args) {
		try {
			findClass();
		}
		catch(ClassNotFoundException e) {
			System.out.println("클래스가 존재하지 않습니다.");
		}
	}
	//throws 위치 잘 보기.
	public static void findClass() throws ClassNotFoundException {
		Class clazz = Class.forName("java.lang.String2");
	}

}
