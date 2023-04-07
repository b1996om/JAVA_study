package sec01.exam01;
//Runnable 인터페이스를 사용하므로써 implements(구현) 시켜주는 방법.
//비프음을 들려주는 작업 정의 - Runnable구현 클래스
import java.awt.Toolkit;

public class BeepTask implements Runnable {
	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i=0; i<5; i++) {
			toolkit.beep();
			try { Thread.sleep(500); } catch(Exception e) {}
		}
	}
}
