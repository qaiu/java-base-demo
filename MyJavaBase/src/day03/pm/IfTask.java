package day03.pm;

public class IfTask {   
	private String name;   // ����  
	private int state;     // �˺�״̬  
	private String idCard; // ���֤��   
	public void Account() {   
		name = "��ǿ";   
		state = 0;   
         idCard = "109...";
		System.out.println("ִ�й��췽����");}   
	public void show() {   
		System.out.println
		("�����˺ŵ�������" + name + "��״̬��" 
			+ state + "�����֤����" + idCard + "��"); }   
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
		}short x = 3;int i = 'A'+'��';
		double h=.99d;
		//byte a=null;
		System.out.print(a);} 
}