package sec03.exam02;
//자식 클래스에서 재정의되어 실행 내용을 경정해야 한다.
public class Dog extends Animal {
	public Dog() {
		this.kind = "포유류";
	}
	
	@Override
	public void sound() {
		System.out.println("멍멍");
	}
}
