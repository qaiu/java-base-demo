package top.qaiu;

import java.util.Random;

public class Test4_Final {
    public static void main(String[] args) {
        Fu f = new Fu();
        f.age = 2;
        System.out.println("");
        Random ran=new Random(10);
    }
}

class Fu {
    int age;// = 10;

    public void eat() {
        System.out.println("°Ö°Ö³Ô·¹");
    }
}

class Zi extends Fu {
    public void eat() {
        System.out.println("¶ù×Ó³Ô·¹");
    }
}
