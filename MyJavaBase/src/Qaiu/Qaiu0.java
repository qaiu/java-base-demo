package Qaiu;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

//����Ϊһ������С����
public class Qaiu0 {
	public static void main(String[] args) {
		JFrame newFrame = new JFrame("funBox");
		newFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // ����JFrame�ر�ʱ�Ĳ��������裩����Ч���ⲻ�ܹرպ�̨��ǰ������̵�����
		newFrame.setSize(400, 400); // ����JFrame���������
		newFrame.setLocation(200, 200);
		newFrame.setVisible(true);
		newThread n1 = new newThread(); // �̵߳����У�����Ҫ���ֵ�ͼ����ӽ�JFrame��
		newFrame.add(n1);
		Thread t1 = new Thread(n1);
		t1.start();

	}
}

class newThread extends JPanel implements Runnable // Java����ֻ�ܼ̳�һ���࣬���ǿ���ʵ�ֶ���ӿڣ��˴�newThread Ϊ�Զ����½�����
{
	Graphics g; // �˴�����Graphics���� g;
	private static final long serialVersionUID = 1L;

	public void run() // ����run()������д
	{
		g = getGraphics(); // Graphics���� g�Ļ�ȡ
		for (int i = 0; i < 100;) {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
// TODO Auto-generated catch block
				e.printStackTrace();
			}
			this.update(g); // update()�����ĵ��ã�ˢ��ͼ��ʹ��ͼ�񲻻��ص�����
			g.setColor(Color.green); // ���ƣ�0��0����ʼ�ƶ���20*20��ɫС��
			g.fillRect(i, i, 20, 20);
			i += 20;
		}
	}
}