package day03.question;

public class Question71 {
	public static void main(String[] args) {
		int[] nums={8,7,3,9,5,4,1};
		
		int max=nums[0];
		int sub=0;
		for (int i = 1; i < nums.length; i++) {
			if (max<nums[i]) {
				max=nums[i];
				sub=i;
			}
		}
		System.out.println("���ֵ"+max+"�����ֵ���ڵ��±�"+sub);
		
	}
}