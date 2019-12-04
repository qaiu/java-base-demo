package day13;

public class Test1 {
	public static void main(String[] args) {
		Wrapper<String> w1 = new Wrapper<>();
		Wrapper<Integer> w2 = new Wrapper<>();
		
		w1.setValue("123");
		w2.setValue(123);
		
		String s = w1.getValue();
		Integer i = w2.getValue();
		System.out.println();
		f1(w1);
	}
	
	private static void f1(Wrapper w) {
		System.out.println(w.getValue());
		w.setValue("123");
	}
	
}
