package sec02.exam01;
// ������ ���� ���� : �־��� �ð� ���� �Ͻ� ����
// Thread Ŭ������ ���� �޼ҵ� sleep() ���
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


