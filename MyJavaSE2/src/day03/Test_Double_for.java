package day03;

//��������Ƕ��forѭ��
public class Test_Double_for {
	public static void main(String[] args) {
		//��ӡ��ֱ��������
		/*
		 *  *
		 *  **
		 *  ***
		 *  ****
		 *  *****
		 */
		//��ѭ�������� ����5��c
		for (int i = 1; i <= 5; i++) {
			//�е�ֵ���̶�������i�ı仯�Ϳ���
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		//��ӡ�žű�
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j+"*"+i+"="+j*i+"\t");
			}
			System.out.println();
		}
		System.out.println();
		
		//��ӡ��ֱ��������
		/*
		 *       *
		 *      **
		 *     ***
		 *    ****
		 *   *****
		 */
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (j < 4 - i) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
		System.out.println();
		//��ӡ����������
		/* 
		 *       *
		 *      ***
		 *     *****
		 *    *******
		 *   *********
		 */
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5+i; j++) {
				if (j < 4 - i) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}
