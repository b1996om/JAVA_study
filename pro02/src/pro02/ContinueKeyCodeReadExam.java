package pro02;

public class ContinueKeyCodeReadExam {

	public static void main(String[] args) throws Exception {
		int keyCode;
		//�ֿܼ� a�Է��ϸ�?
		while(true) {
			keyCode = System.in.read();
			System.out.println("keyCode:" + keyCode); //keyCode:97
													  //keyCode:13
													  //keyCode:10
		}
	}

}
