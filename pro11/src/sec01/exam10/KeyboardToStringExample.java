package sec01.exam10;
// String Ŭ���� 
// ����Ʈ �迭�� ���ڿ��� ��ȯ�غ��� ����2
import java.io.IOException;

public class KeyboardToStringExample {
	public static void main(String[] args) throws IOException {
		byte[] bytes = new byte[100];  //���� ����Ʈ�� �����ϱ� ���� �迭 ����
		
		System.out.print("�Է�: ");
		int readByteNo = System.in.read(bytes); //���� �Է��� ���ڿ���
		
		String str = new String(bytes, 0, readByteNo-2);
		System.out.println(str);  // ���⿡ ��µȴ�.
	}

}
