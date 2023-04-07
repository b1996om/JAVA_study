package pro06;
//생성자 오버로딩 : 매개 변수를 달리하는 생성자 여러 개 선언
public class Car2 {
	//필드
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	//생성자
	Car2() {
	}
	
	Car2(String model) {
		this.model = model;
	}
	Car2(String model, String color) {
		this.model = model;
		this.color = color;
	}
	Car2(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}
