package pro02;
//�Ǽ� ���꿡���� �ڵ�����ȯ
public class OperationsPromotionExam {

	public static void main(String[] args) {
		byte byteValue1 = 10;
		byte byteValue2 = 20;
//		byte byteValue1= byteValue1 + byteValue2;  - �����Ͽ���
		int intValue1 = byteValue1 + byteValue2;  //int������ �ٲ������.
		System.out.println(intValue1); //30
		
		char charValue1 = 'A';
		char charValue2 = 1;
		int intValue2 = charValue1 + charValue2;
		System.out.println("�����ڵ�=" + intValue2); //�����ڵ�=66
		System.out.println("��¹���=" + (char)intValue2); //��¹���=B
		
		int intValue3 = 10;
		int intValue4 = intValue3 / 4;
		System.out.println(intValue4); //2  - int��(������)�̶� �ڿ� �Ҽ��� ����.
		
		int intValue5 = 10;
//      int intValue6 = 10 / 4.0;  - ������ ����		
		double doubleValue = intValue5 / 4.0;  //double���� ������ double�� �ٲ������.
		System.out.println(doubleValue); //2.5
		
		int x = 1;
		int y = 2;
		double result = (double) x / y;
		System.out.println(result); //0.5
	}

}
