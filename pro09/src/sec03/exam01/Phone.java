package sec03.exam01;
//abstract 키워드 사용 : 추상 메서드
//<추상 메서드> : 메소드의 선언부만 있고 처리부가 없는 것.
public abstract class Phone {
	//필드
	public String owner;
	
	//생성자
	public Phone(String owner) {
		this.owner = owner;
	}
	
	//메소드
	public void turnOn() {
		System.out.println("폰 전원을 켭니다."); //추상메서드이기 때문에 원래 이 처리부가 비어있음.
	}
	public void turnOff() {
		System.out.println("폰 전원을 끕니다."); //추상메서드이기 때문에 원래 이 처리부가 비어있음.
	}
}
