package exception;

import java.awt.AWTException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

/**
 * ������д���ຬ��throws�����쳣�׳��ķ���ʱ
 * ��throws����д����
 * @author QAIU
 *
 */
public class ThrowsDemo {
	public void dosome() throws IOException,AWTException{
			
	}
}

class Sub extends ThrowsDemo{
	
//	public void dosome() throws IOException,AWTException{	
//	}
	
	//��������׳������쳣
//	public void dosome() throws AWTException {
//	}
	
	//�����׳��κ��쳣
//	public void dosome(){
//	}
	
	//�����׳������쳣������
//	public void dosome() throws FileNotFoundException{
//	}
	
	//�������׳������쳣
//	public void dosome() throws SQLException{
//	}
	//�������׳������׳��쳣�ĸ�����
//	public void dosome()throws Exception{
//	}
}