package sec03.exam02;
//�ڽ� Ŭ�������� �����ǵǾ� ���� ������ �����ؾ� �Ѵ�.
public class Cat extends Animal {
	public Cat() {
		this.kind = "������";
	}
	
	@Override
	public void sound() {
		System.out.println("�߿�");
	}
}
