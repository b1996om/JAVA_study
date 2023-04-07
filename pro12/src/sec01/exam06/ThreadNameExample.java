package sec01.exam06;
//메인 스레드는 ‘main’ 이름 가지며, 우리가 직접 생성한 스레드는 자동적으로 ‘Thread-n’ 이름 설정됨
public class ThreadNameExample {
	public static void main(String[] args) {
		Thread mainThread = Thread.currentThread();
		System.out.println("프로그램 시작 스레드 이름: " + mainThread.getName());
	
		
		ThreadA threadA = new ThreadA();
		System.out.println("작업 스레드 이름: " + threadA.getName());
		threadA.start();
		
		ThreadB threadB = new ThreadB();
		System.out.println("작업 스레드 이름: " + threadB.getName());
		threadB.start();
	}

}
