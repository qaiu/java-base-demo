package httptest;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
 
public class HttpTest {
    public static void main(String[] args) throws IOException{
        ServerSocket serverSocket = new ServerSocket(8888);
        while (true) {//һֱ������ֱ���ܵ�ֹͣ������
            Socket socket = null;
            try {
                socket = serverSocket.accept();//���û�����󣬻�һֱhold������ȴ����пͻ��������ʱ��Ż��������ִ��
                // log
                BufferedReader bufferedReader = new BufferedReader(
                        new InputStreamReader(socket.getInputStream()));//��ȡ������(����)
                StringBuilder stringBuilder = new StringBuilder();
                String line = null;
                while ((line = bufferedReader.readLine()) != null
                        && !line.equals("")) {//�õ���������ݣ�ע�������������жϷǿպ�""��Ҫ��ֻ�ж�null��������
                    stringBuilder.append(line).append("<br>");
                }
                String result = stringBuilder.toString();
                System.out.println(result);
                // echo
                PrintWriter printWriter = new PrintWriter(
                        socket.getOutputStream(), true);//����ڶ���������ʾ�Զ�ˢ�»���
                printWriter.println("HTTP/1.1 200 OK");
                printWriter.println("Content-Type:text/html");
                printWriter.println();
 
                printWriter.println("<h5>��ղŷ��͵����������ǣ�<br>");
                printWriter.write(result);//����־����������
                printWriter.println("</h5>");
                // release
                printWriter.close();
                bufferedReader.close();
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}