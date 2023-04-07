package sec01.exam06;
// 바이트 기반 스트림(Stream)
// 바이트 입력 스트림 : IntputStream
// read(byte[] b, int off, int len) 메소드 : 예제 - 지정한 길이만큼 읽기

import java.io.FileInputStream;
import java.io.InputStream;

public class ReadExample {
	public static void main(String[] args) throws Exception {
		InputStream is = new FileInputStream("C:/Temp/test3.db");
		
		byte[] buffer = new byte[5];
		
		int readByteNum = is.read(buffer, 2, 3);
		if(readByteNum != -1) {
			for(int i=0; i<buffer.length; i++) {
				System.out.println(buffer[i]);
			}
		}
		
		is.close();
	}

}
