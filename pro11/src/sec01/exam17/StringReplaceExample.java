package sec01.exam17;
// String 클래스
// 문자열 대치 - replace() : 첫 번째 매개값인 문자열을 찾아 두 번째 매개값인 문자열로 대치한 새로운 문자열 생성 및 리턴
public class StringReplaceExample {
	public static void main(String[] args) {
		String oldStr = "자바는 객체 지향 언어입니다. 자바는 풍부한 API를 지원합니다.";
	    String newStr = oldStr.replace("자바", "JAVA");
	    System.out.println(oldStr);  //자바는 객체 지향 언어입니다. 자바는 풍부한 API를 지원합니다.
	    System.out.println(newStr);  //JAVA는 객체 지향 언어입니다. JAVA는 풍부한 API를 지원합니다.
	
	
	}

}
