package day16;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Target ����ע��Ŀ��:��,����,��Ա����,��������.......
 * @Retention ������Χ:Դ��,�ֽ����ļ�,�������ڴ�
 * @author QAIU
 *
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Test {
	
	int id() default 0;
	String title() default "";
	/*
	 * ����������� value, ���������
	 * ������ֵʱ���Բ�д������
	 * һ������Ϊ�������Եı���
	 */
	
	String value() default "";
	
	
	
}
