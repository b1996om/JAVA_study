package pro04;
// Break Outter (���ذ��ʿ�....)
public class BreakOutterExample {

	public static void main(String[] args) {
		Outter: for(char upper='A'; upper<='Z'; upper++) {
			for(char lower = 'a'; lower<='Z'; lower++) {
				System.out.println(upper + "-" +lower);
				if(lower == 'g') {
					break Outter;
				}
			}
		}
		System.out.println("���α׷� ����");
	}

}
