package sec01.exam09;
// 문자 출력 스트림 : Writer
// write(char[] cbuf, int off, int len) 메소드 :  예제 - 배열 일부를 출력하기

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
