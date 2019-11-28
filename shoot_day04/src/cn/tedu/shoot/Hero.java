package cn.tedu.shoot;

public class Hero extends FlyingObject{
	private int life; //生命值
	private int doubleFire;
	public Hero() {
		// 152=400/2-97/2
		// 410是游戏界面中靠下的Y轴位置，是估算的
		super(97, 139, 152, 410);
		life=3;
		//doubleFire 默认为0，可以采用默认值
		
	}
	// 访问修饰符的注意事项
	// 类中的属性和方法有4种
	// 修饰类只能用public或者默认修饰符修饰
	// 非父类属性私有
	// 父类属性保护
	// 方法公有

	public void show() {
		System.out.println("宽："+width+",高:"+height);
		System.out.println("x:"+x+",y:"+y);
		System.out.println("生命值:"+life);
		System.out.println("火力值:"+doubleFire);
	}
	
}
