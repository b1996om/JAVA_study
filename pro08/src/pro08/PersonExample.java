package pro08;
//final �ʵ�� ���
public class PersonExample {
	public static void main(String[] args) {
		Person p1 = new Person("123456-123456", "ȫ�浿");
		
		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);
		
		//p1.nation = "USA";
		//p1.ssn = "987563-98564";
		p1.name = "ȫ���";
	}

}
