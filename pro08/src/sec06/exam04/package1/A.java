package sec06.exam04.package1;
//필드와 메소드의 접근제한
public class A {
	
	//필드
	A a1 = new A(true);
	A a2 = new A(1);
	A a3 = new A("문자열");
	
	//생성자
	public A(boolean b) {}
	A(int b) {}
	private A(String s) {}
}
