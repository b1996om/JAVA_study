package generics3;
//���ϵ� ī�� �μ� : '?'�� ��Ÿ��, ���ϵ� ī�� �ڸ����� � Ŭ���� Ÿ�Ե� �� �� �ִٴ� �ǹ�.
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
