package sec02.exam05;
//�������̽� ��� : �������̽��� ���� ����� �� �� �ִ�.
public class Example {
	public static void main(String[] args) {
		ImplementationC impl = new ImplementationC();
		
		InterfaceA ia = impl;
		ia.methodA(); //ImplementationC-methodA() ����
		System.out.println();
		
		InterfaceB ib = impl;
		ib.methodB(); //ImplementationC-methodB() ����
		System.out.println();
		
		InterfaceC ic = impl; //���߻��.
		ic.methodA();  //ImplementationC-methodA() ����
		ic.methodB();  //ImplementationC-methodB() ����
		ic.methodC();  //ImplementationC-methodC() ����

	}

}
