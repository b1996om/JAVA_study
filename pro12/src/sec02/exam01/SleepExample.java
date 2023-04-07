package sec02.exam01;
// 스레드 상태 제어 : 주어진 시간 동안 일시 정지
// Thread 클래스의 정적 메소드 sleep() 사용
import java.awt.Toolkit;

public class SleepExample {
	public static void main(String[] args) {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i=0; i<19; i++) {
			toolkit.beep();
			try {
				Thread.sleep(3000);
			} catch(InterruptedException e) {}
		}
	}
}


