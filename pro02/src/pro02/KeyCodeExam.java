package pro02;
//키코드에서 입력된 내용을 변수에 저장하기
public class KeyCodeExam {

	public static void main(String[] args) throws Exception {
		int keyCode;
		
		//콘솔에 a입력해보면?
		keyCode = System.in.read();
		System.out.println("keyCode:" + keyCode); //97
		
		keyCode = System.in.read();
		System.out.println("keyCode:" + keyCode); //13
		
		keyCode = System.in.read();
		System.out.println("keyCode:" + keyCode); //10
	}

}
