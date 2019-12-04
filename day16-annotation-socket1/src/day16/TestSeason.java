package day16;

enum Season {

    SPRING("spring", "春暖花开"),
    SUMMER("summer", "夏日炎炎"),
    AUTUMN("autumn", "秋高气爽"),
    WINTER("winter", "白雪皑皑");


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
        System.out.println("这是一个季节");
    }

}

public class TestSeason {
    public static void main(String[] args) {
        Season spring = Season.SPRING;
        System.out.println(spring);
        spring.show();
        System.out.println(spring.getSeasonName());

        // 1. values() 方法：返回所有值
        Season[] seasons = Season.values();
        for (int i=0; i<seasons.length;i++) {
            System.out.println(seasons[i]);
        }

        // 2. valueOf() 方法：返回指定对象的值（要求传入的形参name是枚举类对象的名字）
        // 否则，报 java.lang.IllegalArgumentException 异常
        String str = "SPRING";
        Season sea = Season.valueOf(str);
        System.out.println(sea);
    }
}