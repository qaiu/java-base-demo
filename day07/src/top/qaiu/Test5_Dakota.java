package top.qaiu;


class Test5_Polymorphism {

    static void demo(Animal a){
        a.eat();
    }
    public static void main(String[] args) {

        int x=4;

        System.out.println(
                "value is"+((x>4)?99.9 :9));
    }
}


class Animal{
    public void eat(){
        System.out.println("动物都会吃");
    }
}

class Dog extends Animal{

    @Override
    public void eat(){
        System.out.println("狗吃肉");
    }
}

class cat extends  Animal{

    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }
}

class Quail {

}