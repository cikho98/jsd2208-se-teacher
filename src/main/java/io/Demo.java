package io;

public class Demo {
    public static void main(String[] args) {
        /*
            自1970年元旦到当前系统时间之间经过的毫秒
         */
        long now = System.currentTimeMillis();
        System.out.println(now);
        now = now/1000/60/60/24/365;
        System.out.println(now);

        long max = Long.MAX_VALUE;
        max = max/1000/60/60/24/365;
        System.out.println("公元:"+(1970+max)+"年");

    }
}
