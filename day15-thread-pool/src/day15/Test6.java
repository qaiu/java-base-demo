package day15;

public class Test6 {
	public static void main(String[] args) {
		Weapon w1 = f1();
		w1.kill();
		System.out.println(w1);
		System.out.println("------------");
		
		Weapon w2 = f2("���콣");
		w2.kill();
		System.out.println(w2);
		System.out.println("------------");
	}

	private static Weapon f2(String name) {
//		return ()->System.out.println("ʹ��"+name+"����");
		
		return new Weapon() {
			
			@Override
			public void kill() {
				System.out.println("ʹ��"+name+"����");
			}
		};
	}

	private static Weapon f1() {
		class AK47 implements Weapon{

			@Override
			public void kill() {
				System.out.println("ʹ��AK47����");
			}
			
		}
		return new AK47();
	}
}
