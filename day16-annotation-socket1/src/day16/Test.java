package day16;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Target 设置注解目标:类,方法,成员变量,方法参数.......
 * @Retention 保留范围:源码,字节码文件,运行期内存
 * @author QAIU
 *
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Test {
	
	int id() default 0;
	String title() default "";
	/*
	 * 特殊的属性名 value, 有特殊待遇
	 * 单独赋值时可以不写属性名
	 * 一般是做为其他属性的别名
	 */
	
	String value() default "";
	
	
	
}
