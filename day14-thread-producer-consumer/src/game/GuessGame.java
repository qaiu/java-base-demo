package game;

import java.util.Scanner;

/**
 * 
 * ���������ֺͲ���ĸ������Ϸ��ͨ�ô���
 * @author QAIU
 *
 */
abstract public class GuessGame {
	//������Ϸ,ͨ�õ���Ϸ���̴���
	public void qiDong() {
		//�������ֵ,��ͬ�͵�����
		String r = suiJi();
//		System.out.println(r);
		//��ʾ��ʾ
		tiShi();
		//ѭ����
		while (true) {
			System.out.println("��:��");
			String c = new Scanner(System.in).nextLine();
			//�Ƚϲµ�ֵ,�����ֵ
			String jieGuo = biJiao(c,r);
			System.out.println(jieGuo);
			//jieGuo�Ƿ��ǲ¶ԵĽ��
			if (caiDui(jieGuo)) {
				break;
			}
		}
	}

	public abstract String suiJi();
	public abstract void tiShi();
	public abstract String biJiao(String c, String r);
	public abstract boolean caiDui(String jieGuo);
}
