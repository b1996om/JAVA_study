package sec01.exam09;
// ���� ��� ��Ʈ�� : Writer
// write(char[] cbuf, int off, int len) �޼ҵ� :  ���� - �迭 �Ϻθ� ����ϱ�

import java.io.FileWriter;
import java.io.Writer;

public class WriterExample {
	public static void main(String[] args) throws Exception {
		Writer writer = new FileWriter("C:/Temp/test9.txt");
		
		char[] array = { 'A', 'B', 'C', 'D', 'E' };
		
		writer.write(array, 1 , 3);
		
		writer.flush();
		writer.close();
	}

}
