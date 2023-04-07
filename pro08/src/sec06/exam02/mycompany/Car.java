package sec06.exam02.mycompany;
//import 문 : 사용하고자 하는 클래스 또는 인터페이스가 다른 패키지에 소속된 경우.
//         : 패키지 선언과 클래스 선언 사이에 작성
import sec06.exam02.hankook.*;
import sec06.exam02.kumho.*;
import sec06.exam02.hyndai.Engine;

public class Car {
	//필드
	Engine engine = new Engine();
	SnowTire tire1 = new SnowTire();
	BigWidthTire tire2 = new BigWidthTire();
	sec06.exam02.hankook.Tire tire3 = new sec06.exam02.hankook.Tire();
	sec06.exam02.kumho.Tire tire4 = new sec06.exam02.kumho.Tire();
	
}