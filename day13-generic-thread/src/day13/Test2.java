package day13;

public class Test2 {
	public static void main(String[] args) {
		Wrapper<String> w1 = new Wrapper<String>();
		Wrapper<Integer> w2 = new Wrapper<Integer>();
		
		w1.setValue("123");
		w2.setValue(123);
		
		String s = w1.getValue();
		Integer i = w2.getValue();
		System.out.println();
		f1(w1);
		f1(w2);
	}
	
	private static void f1(Wrapper<?> w) {
		System.out.println(w.getValue());
	}
}
