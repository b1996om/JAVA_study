package pro02;
// +���꿡���� ���ڿ� �ڵ�����ȯ
public class StringConcatExam {

	public static void main(String[] args) {
		//���ڿ���
		int value = 10 + 2 + 8;
		System.out.println(value);
		
		//���Ῥ��
		String str1 = 10 + 2 + "8";
		System.out.println(str1);  //128 - 10+2=12�� ���ڿ��� �ڵ��ٲ㼭 12+8=128.
		
		String str2 = 10 + "2" + 8;
		System.out.println(str2);  //1028
		
		String str3 = "10 + 2 + 8";
		System.out.println(str3);  //10 + 2 + 8
		
		String str4 = "10" + (2 + 8);
		System.out.println(str4);  //1010
	}

}
