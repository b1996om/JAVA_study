package sec01.exam01;
//Runnable �������̽��� ����ϹǷν� implements(����) �����ִ� ���.
//�������� ����ִ� �۾� ���� - Runnable���� Ŭ����
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
