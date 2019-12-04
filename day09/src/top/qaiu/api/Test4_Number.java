package top.qaiu.api;

//这个类用来测试包装类型
public class Test4_Number {
    public static void main(String[] args) {
        int sum = 10;
        //把基本类型int包装成Integer
        Integer i = new Integer(sum);
        //valueOf()效率高,操作数据范围在-128-127之间,最好使用这个方法
        Integer i2 = Integer.valueOf(1249);
        System.out.println(i2);
        int i3 = i2; //等价于
        int i4 = i2.intValue();
        System.out.println(Integer.parseInt("2999"));//把字符串类型的数值转成int类型


    }
}
