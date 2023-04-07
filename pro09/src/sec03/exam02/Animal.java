package sec03.exam02;
//<추상 메소드와 재정의>
public abstract class Animal {
	public String kind;
	
	public void breathe() {
		System.out.println("숨을 쉽니다.");
	}
	
	public abstract void sound(); //소리를 낸다:어떤 소리인지는 아직 모르기 때문에 추상메소드 처리.
}
