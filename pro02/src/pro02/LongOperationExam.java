package pro02;

public class LongOperationExam {

	public static void main(String[] args) {
		
		byte value1 = 10;
		int value2 = 100;
		long value3 = 1000L;
		long result = value1 + value2 + value3; 
        // �� ������ �� �ϳ��� long Ÿ���̸� �ٸ� �ǿ����ڴ� long Ÿ������ �ڵ� ��ȯ!
		System.out.println(result);  //1110
	}

}
