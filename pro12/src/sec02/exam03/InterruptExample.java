package sec02.exam03;
// interrupt() 메소드 이용하는 방법
// 1초 후 스레드를 중지
public class InterruptExample {
	public static void main(String[] args) {
		Thread thread = new Thread();
		thread.start();
		
		try { Thread.sleep(1000); } catch(InterruptedException e ) {}
		
		thread.interrupt();
	}

}
