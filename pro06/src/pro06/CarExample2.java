package pro06;
//������ �����ε� : �Ű� ������ �޸��ϴ� ������ ���� �� ����
public class CarExample2 {
	public static void main(String[] args) {
		Car2 car1 = new Car2();
		System.out.println(car1.company);
		System.out.println();
		
		Car2 car2 = new Car2("�ڰ���");
		System.out.println(car2.company);
		System.out.println(car2.model);
		System.out.println();
		
		Car2 car3 = new Car2("�ڰ���", "����");
		System.out.println(car3.company);
		System.out.println(car3.model);
		System.out.println(car3.color);
		System.out.println();
		
		Car2 car4 = new Car2("�ý�", "����", 200);
		System.out.println(car4.company);
		System.out.println(car4.model);
		System.out.println(car4.color);
		System.out.println(car4.maxSpeed);
	}
}