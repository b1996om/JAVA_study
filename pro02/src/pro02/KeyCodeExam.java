package pro02;
//Ű�ڵ忡�� �Էµ� ������ ������ �����ϱ�
public class KeyCodeExam {

	public static void main(String[] args) throws Exception {
		int keyCode;
		
		//�ֿܼ� a�Է��غ���?
		keyCode = System.in.read();
		System.out.println("keyCode:" + keyCode); //97
		
		keyCode = System.in.read();
		System.out.println("keyCode:" + keyCode); //13
		
		keyCode = System.in.read();
		System.out.println("keyCode:" + keyCode); //10
	}

}
