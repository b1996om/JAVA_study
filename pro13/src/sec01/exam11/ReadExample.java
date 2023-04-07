package sec01.exam11;
// 문자 입력 스트림 : Reader
// read() 메소드 : 예제 - 한 문자씩 읽기

import java.io.FileReader;
import java.io.Reader;

public class ReadExample {
	public static void main(String[] args) throws Exception {
		Reader reader = new FileReader("C:/Temp/test7.txt");
		while(true) {
			int data = reader.read();
			if(data == -1) break;
			System.out.println((char)data);
		}
		
		reader.close();
	}

}
