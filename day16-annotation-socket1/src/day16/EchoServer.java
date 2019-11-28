package day16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.URL;

import com.fasterxml.jackson.databind.ObjectMapper;

public class EchoServer {
	//�����߳�
	class ServerThread extends Thread{
		
		@Override
		public void run() {
			try(ServerSocket ss = new ServerSocket(8000)) {
				System.out.println("�����Ѿ���8000�˿�����");
				while(true) {
					Socket s = ss.accept();
					System.out.println("һ���ͻ���������");
					TongXinThread t = new TongXinThread(s);
					t.start();
				}
			} catch (Exception e) {
				System.err.println("8000�˿ڱ�ռ��,���߷����쳣ֹͣ");
				e.printStackTrace();
			} 
		}
	}
	
	//ͨѶ�߳�
	class TongXinThread extends Thread{
		private Socket s;
		public TongXinThread(Socket s) {
			this.s=s;
		}
		
		/*
		 * ͨѶЭ��: ����, ���ݸ�ʽ
		 *   *) UTF-8������ı�
		 *   	
		 *   InputStreamReader
		 *   OutputStreamWriter
		 *   
		 *   *) ÿ���ı���ĩβ,����һ�����з�
		 *   BufferReader  	readLine()
		 *   PrintWriter	println()
		 *   
		 */
		@Override
		public void run() {
			try {
				BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream(),"utf-8"));
				PrintWriter out = new PrintWriter(new OutputStreamWriter(s.getOutputStream(),"utf-8"),true);
				
				String line;
				
				while((line = in.readLine()) != null) {
					System.out.println("�������յ���Ϣ: "+line);
					String msg = getMsg(line);//��ȡAI��Ϣ
					out.println(msg);
					System.out.println("������������Ϣ:"+msg);
				}
				
				//null��ʾ����Ͽ�
			} catch (Exception e) {
				//readLine()�������ݳ����쳣,Ҳ��ʾ����Ͽ�
			}
			System.out.println("һ���ͻ����ѶϿ�");
			
		}
	}
	
	//��ȡAI��Ϣ
	private String getMsg(String line) throws Exception {
		ObjectMapper mapper = new ObjectMapper();
		
		String msg = doGet("http://api.qingyunke.com/api.php?key=free&appid=0&msg="+
				java.net.URLEncoder.encode(line,"utf-8"));
		JsonMsg jm = mapper.readValue(msg, JsonMsg.class);
		return jm.getContent();//.replaceAll("\\{br\\}", "\n");//��{br}�滻�ɻ���(ֻ�ܶ�ȡ����,�ݲ�����)
	}
	
	//Http get����
    private String doGet(String httpurl) {
        HttpURLConnection connection = null;
        
        String result = null;// ���ؽ���ַ���
        try {
            // ����Զ��url���Ӷ���
            URL url = new URL(httpurl);
            // ͨ��Զ��url���Ӷ����һ�����ӣ�ǿת��httpURLConnection��
            connection = (HttpURLConnection) url.openConnection();
            // �������ӷ�ʽ��get
            connection.setRequestMethod("GET");
            // �������������������ĳ�ʱʱ�䣺15000����
            connection.setConnectTimeout(15000);
            // ���ö�ȡԶ�̷��ص�����ʱ�䣺60000����
            connection.setReadTimeout(60000);
            // ��������
            connection.connect();
            // ͨ��connection���ӣ���ȡ������
            if (connection.getResponseCode() == 200) {
            	 try (InputStream is = connection.getInputStream();
                         BufferedReader br = new BufferedReader(new InputStreamReader(is, "UTF-8"));)
                 {
                // ��װ������is����ָ���ַ���
                // �������
                StringBuffer sbf = new StringBuffer();
                String temp = null;
                while ((temp = br.readLine()) != null) {
                    sbf.append(temp);
                    sbf.append("\r\n");
                }
                result = sbf.toString();}
            	 catch (Exception e) {
					// TODO: handle exception
				}
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
           
 
            connection.disconnect();// �ر�Զ������
        }
 
        return result;
    }
    
    public static void main(String[] args) {
		new EchoServer().new ServerThread().start();
	}
}

//�����л�����Ϣjson����
class JsonMsg{
	private int result;
	private String content;
	
	public JsonMsg() {
		
	}
	public JsonMsg(int result, String content) {
		this.result = result;
		this.content = content;
	}
	public int getResult() {
		return result;
	}
	public void setResult(int result) {
		this.result = result;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
}