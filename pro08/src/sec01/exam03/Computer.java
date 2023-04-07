package sec01.exam03;
//오버라이딩(메소드 재정의)
//라이브러리 상속 클래스.
public class Computer extends Calculator {
	@Override
	double areaCircle(double r) {
		System.out.println("Computer 객체의 areaCircle() 실행");
		return Math.PI * r * r;
	}

}
