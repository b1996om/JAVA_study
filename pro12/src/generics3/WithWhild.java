package generics3;
//���ϵ� ī�� �μ� : '?'�� ��Ÿ��, ���ϵ� ī�� �ڸ����� � Ŭ���� Ÿ�Ե� �� �� �ִٴ� �ǹ�.
class WithWhild<T extends Number> {
	T data;
	WithWhild(T d) {data = d;}
	boolean same(WithWhild<?> x) {
		if(Math.abs(data.doubleValue()) == Math.abs(x.data.doubleValue()))
			return true;
		return false;
	}
}
