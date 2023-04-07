package generics3;
//와일드 카드 인수 : '?'로 나타냄, 와일드 카드 자리에는 어떤 클래스 타입도 올 수 있다는 의미.
class WithWhild<T extends Number> {
	T data;
	WithWhild(T d) {data = d;}
	boolean same(WithWhild<?> x) {
		if(Math.abs(data.doubleValue()) == Math.abs(x.data.doubleValue()))
			return true;
		return false;
	}
}
