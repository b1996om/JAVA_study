package Exceptions;
//ArrayIndexOutOfBoundsException 예외처리!
//예외처리하는 방법? 
// : [Run]-[Run Configuration]-[Arguments]탭-[Program arguments]들어가서 두개의 문자열 단어 작성해준다. ex)배열 인덱스
public class ArrayIndexOutOfBoundsExceptionExample {
	public static void main(String[] args) {
		if(args.length == 2) {
			String data1 = args[0];
			String data2 = args[1];
			System.out.println("args[0]: " + data1);
			System.out.println("args[1]: " + data2);
			//예외처리 하면 args[0]: 배열
			//           args[1]: 인덱스  이렇게 출력된다!
		}
		else {
			System.out.println("두 개의 실행 매개값이 필요합니다.");
			//예외 처리 안하면 else 중문 안이 출력된다.
		}
	}

}
