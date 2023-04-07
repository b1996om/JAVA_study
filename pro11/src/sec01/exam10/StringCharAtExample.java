package sec01.exam10;
// String 클래스
// 문자 추출 - charAt()
public class StringCharAtExample {
	public static void main(String[] args) {
		String ssn = "010624-1230123";
		char sex = ssn.charAt(7); //7번째 인덱스는 == 1 (인덱스는 0부터 시작하니까)
		switch(sex) {
		case '1': //break문이 없으니까 밑으로 내려감. 밑에서 break만나서 종료.
		case '3':
			System.out.println("남자입니다.");
			break;
		case '2':
			System.out.println("0~4까지만 넣어주세요.");
			break;
		case '4':
			System.out.println("여자 입니다.");
			break;
		case '6':
			System.out.println("인간이 아닙니다.");
		
		}
	}
}
