package sec01.exam06;
//버튼 이벤트 처리 구문.
public class ButtonExample {
	public static void main(String[] args) {
		Button btn = new Button();
		
		btn.setOnClickListener(new CallListener());
		btn.touch();  //전화를 겁니다.
		
		btn.setOnClickListener(new MessageListener());
		btn.touch();  //메세지를 보냅니다.
	}

}
