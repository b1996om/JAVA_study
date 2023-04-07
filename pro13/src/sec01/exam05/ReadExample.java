package sec01.exam05;
// 바이트 기반 스트림(Stream)
// 바이트 입력 스트림 : IntputStream
// read(byte[] b) 메소드 : 예제 - 배열 길이만큼 읽기

import java.io.FileInputStream;
import java.io.InputStream;

public class ReadExample {
	public static void main(String[] args) throws Exception {
		InputStream is = new FileInputStream("C:/Temp/test2.db");
		
		byte[] buffer = new byte[100];
		
		while(true) {
			int readByteNum = is.read(buffer);
			if(readByteNum == -1) break;
			for(int i =0; i<readByteNum; i++) {
				System.out.println(buffer[i]);
			}
		}
		
		is.close();
	}

}
