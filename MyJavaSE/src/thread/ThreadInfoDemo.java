package thread;
/**
 * ��ȡ�̵߳������Ϣ
 * @author QAIU
 *
 */
public class ThreadInfoDemo {
	public static void main(String[] args) {
		Thread main = Thread.currentThread();
		
		//��ȡ�߳�����
		String name = main.getName();
		System.out.println(name);
		//��ȡΨһ��ʶ
		long id = main.getId();
		System.out.println(id);
		//��ȡ���ȼ�
		int pri = main.getPriority();
		System.out.println(pri);
		
		//�߳��Ƿ����
		System.out.println("�߳��Ƿ����"+main.isAlive());
		//�߳��Ƿ�Ϊ�ػ��߳�
		System.out.println("�߳��Ƿ����ػ��߳�"+main.isDaemon());
		//�߳��Ƿ��ж�
		System.out.println("�Ƿ��ж�"+main.isInterrupted());
		
	}
}
