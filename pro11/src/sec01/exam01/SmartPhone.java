package sec01.exam01;
//객체 문자 정보  - toString(), 오버라이딩
public class SmartPhone {
	private String company;
	private String os;
	
	public SmartPhone(String company, String os) {
		this.company = company;
		this.os = os;
	}
	
	@Override //toString() 재정의
	public String toString() {
		return company + "," + os;
	}
}
