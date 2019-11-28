package reg;

import java.util.Arrays;

/**
 * String������򷽷�: ����ƥ��, ������,�����滻
 * @author QAIU
 *
 */
public class Regex2 {
	public static void main(String[] args) {
		
//		^  ��ʾƥ���ַ����Ŀ�ʼλ��  (����  ������������[ ] ʱ,�������Ϊȡ��(������),��ʾ��ƥ�����������ַ���)
//		$  ��ʾƥ���ַ����Ľ���λ��
//		*  ��ʾƥ�� ��ε����
//		+  ��ʾƥ�� һ�ε���� (������һ��)
//		?  ��ʾƥ����λ�һ��
//		.  ��ʾƥ�䵥���ַ� 
//		|  ��ʾΪ����,������ȡһ�� &&��
//		(  ) С���ű�ʾƥ��������ȫ���ַ����ӱ��ʽ 						(��)
//		[  ] �����ű�ʾƥ��������һ���ַ� �����÷�Χ���� ��[0-9 a-z A-Z] 	(����)
//			�����Ա�ʾ֮��ķ�Χ����: [^a-z]��ʾƥ���a-z֮��������ַ�
//		{  } �����������޶�ƥ�����  									(����)
//			�� {n}��ʾƥ��n���ַ�  {n,}��ʾ����ƥ��n���ַ�  {n,m}��ʾ����n,���m 
//			����1: Ϊʲôû��{, m}
		
//		\  ת���ַ� ���ϻ�������ƥ�䶼��Ҫת���ַ�   
//			�� \*  ��ʾƥ��*��  Java����\\ת���������Ϊ������ʽҲ���ַ���Ҫ�����ַ���ת�����
//			����\\ת���һ��\����ʾ�������ת���, ������Ҫƥ��'\' ���� \\\\��ʾ
//		\w ��ʾӢ����ĸ������  \W  ����ĸ������
//		\d  ��ʾ����   \D  ������
		
		
		//+���÷� ����ƥ��һ�� ƥ��do...g
		System.out.println("dog".matches("do+g")); 		//true
		System.out.println("dooog".matches("do+g"));	//true
		System.out.println("doooooOg".matches("do+g"));//false
		
		//replaceAll(regex,s) �����滻
		
		//split
		String s = "aaa123bbb456ccc789";
		String[] s2 = s.split("\\d{3,}");
		System.out.println(Arrays.toString(s2));
		
		String[] s3 = s.split("[a-zA-Z]{3,}");
		System.out.println(Arrays.toString(s3));
		
		String regex = "([a-zA-Z][\\w]+)+@([\\w]+\\.)*([a-zA-Z])+";
		System.out.println("1:"+"abc@tedu.com.cn".matches(regex));
		System.out.println("2:"+"www.qq.cn".matches(regex));
		System.out.println("3:"+"736226400@vip.qq.com".matches(regex));
		System.out.println("4:"+"www.-abc-123@3qq.com.cn".matches(regex));
		System.out.println("5:"+"sssa#qaiu.cn".matches(regex));
		System.out.println("6:"+"abc@163.cn".matches(regex));
		regex = "([1-9][0-9]{4,9})+@(qq.com)";
		System.out.println("7:"+"736226400@qq.com".matches(regex));


	}
}
