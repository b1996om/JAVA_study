package pro07_3;
//52p
public class Calculator {
		//필드
		//생성자
		//메소드
		int plus(int x, int y) {
			int result = x + y;
			return result;
		}
		
		double avg(int x, int y) {
			double sum = plus(x,y);
			double result = sum / 2;
			return result;
	}
		
		void execute() {
			double result = avg(7,10);
			System.out.println("실행결과: " + result);  //실행결과: 8.5
		}
		
		void println(String message) {
			System.out.println(message);
		}

}
