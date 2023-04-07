package sec01.exam02;
//부모 생성자 호출.
//라이브러리 상속 클래스.
public class Student extends People{
	public int studentNo;
	
	public Student(String name, String ssn, int studentNo) {
		super(name, ssn);
		this.studentNo = studentNo;
	}
}
