package sec01.exam17;
// String Ŭ����
// ���ڿ� ��ġ - replace() : ù ��° �Ű����� ���ڿ��� ã�� �� ��° �Ű����� ���ڿ��� ��ġ�� ���ο� ���ڿ� ���� �� ����
public class StringReplaceExample {
	public static void main(String[] args) {
		String oldStr = "�ڹٴ� ��ü ���� ����Դϴ�. �ڹٴ� ǳ���� API�� �����մϴ�.";
	    String newStr = oldStr.replace("�ڹ�", "JAVA");
	    System.out.println(oldStr);  //�ڹٴ� ��ü ���� ����Դϴ�. �ڹٴ� ǳ���� API�� �����մϴ�.
	    System.out.println(newStr);  //JAVA�� ��ü ���� ����Դϴ�. JAVA�� ǳ���� API�� �����մϴ�.
	
	
	}

}
