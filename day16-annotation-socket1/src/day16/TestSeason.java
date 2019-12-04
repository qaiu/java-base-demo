package day16;

enum Season {

    SPRING("spring", "��ů����"),
    SUMMER("summer", "��������"),
    AUTUMN("autumn", "�����ˬ"),
    WINTER("winter", "��ѩ����");


    private final String seasonName;
    private final String seasonDesc;

    private Season (String seasonName, String seasonDesc) {
        this.seasonName = seasonName;
        this.seasonDesc = seasonDesc;
    }

    public String getSeasonName() {
        return seasonName;
    }
    public String getSeasonDesc() {
        return seasonDesc;
    }



    @Override
    public String toString() {
        return "Season [seasonName=" + seasonName + ", seasonDesc=" + seasonDesc + "]";
    }

    public void show() {
        System.out.println("����һ������");
    }

}

public class TestSeason {
    public static void main(String[] args) {
        Season spring = Season.SPRING;
        System.out.println(spring);
        spring.show();
        System.out.println(spring.getSeasonName());

        // 1. values() ��������������ֵ
        Season[] seasons = Season.values();
        for (int i=0; i<seasons.length;i++) {
            System.out.println(seasons[i]);
        }

        // 2. valueOf() ����������ָ�������ֵ��Ҫ������β�name��ö�����������֣�
        // ���򣬱� java.lang.IllegalArgumentException �쳣
        String str = "SPRING";
        Season sea = Season.valueOf(str);
        System.out.println(sea);
    }
}