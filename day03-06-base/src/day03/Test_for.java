package day03;

//�������������ѭ���ṹ
public class Test_for {

	public static void main(String[] args) {
		for (int i = 0; i < 5; ++i) {
			System.out.println(i+"ͬѧ��");
		}
		
		System.out.println();
		//��ӡ0��10
		// int i = 0; ��ʱi��¼����ÿ�λ�ȡ����ֵ,Ĭ��ֵ��0��ʼ
		// i<11 �ж�i��ȡ����ֵ�����ڷ�Χ��,������˳�ѭ��
		// i++ ���ڻ�ȡ����ֵʱ012345678910��һ�������Ĺ���
		for (int i = 0; i <= 10; i++) {
			System.out.println(i);
		}
		System.out.println();
		
		// i = 8;
		// i = i*10+8
		for (int i = 8; i <= 8888;i = i*10 + 8) {
			System.out.print(i+",");
		}
	}

}
