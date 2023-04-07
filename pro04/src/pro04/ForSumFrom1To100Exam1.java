package pro04;
// for문 밖에서 i를 초기화 한 이유는?for문 밖에서도 i를 사용하기 위해서!
public class ForSumFrom1To100Exam1 {

	public static void main(String[] args) {
		int sum = 0;
		
		int i = 0;
		for(i=1; i<=100; i++) {
			sum += i;
		}
		System.out.println("1~" + (i-1) + "합:" + sum);
	}

}
