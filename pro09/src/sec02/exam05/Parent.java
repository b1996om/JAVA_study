package sec02.exam05;
//<강제타입변환(casting)> : 부모타입을 자식타입으로 변환.
//조건: 자식타입이 부모타입으로 자동타입 변환후 다시 반대로 변환할 때 사용.
public class Parent {
	public String field1;
	
	public void method1() {
		System.out.println("Parent-method1()");
	}
	
	public void method2() {
		System.out.println("Parent-method2()");
	}
}
