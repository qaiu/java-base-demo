package exercise;

public class Exercise2 {
	public static void main(String[] args) {
		double thick=.08;
		thick/=1000;
		int i=0;
		while (thick<8848.13) {
			thick*=2;
			i++;
		}
		System.out.println(i);
	}
}
