package day13;

//包装器类,用来包装一个数据
public class Wrapper<T> {
	private T value;
	
	public T getValue() {
		return value;
	}
	
	
public void setValue(T value) {
		this.value = value;
	}
	
	
}
