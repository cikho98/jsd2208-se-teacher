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

/**
 * 第一种创建线程的方式
 * 优点:结构简单,有利于匿名内部类形式创建
 * 缺点:
 * 1:存在继承冲突问题
 *   由于java是单继承的,这意味着如果继承了Thread则无法再继承其它类去复用
 *   方法.这在实际开发中非常不便
 * 2:当定义线程的同时我们重写了run方法并将线程任务定义在其中.
 *   这导致了线程与线程任务存在了必然的耦合关系,这不利于线程的重用.
 */
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