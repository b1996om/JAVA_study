package sec01.exam10;
// 문자 출력 스트림 : Writer
// write(String str)와 write(String str, int off, int len) 메소드 :  예제 - 문자열 출력하기

import java.io.FileWriter;
import java.io.Writer;

public class WriterExample {
	public static void main(String[] args) throws Exception {
		Writer writer = new FileWriter("C:/Temp/test10.txt");
		
		String str = "ABC";
		
		writer.write(str);
		
		writer.flush();
		writer.close();
	}

}
