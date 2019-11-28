package scoket1;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Myserver extends Thread{
	public static void main(String[] args) {
		server();
	}
	
	
	private Socket s;
	public Myserver(Socket s) {
		this.s = s;
	}
	
	
	@Override
	public void run() {
		try {
			// ���������׽��ֻ�ȡ�������������
			OutputStream os = s.getOutputStream();
			InputStream is = s.getInputStream();
			// �����������ͻ��˷�������
			// getBytes���ַ���ת�����ֽ�����
			os.write("Hello,welcome you,client!".getBytes());
			// �����������������϶�ȡ����
			// �����ֽ�����
			byte[] buf = new byte[100];
			// �����ݶ�ȡ��buf�ֽ����鵱�У����᷵��ʵ�ʶ�ȡ���ֽ���
			int len = is.read(buf);
			// �����Ƕ�ȡ�����ݴ�ӡ����
			System.out.println(new String(buf, 0, len));
			// ���ͨ��֮�����ǿ��Խ�����������������׽��֡��������˵��׽��ֶ��ر�
			os.close();
			is.close();
			s.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	
	
	/**
	 * �������˳���ı�д
	 */
	public static void server() {
		try {
			// �������������׽��֣��󶨵�6000�Ķ˿���
			ServerSocket ss = new ServerSocket(6000);
			
			//��ǰΪһ���ͻ�����ҪΪ����ͻ�ͬʱ�����whileѭ�������ͻ�������
			while (true) {
				// ����accept�����ͻ�������ֱ���ͻ�����������������ʱ��
				// ���᷵��һ���׽��֣�Ȼ��Ϳ�����������׽�����ͻ��˽�������ͨ�š�
				Socket s = ss.accept();
				//һ����һ�������������������������󣬷����׽��֡�
				//Ȼ�󴴽�����һ���µ��߳�,���׽��ִ��ݸ��߳�,Ϊ�ͻ��˽��з���  
				//Runִ����ϣ���ǰ�߳�Ҳ����ֹ��
				new Myserver(s).start(); 
			}
			//ss.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	
	
}