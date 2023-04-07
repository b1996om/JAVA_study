package sec02.exam02;
// stop 플래그를 이용하는 방법
// 무한 반복해서 출력하는 스레드
public class PrintThread1 extends Thread {
	private boolean stop;
	
	public void setStop(boolean stop) {
		this.stop = stop;
	}
	
	public void run() {
		while(!stop) {
			System.out.println("실행 중");
		}
		System.out.println("자원 정리");
		System.out.println("실행 종료");
	}
}
