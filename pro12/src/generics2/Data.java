package generics2;

class Data<T extends Number> {
	T obj;
	Data(T ob) {
		obj = ob;
	}
	int calcMultiple(int n) {
		return obj.intValue() * n;
	}
}
