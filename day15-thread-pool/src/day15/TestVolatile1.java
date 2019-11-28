package day15;

 

public class TestVolatile1 {

    /*
     * volatile ��֤���ݵĿɼ���
     *
     * volatile �漰һЩ�ײ�cpuָ��
     * ������һ��cpu����,��������cpu�����ݱ仯,
     * ��������cpu�޸�������,��Ѹ��ٻ������ݱ�ǳɷ���,
     * �����´��ڴ渴��������
     */
	public static  volatile  boolean flag = false;//����ı���
 
    public static void main(String[] args) throws InterruptedException {
        T1 t1 = new T1();
        T2 t2 = new T2();
 
        new Thread(t1, "T1").start();
        Thread.sleep(1000);//Ϊ�˱�֤t1��t2��������sleepһ��
        new Thread(t2, "T2").start();
    }
 
    static class T1 extends Thread {
        public void run() {
            while (true) {
                if (flag) {
                    System.out.println(Thread.currentThread().getName() + " - flag : " + flag);
                    break;
                }
            }
        }
    }
 
    static class T2 extends Thread {
        public void run() {
        	flag = true;
            System.out.println(Thread.currentThread().getName() + " - flag : " + flag);
        }
    }
}