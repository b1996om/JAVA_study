package sec01.exam10;
// String Ŭ����
// ���� ���� - charAt()
public class StringCharAtExample {
	public static void main(String[] args) {
		String ssn = "010624-1230123";
		char sex = ssn.charAt(7); //7��° �ε����� == 1 (�ε����� 0���� �����ϴϱ�)
		switch(sex) {
		case '1': //break���� �����ϱ� ������ ������. �ؿ��� break������ ����.
		case '3':
			System.out.println("�����Դϴ�.");
			break;
		case '2':
			System.out.println("0~4������ �־��ּ���.");
			break;
		case '4':
			System.out.println("���� �Դϴ�.");
			break;
		case '6':
			System.out.println("�ΰ��� �ƴմϴ�.");
		
		}
	}
}
