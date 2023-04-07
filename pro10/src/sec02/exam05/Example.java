package sec02.exam05;
//인터페이스 상속 : 인터페이스는 다중 상속을 할 수 있다.
public class Example {
	public static void main(String[] args) {
		ImplementationC impl = new ImplementationC();
		
		InterfaceA ia = impl;
		ia.methodA(); //ImplementationC-methodA() 실행
		System.out.println();
		
		InterfaceB ib = impl;
		ib.methodB(); //ImplementationC-methodB() 실행
		System.out.println();
		
		InterfaceC ic = impl; //다중상속.
		ic.methodA();  //ImplementationC-methodA() 실행
		ic.methodB();  //ImplementationC-methodB() 실행
		ic.methodC();  //ImplementationC-methodC() 실행

	}

}
