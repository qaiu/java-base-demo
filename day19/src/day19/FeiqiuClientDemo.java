package day19;
import java.io.IOException;  
import java.net.DatagramPacket;  
import java.net.DatagramSocket;  
import java.net.InetAddress;  
  
public class FeiqiuClientDemo {  
  
    public static void main(String[] args) throws IOException {  
        // TODO Auto-generated method stub  
      //java发送UDP  
        //飞秋传送规则，兼容飞鸽传书协议  
        for(int i=0;i<300;i++){  //改变次数，测试崩溃临界点  
            String content="1_lbt4_10#32899#002481627512#0#0#0:1289671407:Administrator:MICROSO-697TGLD:288:一日不见，如三月兮";  
            //飞秋报文规则  
            //Java发送udp  
            byte[] sendBuf=content.getBytes("GBK");  
            DatagramSocket client=new DatagramSocket();  
            InetAddress addr=InetAddress.getByName("172.18.2.150");  
            int port=2425;  //飞秋默认端口  
            DatagramPacket sendPacket=new DatagramPacket(sendBuf,sendBuf.length,addr,port);  
            client.send(sendPacket);  
            client.close();  
        }  
    }  
  
}  
