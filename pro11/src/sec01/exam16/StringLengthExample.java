package sec01.exam16;
// String 클래스
// 문자열 길이 - length()  : 문자열 길이를 리턴한다.(1부터 개수세면 됨)
public class StringLengthExample {
	public static void main(String[] args) {
		String ssn = "7306241230123";
		int length = ssn.length();
		if(length == 13) {
			System.out.println("주민번호 자리수가 맞습니다.");  //주민번호 자리수가 맞습니다.
		}
		else {
			System.out.println("주민번호 자리수가 틀립니다.");
		}
	}

}
