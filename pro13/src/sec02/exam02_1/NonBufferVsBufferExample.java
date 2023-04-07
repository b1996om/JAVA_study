package sec02.exam02_1;
// 성능 향상 보조 스트림 :  메모리 버퍼를 추가로 제공하여 프로그램의 실행 성능을 향상
// 바이트 기반 스트림에서는 : BufferInputStream, ButteredOutputStream
// 문자 기반 스트림에서는 : BufferReader, BufferWriter

// 예제 - 파일 복사 성능 테스트
import java.io.*;

public class NonBufferVsBufferExample {
	public static void main(String[] args) throws Exception {
		String originalFilePath1 =
				NonBufferVsBufferExample.class.getResource("originalFile1.jpg").getPath();
		String targetFilePath1 = "C:/Temp/targetFile1.jpg";
		FileInputStream fis = new FileInputStream(originalFilePath1);
		FileOutputStream fos = new FileOutputStream(targetFilePath1);
		
		String originalFilePath2 = 
				NonBufferVsBufferExample.class.getResource("originalFile2.jpg").getPath();
		String targetFilePath2 = "C:/Temp/targetFile2.jpg";
		FileInputStream fis2 = new FileInputStream(originalFilePath2);
		FileOutputStream fos2 = new FileOutputStream(targetFilePath2);
		BufferedInputStream bis = new BufferedInputStream(fis2);
		BufferedOutputStream bos = new BufferedOutputStream(fos2);
		
		long nonBufferTime = copy(fis, fos);
		System.out.println("버퍼를 사용하지 않았을 때:\t" + nonBufferTime + "ns");
		
		
		long bufferTime = copy(bis, bos);
		System.out.println("버퍼를 사용하지 않았을 때:\t" + bufferTime + "ns");
		
		fis.close();
		fos.close();
		bis.close();
		bos.close();
	}
        
	static int data = -1;
	public static long copy(InputStream is, OutputStream os) throws Exception {
		long start = System.nanoTime();
		while(true) {
			data = is.read();
			if(data == -1) break;
			os.write(data);
		}
		os.flush();
		long end = System.nanoTime();
		return (end-start);
	}
}
