package sec02.exam02;
// stop 플래그를 이용하는 방법
// 1초 출력 후 스레드를 중지
public class StopFlagExample {
	public static void main(String[] args) {
		PrintThread1 printThread = new PrintThread1();
		printThread.start();
		
		try { Thread.sleep(1000); } catch (InterruptedException e) {}
		
		printThread.setStop(true);
		}
	}

