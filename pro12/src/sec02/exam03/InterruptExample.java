package sec02.exam03;
// interrupt() �޼ҵ� �̿��ϴ� ���
// 1�� �� �����带 ����
public class InterruptExample {
	public static void main(String[] args) {
		Thread thread = new Thread();
		thread.start();
		
		try { Thread.sleep(1000); } catch(InterruptedException e ) {}
		
		thread.interrupt();
	}

}
