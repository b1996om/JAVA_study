package sec01.exam06;

public class MyClassExample {
	public static void main(String[] args) {
		System.out.println("1)---------------");
		
		MyClass myClass1 = new MyClass();
		myClass1.rc.turnOn();  //TV�� �մϴ�.
		myClass1.rc.setVolume(5);  //���� TV ����: 5
	
		System.out.println("2)---------------");
		
		MyClass myClass2 = new MyClass(new Audio()); //Aduio�� �մϴ�.
		                                             //���� Aduio ����: 5
		
		System.out.println("3)---------------");
		
		MyClass myClass3 = new MyClass();
		myClass3.methodA();  //Aduio�� �մϴ�.
		                     //���� Aduio ����: 5
		
		System.out.println("4)----------------");
		
		MyClass myClass4 = new MyClass();
		myClass4.methodB(new Television());  //TV�� �մϴ�.
		                                     //���� TV ����: 5
	}

}
