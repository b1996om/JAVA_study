package sec01.exam06;
//중첩 인터페이스 : 클래스 멤버로 선언된 인터페이스
public class Button {
	OnClickListener listener;  //인터페이스 타입 필드
	
	void setOnClickListener(OnClickListener listener) {
		this.listener = listener;
	} //매개변수의 다형성
	
	void touch() {
		listener.onClick(); //구현 객체의 onClick()메소드 호출
	}
	
	//중첩 interface는 static처리 해줘야한다.
	static interface OnClickListener {
		void onClick();
	} //중첩 인터페이스
}
