package sec01.exam01;
//��ü ���� ����  - toString(), �������̵�
public class SmartPhone {
	private String company;
	private String os;
	
	public SmartPhone(String company, String os) {
		this.company = company;
		this.os = os;
	}
	
	@Override //toString() ������
	public String toString() {
		return company + "," + os;
	}
}
