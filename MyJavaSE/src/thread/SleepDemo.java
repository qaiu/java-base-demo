package thread;

import java.util.Scanner;

/**
 * Sleep����
 * 
 * �߳��ṩ��һ����̬����
 * static void sleep(long ms)
 * �÷�����������������������̴߳�������״̬
 * ָ������,�������ʱ���̻߳��Զ��ص�RUNNABLE״̬
 * �ȴ��ٴη���ʱ��Ƭ��������.
 * 
 * @author QAIU
 *
 */
public class SleepDemo {
	public static void main(String[] args) {
		/*
		 * �ڿ���̨����һ������,Ȼ��Ӹ�����
		 * ��ʼÿ��ݼ�,��0��ʱ�����ʱ�䵽
		 */
		Scanner scanner = new Scanner(System.in);
		System.out.println("������һ����");
		int num = scanner.nextInt();
		for(int i = num; i > 0; i--) {
			try {
				System.out.println(i);
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			}
		}
		
		System.out.println("ʱ�䵽");
	}
}
