package sec01.exam04;
//�������̵�
//Ȱ��Ŭ����
public class SupersonicAirplaneExample {

	public static void main(String[] args) {
		
		SupersonicAirplane sa = new SupersonicAirplane();
		sa.takeOff(); //�̷��մϴ�.
		sa.fly(); //�Ϲݺ����մϴ�.
		sa.flyMode = SupersonicAirplane.SUPERSONIC;
		sa.fly(); //�����Ӻ����մϴ�.
		sa.flyMode = SupersonicAirplane.NOMAL;
		sa.fly(); //�Ϲݺ����մϴ�.
		sa.land(); //�����մϴ�.

	}

}
