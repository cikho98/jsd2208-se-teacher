package thread;

import java.util.Scanner;

/**
 * Sleep阻塞
 * 线程提供了一个静态方法:
 * static void sleep(long ms)
 * 该方法可以让运行这个方法的线程处于阻塞状态执行毫秒.超时后线程会自动回到
 * RUNNABLE状态并再次开始并发执行
 */
public class SleepDemo {
    public static void main(String[] args) {
        /*
            倒计时程序
            在控制台上输入一个数字,从该数字开始每秒递减,到0时输出时间到
         */
        System.out.println("程序开始了");
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个数字:");
        for(int num = scanner.nextInt();num>0;num--) {
            System.out.println(num);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("时间到!程序结束了");
    }
}
