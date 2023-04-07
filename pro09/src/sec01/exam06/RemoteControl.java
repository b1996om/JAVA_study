package sec01.exam06;
//인터페이스 
public interface RemoteControl {
	//상수
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	//추상 메소드 : 선언부만 있고 처리부{}가 없는 모습.
	void turnOn();
	void turnOff();
	void setVolume(int volume);
}
