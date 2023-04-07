package sec01.exam06;
//(참고)final은 클래스, 메서드, 변수 각각에 붙을 수 있다.
public class Car {
	//필드 
	public int speed;
	
	//메소드
	public void speedUp() {
		speed += 1;
	}
	
	//final 메소드
	public final void stop() {
		System.out.println("차를 멈춤");
		speed = 0;
	}
}
