package top.qaiu.extents;

public class Test8_UserExtents2 {
	public static void main(String[] args) {
		new Son().eat();
	}
}

abstract class  Father{
	public void eat() {
		
	}
	private void name() {
		
	}
}

class Son extends Father{
	public void shopping() {
		System.out.println("���Ӱ���Ǯ");
	}
	
	//�����޸ĸ����ԭ�й���--��д
	//��дҪ��:���η�>=����,��������һģһ��
	@Override
	public void eat() {
		
		System.out.println("���Ӻ���");
	}
	
}