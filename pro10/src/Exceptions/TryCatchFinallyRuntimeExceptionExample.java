package Exceptions;
//ArrayIndexOutOfBoundsException 예외처리
public class TryCatchFinallyRuntimeExceptionExample {
	public static void main(String[] args) {
		String data1 = null;
		String data2 = null;
		try {
			data1 = args[0];
			data2 = args[1];
		}
		catch(ArrayIndexOutOfBoundsException e) {
			//ArrayIndexOutOfBoundsException 예외처리 예제 들춰보기.
			//문자열 텍스트 두개 넣어주면 "숫자로 변환할 수 없습니다." 출력되고 "다시 실행하세요." 출력
			System.out.println("실행 매개값의 수가 부족합니다.");
			return;
		}
		
		try {
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			int result = value1 + value2;
			System.out.println(data1 + "+" + data2 + "=" + result);
		}
		catch(NumberFormatException e) {
			System.out.println("숫자로 변환할 수 없습니다.");
		}
		//finally문은 항상 출력된다.
		finally {
			System.out.println("다시 실행하세요.");
		}
	}
}
