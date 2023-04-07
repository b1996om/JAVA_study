package pro02;
// +연산에서의 문자열 자동형변환
public class StringConcatExam {

	public static void main(String[] args) {
		//숫자연산
		int value = 10 + 2 + 8;
		System.out.println(value);
		
		//연결연산
		String str1 = 10 + 2 + "8";
		System.out.println(str1);  //128 - 10+2=12를 문자열로 자동바꿔서 12+8=128.
		
		String str2 = 10 + "2" + 8;
		System.out.println(str2);  //1028
		
		String str3 = "10 + 2 + 8";
		System.out.println(str3);  //10 + 2 + 8
		
		String str4 = "10" + (2 + 8);
		System.out.println(str4);  //1010
	}

}
