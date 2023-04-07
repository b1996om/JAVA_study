package sec01.exam03;
//멤버클래스에서 사용 제한 : 멤버 클래스 내부에서 바깥 클래스의 필드와 메소드에 접근하는 경우.
public class A {
	int field1;
	void method1() {}
	
	static int field2;
	static void method2() {}
	
	/** 모든 필드와 메소드는 접근할 수 있음 **/
	class B {
		void method() {
			field1 = 10;
			method1();
			
			field2 = 10;
			method2();
		}
	}
	
	/** static : 인스턴스 필드와 메소드는 접근할 수 없음 **/
	static class C {
		void method() {
			//field1 = 10;
			//method1();
			
			field2 = 10;   
			method2();  
		}
	}
}
