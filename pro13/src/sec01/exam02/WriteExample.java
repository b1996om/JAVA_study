package sec01.exam02;
// ����Ʈ ��� ��Ʈ��(Stream)
// ����Ʈ ��� ��Ʈ�� : OutputStream
// write(byte[] b) �޼ҵ� : ���� - �迭 ��ü�� ����ϱ�

import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteExample {
	public static void main(String[] args) throws Exception {
		OutputStream os = new FileOutputStream("C:/Temp/test2.db");
		
		byte[] array = { 10, 20, 30 };
		
		os.write(array);
		
		os.flush();
		os.close();
	}

}
