package sec01.exam02;
// 바이트 기반 스트림(Stream)
// 바이트 출력 스트림 : OutputStream
// write(byte[] b) 메소드 : 예제 - 배열 전체를 출력하기

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
