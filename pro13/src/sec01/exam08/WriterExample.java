package sec01.exam08;
// 문자 출력 스트림 : Writer
// write(char[] cbuf) 메소드 :  예제 - 배열 전체를 출력하기

import java.io.FileWriter;
import java.io.Writer;

public class WriterExample  {
	public static void main(String[] args) throws Exception {
		Writer writer = new FileWriter("C:/Temp/test8.txt");
		
		char[] array = { 'A', 'B', 'C' };
		
		writer.write(array);
		
		writer.flush();
		writer.close();
	}

}
