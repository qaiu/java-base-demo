package day03;

import java.util.Scanner;

public class Test2_if {
	public static void main(String[] args) {
		//1. ���ܼ�������ԭ��
		double price = new Scanner(System.in).nextDouble();
		double result = price;//���������¼�ۺ��
		
		//2.�ж�,ԭ�۴���
		if (price >= 5000) {
			result = price * 0.5;//������
		}else if (price >= 2000) {
			result = price * 0.8;//�����
		}else if (price > 1000) {
			result = price * 0.9;//�����
		}
		
		System.out.println("�ۺ����:"+result);
		
	}
}
