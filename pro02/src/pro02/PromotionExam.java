package pro02;
//�ڵ�����ȯ(promotion) : ���� ��� ������ ���� Ÿ���� ū Ÿ������ ����� ���
public class PromotionExam {

	public static void main(String[] args) {
		//�ڵ� Ÿ�� ��ȯ
		byte byteValue = 10;
		int intValue = byteValue;
		System.out.println("intValue:" + intValue); //intValue:10
		
		char charValue = '��';
		intValue = charValue;
		System.out.println("���� �����ڵ�:" + intValue); //���� �����ڵ�:44032
		
		intValue =50;
		long longValue = intValue;
		System.out.println("longValue:" + longValue); //longValue:50
		
		longValue = 100;
		float floatValue = longValue;
		System.out.println("floatValue:" + floatValue); //floatValue:100.0
		
		floatValue = 100.5F;
		double doubleValue = floatValue;
		System.out.println("doubleValue:" + doubleValue); //doubleValue:100.5
	}
}
