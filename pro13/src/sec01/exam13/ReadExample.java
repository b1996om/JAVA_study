package sec01.exam13;
// 문자 입력 스트림 : Reader
// read(char[] cbuf, intoff, intlen) 메소드 : 예제 - 지정한 길이만큼 읽기

import java.io.FileReader;
import java.io.Reader;

public class ReadExample {
	public static void main(String[] args) throws Exception {
		Reader reader = new FileReader("C:/Temp/test9.txt");
		
		char[] buffer = new char[5];
		
		int readCharNum = reader.read(buffer, 2, 3);
		if(readCharNum != -1) {
			for(int i=0; i<buffer.length; i++) {
				System.out.println(buffer[i]);
			}
		}
		
		reader.close();
	}

}
