package oopday03;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		 List<String> list = new ArrayList<String>();
	        System.out.println("ArrayList���ϳ�ʼ��������"+list.size());

	        //��ӹ��ܣ�
	        list.add("Hello");
	        list.add("world");
	        list.add(2,"!");
	        System.out.println("ArrayList��ǰ������"+list.size());

	        //�޸Ĺ��ܣ�
	        list.set(0,"my");
	        list.set(1,"name");
	        System.out.println("ArrayList��ǰ���ݣ�"+list.toString());

	        //��ȡ���ܣ�
	        String element = list.get(0);
	        System.out.println(element);

	        //�������������ϣ�(ArrayListʵ�ʵĵ�������Itr����)
	        Iterator<String> iterator =  list.iterator();
	        while(iterator.hasNext()){
	            String next = iterator.next();
	            System.out.println(next);
	        }

	        //forѭ���������ϣ�
	        for(String str:list){
	            System.out.println(str);
	        }

	        //�жϹ��ܣ�
	        boolean isEmpty = list.isEmpty();
	        boolean isContain = list.contains("my");

	        //���ȹ��ܣ�
	        int size = list.size();

	        //�Ѽ���ת�������飺
	        String[] strArray = list.toArray(new String[]{});

	        //ɾ�����ܣ�
	        list.remove(0);
	        list.remove("world");
	        list.clear();
	        System.out.println("ArrayList��ǰ������"+list.size());
	}
}
