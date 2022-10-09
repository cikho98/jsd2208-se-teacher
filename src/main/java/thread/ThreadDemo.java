package thread;
/**
 * 多线程
 * 线程的第一种创建方式:
 * 继承Thread并重写run方法
 */
public class ThreadDemo {
    public static void main(String[] args) {
        Thread t1 = new MyThread1();
        Thread t2 = new MyThread2();
        /*
            需要注意,启动线程要调用线程的start方法,而不是直接调用run方法!
         */
        t1.start();
        t2.start();

    }
}
class MyThread1 extends Thread{
    public void run(){
        for (int i=0;i<1000;i++){
            System.out.println("你是谁啊?");
        }
    }
}
class MyThread2 extends Thread{
    public void run(){
        for (int i=0;i<1000;i++){
            System.out.println("开门!查水表的!");
        }
    }
}