package day03.am;

public class task01 {

	public static void main(String[] args) throws InterruptedException {
		int day = 60;
		int week=day/7;
		int left = day%7;
		System.out.println(day+"���ڰ���"+week+"��ʣ��"+left+"��");
		int a=0;
		a=a++;
		Thread.sleep(1000);
		System.out.println(a);
	}

}
