package pro08;
// 싱글톤(Singleton) : 값 변경이 되면 안되는 것들을 위해서 사용한다.
public class Singleton {
	private static Singleton singleton = new Singleton();
	
	private Singleton() {}
	
	static Singleton getInstance()
 {
		return singleton;}
 }
