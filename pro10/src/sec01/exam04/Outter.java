package sec01.exam04;
//로컬 클래스에서 사용 제한 : 메소드의 매개 변수나 로컬 변수를 로컬 클래스에서 사용할 때의 제한
public class Outter {
	//자바 7 이전
	public void method1(final int arg) {
		final int localVariable = 1;
		//arg = 100;
		//localVariable = 100;
		class Inner {
			public void method() {
				int result = arg + localVariable;
			}
		}
	}
	
	//자바 8 이후 : 8이후부터는 final 선언하지 않아도 final 특성이 부여되있음.
	public void method2(int arg) {
		int localVariable = 1;
		//arg = 100;
		//localVariable = 100;
		class Inner {
			public void method() {
				int result = arg + localVariable;
			}
		}
	}
}
