
package oopday08.bird;


public class Duck extends Bird implements Fly,Swim{

	@Override
	public void swimming() {
		System.out.println("Ѽ����Ӿ");
	}

	@Override
	public void flying() {
		// TODO �Զ����ɵķ������
		System.out.println("Ѽ�ӷ�");
		
	}

	@Override
	public void layEggs() {
		// TODO �Զ����ɵķ������
		System.out.println("Ѽ�Ӳ���");
	}
	

}
