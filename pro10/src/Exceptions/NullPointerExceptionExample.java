package Exceptions;
//NullPointerException 예외
public class NullPointerExceptionExample {
	public static void main(String[] args) {
//		String data = null;  // java.lang.NullPointerException 예외발생
		String data = "hello";   //- 이렇게 바꿔주면된다. String 타입으로.
		System.out.println(data.toString());
	}

}
