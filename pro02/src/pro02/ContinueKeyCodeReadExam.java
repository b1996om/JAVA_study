package pro02;

public class ContinueKeyCodeReadExam {

	public static void main(String[] args) throws Exception {
		int keyCode;
		//콘솔에 a입력하면?
		while(true) {
			keyCode = System.in.read();
			System.out.println("keyCode:" + keyCode); //keyCode:97
													  //keyCode:13
													  //keyCode:10
		}
	}

}
