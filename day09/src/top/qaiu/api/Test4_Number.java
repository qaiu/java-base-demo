package top.qaiu.api;

//������������԰�װ����
public class Test4_Number {
    public static void main(String[] args) {
        int sum = 10;
        //�ѻ�������int��װ��Integer
        Integer i = new Integer(sum);
        //valueOf()Ч�ʸ�,�������ݷ�Χ��-128-127֮��,���ʹ���������
        Integer i2 = Integer.valueOf(1249);
        System.out.println(i2);
        int i3 = i2; //�ȼ���
        int i4 = i2.intValue();
        System.out.println(Integer.parseInt("2999"));//���ַ������͵���ֵת��int����


    }
}
