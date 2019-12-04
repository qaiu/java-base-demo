package top.qaiu.api;

public class SleepSort {
    static class C1 {
        static int i;
    }

    public static void main(String[] args) {
        int[] arr = {1022, 2033, 44, 3, 2, 1, 222, 111, 333, 444};
        for (int i = 0; i < arr.length; i++) {
            final int k = i;
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(arr[k]);
                        System.out.println(arr[k]);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }).start();
        }
    }
}
