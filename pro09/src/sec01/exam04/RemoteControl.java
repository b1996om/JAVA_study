package sec01.exam04;
//<Interface> : ����� ���� ����(����̸��� �빮�ڷ� �ۼ��Ѵ�.)
//���̺귯�� �������̽�
public interface RemoteControl {
	//���
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	//�߻� �޼ҵ� : ����θ� �ְ� ó����{}�� ���� ���.
	void turnOn();
	void turnOff();
	void setVolume(int volume);
}
