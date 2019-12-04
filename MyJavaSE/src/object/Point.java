package object;
/**
 * 使用当前类测试Object类方法的重写
 * java所有类继承自Object，因此该类定义的
 * 方法所有类都有
 * 我们通常会重写从Object继承下来的几个方法：
 * 例如：toString和equals方法
 * 这些方法在我们使用API中常常会被他们调用
 * 因此重写这些方法有助于我们更好的使用API.
 * 
 * @author QAIU
 *
 */
public class Point {
	private int x;
	private int y;
	
	/**
	 * @param x
	 * @param y
	 */
	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	

	public int getX() {
		return x;
	}


	public void setX(int x) {
		this.x = x;
	}


	public int getY() {
		return y;
	}


	public void setY(int y) {
		this.y = y;
	}

	/**
	 * 重写toString方法，该方法经常被我们调用的API使用
	 * 例如：System.out.println()
	 * 重写该方法的原则：
	 * 返回字符串的应当包含当前对象的相关信息
	 * 具体格式没有要求，可以结合需求而定.
	 */
	@Override
	public String toString() {
		return "("+x+","+y+")";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + x;
		result = prime * result + y;
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Point other = (Point) obj;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}
	
	
	
	
	
	
	
	
	
}
