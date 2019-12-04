package cn.tedu.shoot;

public class Hero extends FlyingObject{
	int life; //生命值
	int doubleFire;
	public Hero() {
		// 152=400/2-97/2
		// 410是游戏界面中靠下的Y轴位置，是估算的
		super(97, 139, 152, 410);
		life=3;
		//doubleFire 默认为0，可以采用默认值
		
	}

	public void show() {
		System.out.println("宽："+width+",高:"+height);
		System.out.println("x:"+x+",y:"+y);
		System.out.println("生命值:"+life);
		System.out.println("火力值:"+doubleFire);
	}
	
}
