package exception;

import java.awt.AWTException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

/**
 * 子类重写父类含有throws声明异常抛出的方法时
 * 对throws的重写规则
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
	
	//允许仅仅抛出部分异常
//	public void dosome() throws AWTException {
//	}
	
	//允许不抛出任何异常
//	public void dosome(){
//	}
	
	//允许抛出父类异常的子类
//	public void dosome() throws FileNotFoundException{
//	}
	
	//不允许抛出额外异常
//	public void dosome() throws SQLException{
//	}
	//不允许抛出父类抛出异常的父类型
//	public void dosome()throws Exception{
//	}
}