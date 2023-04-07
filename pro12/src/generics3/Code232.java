package generics3;
//와일드 카드 인수 : '?'로 나타냄, 와일드 카드 자리에는 어떤 클래스 타입도 올 수 있다는 의미.
public class Code232 {
	public static void main(String[] args) {
		WithWhild<Integer> a = new WithWhild<Integer>(6);
		WithWhild<Double> b= new WithWhild<Double>(-6.0);
		WithWhild<Long> c = new WithWhild<Long>(5L);
		
		if(a.same(b))System.out.println("a and b are equal");
		else System.out.println("a and b are different");
		
		if(a.same(b))System.out.println("a and c are equal");
		else System.out.println("a and c are different");
	}
}
