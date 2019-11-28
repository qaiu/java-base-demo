package day13;

public class Test3 {
	public static void main(String[] args) {
		Wrapper<String> w1 = new Wrapper<String>();
		Wrapper<Integer> w2 = new Wrapper<Integer>();
		Wrapper<Double> w3 = new Wrapper<Double>();
		Wrapper<Number> w4 = new Wrapper<>();
		
		w1.setValue("222");
		w2.setValue(2);
		w3.setValue(2.22);
		w2.setValue(123);
		f1(w2);
		f2(w4, 12.3);
	}
	
	/**
	 * <? extends Number> - 某种特定类型,且是Number的子类
	 * @param w
	 */
	private static void f1(Wrapper<? extends Number> w) {
		System.out.println(w.getValue());
//		w.setValue(123);
//		w.setValue(null);//不能放数据只能放null值
		
	}
	/**
	 * <? super Number> - 某种特定类型, 且是number的超类
	 * @param w
	 */
	private static void f2(Wrapper<? super Number> w,Number n) {
		w.setValue(n);
		System.out.println(w.getValue());
	}
}
