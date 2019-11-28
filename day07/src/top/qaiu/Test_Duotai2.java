package top.qaiu;

//这个类用来测试多态的使用
public class Test_Duotai2 {
    public static void main(String[] args) {
        Sharp s = new Sharp();
        s.draw();
        System.out.println(s.line);

        Sharp s2 = new Circle();
        s2.draw();
        System.out.println(s2.line);
        System.out.println(s2.name);
    }
}

//创建父类
class Sharp{
    int line;
    static String name = "Sharp";
    public void draw(){
        System.out.println("画个形状");
    }
}
//创建子类
class Circle extends Sharp{
    @Override
    public void draw() {
        System.out.println("画个圈圈");
    }
}