package sec01.exam01;
// Ŭ���� ��� (extends Cellphone == Cellphone Ŭ������ ��ӹްڴ�.)
// ���̺귯�� ��� Ŭ����
public class DmbCellphone extends Cellphone {
	//�ʵ�
	int channel;
	
	//������
	DmbCellphone(String model, String color, int channel) {
		this.model = model;
		this.color = color;
		this.channel = channel;
	}
	
	//�޼ҵ�
	void turnOnDmb() {
		System.out.println("ä�� " + channel + "�� DMB ��� ������ �����մϴ�.");
	}
	void changeChannelDmb(int channel) {
		System.out.println("ä�� " + channel + "������ �ٲߴϴ�.");
	}
	void turnOffDmb() {
		System.out.println("DMB ��� ������ ����ϴ�.");
	}
}
