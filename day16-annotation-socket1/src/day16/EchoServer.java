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
	//服务线程
	class ServerThread extends Thread{
		
		@Override
		public void run() {
			try(ServerSocket ss = new ServerSocket(8000)) {
				System.out.println("服务已经在8000端口启动");
				while(true) {
					Socket s = ss.accept();
					System.out.println("一个客户端已连接");
					TongXinThread t = new TongXinThread(s);
					t.start();
				}
			} catch (Exception e) {
				System.err.println("8000端口被占用,或者服务异常停止");
				e.printStackTrace();
			} 
		}
	}
	
	//通讯线程
	class TongXinThread extends Thread{
		private Socket s;
		public TongXinThread(Socket s) {
			this.s=s;
		}
		
		/*
		 * 通讯协议: 流程, 数据格式
		 *   *) UTF-8编码的文本
		 *   	
		 *   InputStreamReader
		 *   OutputStreamWriter
		 *   
		 *   *) 每段文本的末尾,都有一个换行符
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
					System.out.println("服务器收到消息: "+line);
					String msg = getMsg(line);//获取AI消息
					out.println(msg);
					System.out.println("服务器发送消息:"+msg);
				}
				
				//null表示网络断开
			} catch (Exception e) {
				//readLine()接收数据出现异常,也表示网络断开
			}
			System.out.println("一个客户端已断开");
			
		}
	}
	
	//获取AI消息
	private String getMsg(String line) throws Exception {
		ObjectMapper mapper = new ObjectMapper();
		
		String msg = doGet("http://api.qingyunke.com/api.php?key=free&appid=0&msg="+
				java.net.URLEncoder.encode(line,"utf-8"));
		JsonMsg jm = mapper.readValue(msg, JsonMsg.class);
		return jm.getContent();//.replaceAll("\\{br\\}", "\n");//把{br}替换成换行(只能读取单行,暂不处理)
	}
	
	//Http get请求
    private String doGet(String httpurl) {
        HttpURLConnection connection = null;
        
        String result = null;// 返回结果字符串
        try {
            // 创建远程url连接对象
            URL url = new URL(httpurl);
            // 通过远程url连接对象打开一个连接，强转成httpURLConnection类
            connection = (HttpURLConnection) url.openConnection();
            // 设置连接方式：get
            connection.setRequestMethod("GET");
            // 设置连接主机服务器的超时时间：15000毫秒
            connection.setConnectTimeout(15000);
            // 设置读取远程返回的数据时间：60000毫秒
            connection.setReadTimeout(60000);
            // 发送请求
            connection.connect();
            // 通过connection连接，获取输入流
            if (connection.getResponseCode() == 200) {
            	 try (InputStream is = connection.getInputStream();
                         BufferedReader br = new BufferedReader(new InputStreamReader(is, "UTF-8"));)
                 {
                // 封装输入流is，并指定字符集
                // 存放数据
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
           
 
            connection.disconnect();// 关闭远程连接
        }
 
        return result;
    }
    
    public static void main(String[] args) {
		new EchoServer().new ServerThread().start();
	}
}

//反序列化的消息json对象
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