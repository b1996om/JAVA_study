package sec01.exam18;
// String Ŭ����
// ���ڿ� �߶󳻱� - substring() :�־��� �ε������� ���ڿ��� ����
public class StringSubstringExample {
	public static void main(String[] args) {
		String ssn = "880815-1234567";
	
		String firstNum = ssn.substring(0, 6); //�ε��� 0���� 6������(5).
		System.out.println(firstNum);  //880815
		
		String secondNum = ssn.substring(7); //�ε��� 7���� ������.
		System.out.println(secondNum);  //1234567
	}

}
