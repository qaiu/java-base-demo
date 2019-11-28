package oopday02;

public class MyCat {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		//Cat cat = new Cat();
		Cat cat2 = new Cat("小花",3,5.5,"母");
		Cat cat3 = new Cat("小喵",4,3.5,"公");
		//cat.catInfo();
		cat2.catInfo();
		cat3.catInfo();
		Cat.sayHi();
		System.out.println(Cat.kk);
	}

}
