package sec01.exam07;
// 메인 스레드가 실행하는 코드
//<공유객체를 사용할 때 주의할 점> 
//  : 멀티 스레드 프로그램에서 스레드들이 객체 공유해서 작업해야 하는 경우 의도했던 것과 다른 결과 나올수 있음
// User1만 실행할 때는 값이 100이 나오는데 밑에 User2를 실행하면 1을 덮어쓰게 된다.
// 그래서 User2의 값이 동일하게 출력된다.
public class MainThreadExample {
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		
		User1 user1 = new User1();
		user1.setCalculator(calculator);
		user1.start();  //User1:50
		
		User2 user2 = new User2();
		user2.setCalculator(calculator);
		user2.start();  //User2:50
	}

}
