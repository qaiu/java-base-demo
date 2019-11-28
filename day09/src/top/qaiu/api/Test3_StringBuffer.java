package top.qaiu.api;

public class Test3_StringBuffer {
    public static void main(String[] args) {
        String s = "abcdefghijklmnopqistuvwxyz";
        StringBuffer res = new StringBuffer();
        //StringBuilder
        //StringBuffer
        StringBuilder ss;
        long start = System.currentTimeMillis();
        for(int i = 0; i < 100000; i++){
            res.append(s);
        }
        long end = System.currentTimeMillis() - start; //1998
        System.out.println(end);
        //System.out.println(res);
        //System.out.println(s);
        //
    }
}
