package collection;
/**
 * Jdk5֮���˳���һ������ ��ǿforѭ��
 * ���Ա���������߼���
 * ��ѭ��
 */
import java.util.ArrayList;
import java.util.Collection;

public class Foreach {
	public static void main(String[] args) {
		Collection<String> names = new ArrayList<>();
        names.add("С��");
        names.add("Сǿ");
        names.add("С��");
        names.add("С��");
        //ʹ��lambda����,ÿ�����϶����Ե���forEach����
        names.forEach(name->System.out.println(name));
        //�ȼ���
        for (String name:names) {
        	System.out.println(name);
        } 
	}
}
