package day19;
import java.io.IOException;  
import java.net.DatagramPacket;  
import java.net.DatagramSocket;  
import java.net.InetAddress;  
  
public class FeiqiuClientDemo {  
  
    public static void main(String[] args) throws IOException {  
        // TODO Auto-generated method stub  
      //java����UDP  
        //���ﴫ�͹��򣬼��ݷɸ봫��Э��  
        for(int i=0;i<300;i++){  //�ı���������Ա����ٽ��  
            String content="1_lbt4_10#32899#002481627512#0#0#0:1289671407:Administrator:MICROSO-697TGLD:288:һ�ղ�������������";  
            //���ﱨ�Ĺ���  
            //Java����udp  
            byte[] sendBuf=content.getBytes("GBK");  
            DatagramSocket client=new DatagramSocket();  
            InetAddress addr=InetAddress.getByName("172.18.2.150");  
            int port=2425;  //����Ĭ�϶˿�  
            DatagramPacket sendPacket=new DatagramPacket(sendBuf,sendBuf.length,addr,port);  
            client.send(sendPacket);  
            client.close();  
        }  
    }  
  
}  
