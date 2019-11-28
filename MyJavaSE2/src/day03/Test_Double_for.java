package day03;

//这个类测试嵌套for循环
public class Test_Double_for {
	public static void main(String[] args) {
		//打印左直角三角形
		/*
		 *  *
		 *  **
		 *  ***
		 *  ****
		 *  *****
		 */
		//外循环控制行 制行5次c
		for (int i = 1; i <= 5; i++) {
			//列的值不固定，根据i的变化就可以
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		//打印九九表
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j+"*"+i+"="+j*i+"\t");
			}
			System.out.println();
		}
		System.out.println();
		
		//打印右直角三角形
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
		//打印等腰三角形
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
