package sec01.exam06;
//��ø �������̽� : Ŭ���� ����� ����� �������̽�
public class Button {
	OnClickListener listener;  //�������̽� Ÿ�� �ʵ�
	
	void setOnClickListener(OnClickListener listener) {
		this.listener = listener;
	} //�Ű������� ������
	
	void touch() {
		listener.onClick(); //���� ��ü�� onClick()�޼ҵ� ȣ��
	}
	
	//��ø interface�� staticó�� ������Ѵ�.
	static interface OnClickListener {
		void onClick();
	} //��ø �������̽�
}
