package sec03.exam01;
//abstract Ű���� ��� : �߻� �޼���
//<�߻� �޼���> : �޼ҵ��� ����θ� �ְ� ó���ΰ� ���� ��.
public abstract class Phone {
	//�ʵ�
	public String owner;
	
	//������
	public Phone(String owner) {
		this.owner = owner;
	}
	
	//�޼ҵ�
	public void turnOn() {
		System.out.println("�� ������ �մϴ�."); //�߻�޼����̱� ������ ���� �� ó���ΰ� �������.
	}
	public void turnOff() {
		System.out.println("�� ������ ���ϴ�."); //�߻�޼����̱� ������ ���� �� ó���ΰ� �������.
	}
}
