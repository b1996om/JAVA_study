package sec01.exam10;
// String Ŭ���� 
// ����Ʈ �迭�� ���ڿ��� ��ȯ�غ��� ����1
public class ByteToStringExample {
	public static void main(String[] args) {
		byte[] bytes = { 72, 101, 108, 108, 111, 32, 74, 97, 118, 97 };
		
		String str1 = new String(bytes);
		System.out.println(str1);  //Hello Java
		
		String str2 = new String(bytes, 6, 4);
		System.out.println(str2);  //Java
	}

}
