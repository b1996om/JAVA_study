package sec01.exam04;
// 바이트 기반 스트림(Stream)
// 바이트 입력 스트림 : IntputStream
// read() 메소드 : 예제 - 1byte씩 읽기

import java.io.FileInputStream;
import java.io.InputStream;

public class ReadExample {
	public static void main(String[] args) throws Exception {
		InputStream is = new FileInputStream("C:/Temp/test1.db");
		while(true) {
			int data = is.read();
			if(data == -1) break;
			System.out.println(data);
		}
		is.close();
	}
}
