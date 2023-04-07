package sec01.exam10;
// String 클래스 
// 바이트 배열을 문자열로 변환해보기 예시1
public class ByteToStringExample {
	public static void main(String[] args) {
		byte[] bytes = { 72, 101, 108, 108, 111, 32, 74, 97, 118, 97 };
		
		String str1 = new String(bytes);
		System.out.println(str1);  //Hello Java
		
		String str2 = new String(bytes, 6, 4);
		System.out.println(str2);  //Java
	}

}
