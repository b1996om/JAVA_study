package sec01.exam03;
//���Ŭ�������� ��� ���� : ��� Ŭ���� ���ο��� �ٱ� Ŭ������ �ʵ�� �޼ҵ忡 �����ϴ� ���.
public class A {
	int field1;
	void method1() {}
	
	static int field2;
	static void method2() {}
	
	/** ��� �ʵ�� �޼ҵ�� ������ �� ���� **/
	class B {
		void method() {
			field1 = 10;
			method1();
			
			field2 = 10;
			method2();
		}
	}
	
	/** static : �ν��Ͻ� �ʵ�� �޼ҵ�� ������ �� ���� **/
	static class C {
		void method() {
			//field1 = 10;
			//method1();
			
			field2 = 10;   
			method2();  
		}
	}
}
