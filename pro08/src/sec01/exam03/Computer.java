package sec01.exam03;
//�������̵�(�޼ҵ� ������)
//���̺귯�� ��� Ŭ����.
public class Computer extends Calculator {
	@Override
	double areaCircle(double r) {
		System.out.println("Computer ��ü�� areaCircle() ����");
		return Math.PI * r * r;
	}

}
