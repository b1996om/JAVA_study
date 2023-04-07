package sec02.exam05;
//<강제타입변환(casting)> : 부모타입을 자식타입으로 변환.
//조건: 자식타입이 부모타입으로 자동타입 변환후 다시 반대로 변환할 때 사용.
public class ChildExample {
	public static void main(String[] args) {
		Parent parent = new Child();
		parent.field1 = "data1";
		parent.method1();  //값: Parent-method1()
		parent.method2();  //값: Parent-method2()
		
		/*
		parent.field2 = "data2";  //(불가능)
		parent.method3();  //(불가능)
		*/
		
		Child child = (Child) parent;  
		child.field2 = "yyy";  //(가능)
		child.method3();  //(가능) 값: Child-method3()
	}

}
