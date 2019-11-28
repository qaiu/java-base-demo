package day13;

public class Test4 {
	public static void main(String[] args) {
		Wrapper<String> w1 = f1("123"); 
		Wrapper<Double> w2 = f1(12.3);
		
		String s = w1.getValue();
		Double a = w2.getValue();
		System.out.println(s);
		System.out.println(a);
	}
	private static <E> Wrapper<E> f1(E e) {
		Wrapper<E> w = new Wrapper<>();
		w.setValue(e);
		return w;
	}
}
