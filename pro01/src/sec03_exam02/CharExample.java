package sec03_exam02;

public class CharExample {

	public static void main(String[] args) {
		char c1 = 'A';           //문자를 직접 저장
		char c2 = 65;            //십진수로 저장, 이게 지금 int가 아니고 char으로 받았으니까 A 출력.
		char c3 = '\u0041';      //16진수로 저장
		
		char c4 = '가';          //문자를 직접 저장
		char c5 = 44032;        //십진수로 저장
		char c6 = '\uac00';     //16진수로 저장
		
		System.out.println(c1);  //A
		System.out.println(c2);  //A
		System.out.println(c3);  //A
		System.out.println(c4);  //가
		System.out.println(c5);  //가
		System.out.println(c6);  //가
	}

}
