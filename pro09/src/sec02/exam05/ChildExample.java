package sec02.exam05;
//<����Ÿ�Ժ�ȯ(casting)> : �θ�Ÿ���� �ڽ�Ÿ������ ��ȯ.
//����: �ڽ�Ÿ���� �θ�Ÿ������ �ڵ�Ÿ�� ��ȯ�� �ٽ� �ݴ�� ��ȯ�� �� ���.
public class ChildExample {
	public static void main(String[] args) {
		Parent parent = new Child();
		parent.field1 = "data1";
		parent.method1();  //��: Parent-method1()
		parent.method2();  //��: Parent-method2()
		
		/*
		parent.field2 = "data2";  //(�Ұ���)
		parent.method3();  //(�Ұ���)
		*/
		
		Child child = (Child) parent;  
		child.field2 = "yyy";  //(����)
		child.method3();  //(����) ��: Child-method3()
	}

}
