package sec03.exam02;
//�ڽ� Ŭ�������� �����ǵǾ� ���� ������ �����ؾ� �Ѵ�.
public class Dog extends Animal {
	public Dog() {
		this.kind = "������";
	}
	
	@Override
	public void sound() {
		System.out.println("�۸�");
	}
}
