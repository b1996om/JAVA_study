package pro04;
/* while���� ���ǽ��� �����̸� �ѹ��� �ݺ����� �ʰ� ���������, 
  do-while���� ���ǽ��� �����̾ �ѹ��� �����Ѵ�. */
public class DoWhileSumFrom1To100Exam {

	public static void main(String[] args) {
		int sum = 0;
		int i = 1;
				
		do {
			sum += i;
			i++;
		}
		while(i<=100); //
		System.out.println("1 ~ " + (i-1) + "�� : " + sum);
	}
	

}