package thread;

/**
 * 第二种创建线程的方式
 * 实现Runnable接口单独定义线程任务
 */
public class ThreadDemo2 {
    public static void main(String[] args) {
        //1实例化任务
        Runnable r1 = new MyRunnable1();
        Runnable r2 = new MyRunnable2();
        //2实例化线程并指派任务
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        //线程启动后会自动调用任务的run方法
        t1.start();
        t2.start();
    }
}
class MyRunnable1 implements Runnable{
    public void run() {
        for (int i=0;i<1000;i++){
            System.out.println("你是谁啊?");
        }
    }
}
class MyRunnable2 implements Runnable{
    public void run() {
        for (int i=0;i<1000;i++){
            System.out.println("查水表的!");
        }
    }
}