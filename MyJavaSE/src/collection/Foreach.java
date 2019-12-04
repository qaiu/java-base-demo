package collection;
/**
 * Jdk5之后退出了一个特性 增强for循环
 * 可以遍历数组或者集合
 * 新循环
 */
import java.util.ArrayList;
import java.util.Collection;

public class Foreach {
	public static void main(String[] args) {
		Collection<String> names = new ArrayList<>();
        names.add("小明");
        names.add("小强");
        names.add("小红");
        names.add("小张");
        //使用lambda遍历,每个集合都可以调用forEach方法
        names.forEach(name->System.out.println(name));
        //等价于
        for (String name:names) {
        	System.out.println(name);
        } 
	}
}
