package sec01.exam21;
// String 클래스
// 문자열(String) 변환 - valueOf()
public class StringValueOfExample {
	public static void main(String[] args) {
		String str1 = String.valueOf(10);
		String str2 = String.valueOf(10.5);
		String str3 = String.valueOf(true);
		
		System.out.println(str1);  //10 - 숫자 아님, 문자열임
		System.out.println(str2);  //10.5 (문자열)
		System.out.println(str3);  //true (문자열)
	}

}
