package Exceptions;
//throws Ű���� : ���� ���ѱ��
//�޼ҵ� ����� ���� �ۼ��Ǿ� �޼ҵ忡�� ó������ ���� ���ܸ� ȣ���� ������ �ѱ�� ����.
//ȣ���� ������ ���ܸ� ó���Ѵ�.
public class ThrowsExample {
	public static void main(String[] args) {
		try {
			findClass();
		}
		catch(ClassNotFoundException e) {
			System.out.println("Ŭ������ �������� �ʽ��ϴ�.");
		}
	}
	//throws ��ġ �� ����.
	public static void findClass() throws ClassNotFoundException {
		Class clazz = Class.forName("java.lang.String2");
	}

}
