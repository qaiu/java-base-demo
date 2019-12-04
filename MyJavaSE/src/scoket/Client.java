package scoket;
/**
 * 聊天室客户端
 * @author QAIU
 *
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class Client {
	/*
	 * java.net.Socket 套接字
	 * Socket封装了tcp通讯细节,是我们使用
	 * TCP协议在两台计算机(客户端与服务端
	 * 程序)之间以流的读写操作完成.
	 */
	private Socket socket;

	/**
	 * 初始化客户端
	 */
	public Client() {
		try {
			/*
			 * 实例化Socket的过程就是与服务端建立链接的过程
			 * 这里需要传入两个参数:
			 * 1:服务器地址信息(IP地址)
			 * 2:服务器的端口号
			 * 我们通过IP可以找到网络上的服务端所在的计算机
			 * 通过端口可以找到运行在该机器上的服务端程序
			 */
			System.out.println("正在连接服务端...");
			//			socket = new Socket("192.168.43.90",8088);
			socket = new Socket("127.0.0.1",8088);
			System.out.println("已连接服务端");

		} catch (UnknownHostException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
	}

	/**
	 * 客户端开始工作的方法
	 */
	public void start() {
		try {
			/*
			 * OutputStream getOutputStream()
			 * 通过Socket获取一个输出流,通过这个输入流
			 * 写出的字节会发送给远端计算机
			 */

			OutputStream out = socket.getOutputStream();//字节输出流
			OutputStreamWriter osw = new OutputStreamWriter(out,"utf-8");//字符转换输入流
			BufferedWriter bw = new BufferedWriter(osw);//缓冲输出流
			PrintWriter pw = new PrintWriter(bw,true);//自动行刷新输出流

			Scanner scan = new Scanner(System.in);
			while(true) {
				pw.println(LocalTime.now().format(DateTimeFormatter.ofPattern("(HH:mm:ss)"))+
						":"+
						scan.nextLine());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		Client client = new Client();
		client.start();
	}
}
