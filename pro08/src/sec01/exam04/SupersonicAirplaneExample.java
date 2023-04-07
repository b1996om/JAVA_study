package sec01.exam04;
//오버라이딩
//활용클래스
public class SupersonicAirplaneExample {

	public static void main(String[] args) {
		
		SupersonicAirplane sa = new SupersonicAirplane();
		sa.takeOff(); //이륙합니다.
		sa.fly(); //일반비행합니다.
		sa.flyMode = SupersonicAirplane.SUPERSONIC;
		sa.fly(); //초음속비행합니다.
		sa.flyMode = SupersonicAirplane.NOMAL;
		sa.fly(); //일반비행합니다.
		sa.land(); //착륙합니다.

	}

}
