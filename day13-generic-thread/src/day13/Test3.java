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
	 * <? extends Number> - ĳ���ض�����,����Number������
	 * @param w
	 */
	private static void f1(Wrapper<? extends Number> w) {
		System.out.println(w.getValue());
//		w.setValue(123);
//		w.setValue(null);//���ܷ�����ֻ�ܷ�nullֵ
		
	}
	/**
	 * <? super Number> - ĳ���ض�����, ����number�ĳ���
	 * @param w
	 */
	private static void f2(Wrapper<? super Number> w,Number n) {
		w.setValue(n);
		System.out.println(w.getValue());
	}
}
