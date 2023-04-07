package sec01.exam10;
// String 클래스 
// 바이트 배열을 문자열로 변환해보기 예시2
import java.io.IOException;

public class KeyboardToStringExample {
	public static void main(String[] args) throws IOException {
		byte[] bytes = new byte[100];  //읽은 바이트를 저장하기 위한 배열 생성
		
		System.out.print("입력: ");
		int readByteNo = System.in.read(bytes); //내가 입력한 문자열이
		
		String str = new String(bytes, 0, readByteNo-2);
		System.out.println(str);  // 여기에 출력된다.
	}

}
