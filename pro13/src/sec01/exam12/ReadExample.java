package sec01.exam12;
// ���� �Է� ��Ʈ�� : Reader
// read(char[] cbuf) �޼ҵ� : ���� - �迭 ���̸�ŭ �б�

import java.io.FileReader;
import java.io.Reader;

public class ReadExample {
	public static void main(String[] args) throws Exception {
		Reader reader = new FileReader("C:/Temp/test8.txt");
		
		char[] buffer = new char[100];
		
		while(true) {
			int readCharNum = reader.read(buffer);
			if(readCharNum == -1) break;
			for(int i=0; i<readCharNum; i++) {
				System.out.println(buffer[i]);
			}
			
		}
		
		reader.close();
	}

}
