package sec01.exam04;
//���� Ŭ�������� ��� ���� : �޼ҵ��� �Ű� ������ ���� ������ ���� Ŭ�������� ����� ���� ����
public class Outter {
	//�ڹ� 7 ����
	public void method1(final int arg) {
		final int localVariable = 1;
		//arg = 100;
		//localVariable = 100;
		class Inner {
			public void method() {
				int result = arg + localVariable;
			}
		}
	}
	
	//�ڹ� 8 ���� : 8���ĺ��ʹ� final �������� �ʾƵ� final Ư���� �ο�������.
	public void method2(int arg) {
		int localVariable = 1;
		//arg = 100;
		//localVariable = 100;
		class Inner {
			public void method() {
				int result = arg + localVariable;
			}
		}
	}
}
