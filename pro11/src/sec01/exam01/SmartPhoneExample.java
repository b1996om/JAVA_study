package sec01.exam01;

public class SmartPhoneExample {
	public static void main(String[] args) {
		SmartPhone myPhone = new SmartPhone("����", "�ȵ���̵�");
		
		String strObj = myPhone.toString();  //������ �� toString() ȣ��
		System.out.println(strObj);
		
		System.out.println(myPhone);  // ������ �� toString()�� ȣ���ϰ� ���ϰ��� �޾� ���
	}

}
