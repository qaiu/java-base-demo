package oopday03;

import java.util.List;
import java.util.ArrayList;

public class CatDemo {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Cat[] cat={
			new Cat("С��",3,6,"����"),
			new Cat("С��",3,6,"����"),
			new Cat("С�ɰ�",1,4,"����"),
			new Cat("С��è",2,7,"����")
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
