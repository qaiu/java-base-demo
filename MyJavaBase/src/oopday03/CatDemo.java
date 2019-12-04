package oopday03;

import java.util.List;
import java.util.ArrayList;

public class CatDemo {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Cat[] cat={
			new Cat("小花",3,6,"雌性"),
			new Cat("小喵",3,6,"雌性"),
			new Cat("小可爱",1,4,"雄性"),
			new Cat("小橘猫",2,7,"雄性")
			};
		
		
	//	List <String>list=new List<String>();
		for (Cat cat2 : cat) {
			cat2.catInfo();
		}

		 List<Cat> list = new ArrayList<Cat>();
		 list.add(new Cat());
		 Object c=new Cat();
		 System.out.println(c.toString());
		 
		 Object oo=new Object();
		 
		 System.out.println(oo.hashCode());
		 
	}

}
