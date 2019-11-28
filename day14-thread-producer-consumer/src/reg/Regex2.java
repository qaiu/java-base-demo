package reg;

import java.util.Arrays;

/**
 * String类的正则方法: 正则匹配, 正则拆分,正则替换
 * @author QAIU
 *
 */
public class Regex2 {
	public static void main(String[] args) {
		
//		^  表示匹配字符串的开始位置  (例外  用在中括号中[ ] 时,可以理解为取反(集合外),表示不匹配中括号中字符串)
//		$  表示匹配字符串的结束位置
//		*  表示匹配 零次到多次
//		+  表示匹配 一次到多次 (至少有一次)
//		?  表示匹配零次或一次
//		.  表示匹配单个字符 
//		|  表示为或者,两项中取一项 &&且
//		(  ) 小括号表示匹配括号中全部字符或子表达式 						(组)
//		[  ] 中括号表示匹配括号中一个字符 可以用范围描述 如[0-9 a-z A-Z] 	(集合)
//			还可以表示之外的范围比如: [^a-z]表示匹配除a-z之外的所有字符
//		{  } 大括号用于限定匹配次数  									(量词)
//			如 {n}表示匹配n个字符  {n,}表示至少匹配n个字符  {n,m}表示至少n,最多m 
//			问题1: 为什么没有{, m}
		
//		\  转义字符 如上基本符号匹配都需要转义字符   
//			如 \*  表示匹配*号  Java里用\\转义正则符因为正则表达式也是字符串要服从字符串转义规则
//			先用\\转义成一个\来表示正则里的转义符, 因此如果要匹配'\' 则用 \\\\表示
//		\w 表示英文字母和数字  \W  非字母和数字
//		\d  表示数字   \D  非数字
		
		
		//+的用法 至少匹配一次 匹配do...g
		System.out.println("dog".matches("do+g")); 		//true
		System.out.println("dooog".matches("do+g"));	//true
		System.out.println("doooooOg".matches("do+g"));//false
		
		//replaceAll(regex,s) 正则替换
		
		//split
		String s = "aaa123bbb456ccc789";
		String[] s2 = s.split("\\d{3,}");
		System.out.println(Arrays.toString(s2));
		
		String[] s3 = s.split("[a-zA-Z]{3,}");
		System.out.println(Arrays.toString(s3));
		
		String regex = "([a-zA-Z][\\w]+)+@([\\w]+\\.)*([a-zA-Z])+";
		System.out.println("1:"+"abc@tedu.com.cn".matches(regex));
		System.out.println("2:"+"www.qq.cn".matches(regex));
		System.out.println("3:"+"736226400@vip.qq.com".matches(regex));
		System.out.println("4:"+"www.-abc-123@3qq.com.cn".matches(regex));
		System.out.println("5:"+"sssa#qaiu.cn".matches(regex));
		System.out.println("6:"+"abc@163.cn".matches(regex));
		regex = "([1-9][0-9]{4,9})+@(qq.com)";
		System.out.println("7:"+"736226400@qq.com".matches(regex));


	}
}
