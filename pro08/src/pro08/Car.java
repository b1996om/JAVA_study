package pro08;
//��������� static.
public class Car {
	int speed;
	
	void run() {
		System.out.println(speed + "���� �޸��ϴ�."); //60���� �޸��ϴ�.
	}

	
	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.speed=60;
		myCar.run();
	}
}
