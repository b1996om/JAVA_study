package pro04;
/* while문은 조건식이 거짓이면 한번도 반복하지 않고 종료되지만, 
  do-while문은 조건식이 거짓이어도 한번은 실행한다. */
public class DoWhileSumFrom1To100Exam {

	public static void main(String[] args) {
		int sum = 0;
		int i = 1;
				
		do {
			sum += i;
			i++;
		}
		while(i<=100); //
		System.out.println("1 ~ " + (i-1) + "합 : " + sum);
	}
	

}
