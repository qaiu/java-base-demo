
package oopday08.bird;


public class Duck extends Bird implements Fly,Swim{

	@Override
	public void swimming() {
		System.out.println("鸭子游泳");
	}

	@Override
	public void flying() {
		// TODO 自动生成的方法存根
		System.out.println("鸭子飞");
		
	}

	@Override
	public void layEggs() {
		// TODO 自动生成的方法存根
		System.out.println("鸭子产蛋");
	}
	

}
