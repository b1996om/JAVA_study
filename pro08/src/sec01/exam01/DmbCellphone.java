package sec01.exam01;
// 클래스 상속 (extends Cellphone == Cellphone 클래스를 상속받겠다.)
// 라이브러리 상속 클래스
public class DmbCellphone extends Cellphone {
	//필드
	int channel;
	
	//생성자
	DmbCellphone(String model, String color, int channel) {
		this.model = model;
		this.color = color;
		this.channel = channel;
	}
	
	//메소드
	void turnOnDmb() {
		System.out.println("채널 " + channel + "번 DMB 방송 수신을 시작합니다.");
	}
	void changeChannelDmb(int channel) {
		System.out.println("채널 " + channel + "번으로 바꿉니다.");
	}
	void turnOffDmb() {
		System.out.println("DMB 방송 수신을 멈춥니다.");
	}
}
