package Exceptions;
//ArrayIndexOutOfBoundsException ����ó��!
//����ó���ϴ� ���? 
// : [Run]-[Run Configuration]-[Arguments]��-[Program arguments]���� �ΰ��� ���ڿ� �ܾ� �ۼ����ش�. ex)�迭 �ε���
public class ArrayIndexOutOfBoundsExceptionExample {
	public static void main(String[] args) {
		if(args.length == 2) {
			String data1 = args[0];
			String data2 = args[1];
			System.out.println("args[0]: " + data1);
			System.out.println("args[1]: " + data2);
			//����ó�� �ϸ� args[0]: �迭
			//           args[1]: �ε���  �̷��� ��µȴ�!
		}
		else {
			System.out.println("�� ���� ���� �Ű����� �ʿ��մϴ�.");
			//���� ó�� ���ϸ� else �߹� ���� ��µȴ�.
		}
	}

}
