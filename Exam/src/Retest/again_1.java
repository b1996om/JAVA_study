package Retest;

public class again_1 {

	public static void main(String[] args) {
		
		for(int i = 1; i<=10; i++) {
			if(i%2 == 0) {  //¦��
				System.out.printf("%5d", i);  //printf : ������ �ִ� ���
			}
		}
		System.out.println();
		for(int j = 1; j<=10; j++) {  
			if(j%2 == 1) {  //Ȧ��
				System.out.printf("%5d", j);
			}
		}
	}

}
