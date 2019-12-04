package day15;

public class Test6 {
	public static void main(String[] args) {
		Weapon w1 = f1();
		w1.kill();
		System.out.println(w1);
		System.out.println("------------");
		
		Weapon w2 = f2("倚天剑");
		w2.kill();
		System.out.println(w2);
		System.out.println("------------");
	}

	private static Weapon f2(String name) {
//		return ()->System.out.println("使用"+name+"进攻");
		
		return new Weapon() {
			
			@Override
			public void kill() {
				System.out.println("使用"+name+"进攻");
			}
		};
	}

	private static Weapon f1() {
		class AK47 implements Weapon{

			@Override
			public void kill() {
				System.out.println("使用AK47进攻");
			}
			
		}
		return new AK47();
	}
}
