package sec01.exam06;
//getName() :  스레드 이름 얻기
public class ThreadB extends Thread {
	public void run() {
		for(int i=0; i<2; i++) {
			System.out.println(getName() + "가 출력한 내용");
		}
	}
}
