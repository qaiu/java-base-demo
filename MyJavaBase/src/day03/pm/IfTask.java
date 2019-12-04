package day03.pm;

public class IfTask {   
	private String name;   // 名字  
	private int state;     // 账号状态  
	private String idCard; // 身份证号   
	public void Account() {   
		name = "李强";   
		state = 0;   
         idCard = "109...";
		System.out.println("执行构造方法。");}   
	public void show() {   
		System.out.println
		("账务账号的名字是" + name + "，状态是" 
			+ state + "，身份证号是" + idCard + "。"); }   
	public static void main(String[] args) {   
		IfTask acc = new IfTask();     
		acc.show();int a = 0;
		while (a < 5) {
			switch (a) {
			 case 0:
			 case 3:
				a = a + 1;
			 case 1:
			 case 2:
				a = a + 2;
			 default:
				a = a + 3;
			}
		}short x = 3;int i = 'A'+'中';
		double h=.99d;
		//byte a=null;
		System.out.print(a);} 
}