package sec01.exam07;
// ���� �����尡 �����ϴ� �ڵ�
//<������ü�� ����� �� ������ ��> 
//  : ��Ƽ ������ ���α׷����� ��������� ��ü �����ؼ� �۾��ؾ� �ϴ� ��� �ǵ��ߴ� �Ͱ� �ٸ� ��� ���ü� ����
// User1�� ������ ���� ���� 100�� �����µ� �ؿ� User2�� �����ϸ� 1�� ����� �ȴ�.
// �׷��� User2�� ���� �����ϰ� ��µȴ�.
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
