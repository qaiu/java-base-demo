package fanshe;

public class Student {
	
	 //**********��Ա����(�ֶ�)*************//
    public String name;
    protected int age;
    char sex;
    private String phoneNum;

    //---------------���췽��-------------------
    //��Ĭ�ϵĹ��췽����
    Student(String str){
        System.out.println("(Ĭ��)�Ĺ��췽�� s = " + str);
    }

    //�޲ι��췽��
    public Student(){
        System.out.println("�����˹��С��޲ι��췽��ִ���ˡ�����");
    }

    //��һ�������Ĺ��췽��
    public Student(char name){
        System.out.println("������" + name);
    }

    //�ж�������Ĺ��췽��
    public Student(String name ,int age){
        System.out.println("������"+name+"���䣺"+ age);//���ִ��Ч�������⣬�Ժ�����
    }

    //�ܱ����Ĺ��췽��
    protected Student(boolean n){
        System.out.println("�ܱ����Ĺ��췽�� n = " + n);
    }

    //˽�й��췽��
    private Student(int age){
        System.out.println("˽�еĹ��췽��   ���䣺"+ age);
    }
    
    //**************��Ա����***************//
    public void show1(String s){
        System.out.println("�����ˣ����еģ�String������show1(): s = " + s);
    }
    protected void show2(){
        System.out.println("�����ˣ��ܱ����ģ��޲ε�show2()");
    }
    void show3(){
        System.out.println("�����ˣ�Ĭ�ϵģ��޲ε�show3()");
    }
    
    
    private String show4(int age){
        System.out.println("�����ˣ�˽�еģ������з���ֵ�ģ�int������show4(): age = " + age);
        return "abcd";
    }
 
    @Override
    public String toString() {
        return "Student [name=" + name + ", age=" + age + ", sex=" + sex
                + ", phoneNum=" + phoneNum + "]";
    }
    
    public static void main(String[] args) {
        System.out.println("main����ִ���ˡ�����");
    }
    
}