package sec01.exam21;
// String Ŭ����
// ���ڿ�(String) ��ȯ - valueOf()
public class StringValueOfExample {
	public static void main(String[] args) {
		String str1 = String.valueOf(10);
		String str2 = String.valueOf(10.5);
		String str3 = String.valueOf(true);
		
		System.out.println(str1);  //10 - ���� �ƴ�, ���ڿ���
		System.out.println(str2);  //10.5 (���ڿ�)
		System.out.println(str3);  //true (���ڿ�)
	}

}
