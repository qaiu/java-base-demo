package day06;

public class ArrayTest02 {

	public static void main(String[] args) {
		double[] prices=new double[5];
		prices[0]=25.7;
		prices[1]=12.4;
		prices[2]=8.0;
		prices[3]=3.6;
		prices[4]=6.8;
		
		int sum=0;
		
		for (double d : prices) {
			System.out.printf("%f\n",d);
			sum+=d;
		}
		System.out.println("价格之和:"+sum);
		int arr[]= {1,11,1,11,11,1,33,1,1,1};
		
	}
}
