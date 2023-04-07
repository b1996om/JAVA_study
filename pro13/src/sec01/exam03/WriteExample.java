package sec01.exam03;
//바이트 기반 스트림(Stream)
//바이트 출력 스트림 : OutputStream
//write(byte[] b) 메소드 : 예제 - 배열 일부를 출력하기

import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteExample {
	public static void main(String[] args) throws Exception {
		OutputStream os = new FileOutputStream("C:/Temp/test3.db");
		
		byte[] array = { 10, 20, 30, 40, 50 };
		
		os.write(array, 1, 3);
		
		os.flush();
		os.close();
	}

}
