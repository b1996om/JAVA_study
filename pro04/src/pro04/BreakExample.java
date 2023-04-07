package pro04;

public class BreakExample {

	public static void main(String[] args) {
		while(true) {
			int num = (int)(Math.random()*6) + 1;
			System.out.println(num);
			if(num == 6) { 
				break;
				//랜덤숫자가 막 돌아가다가 6이 나오면 break로 종료하고 반복문 빠져나감.
			}
		}
		System.out.println("프로그램 종료");
	}

}
