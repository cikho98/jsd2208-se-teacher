package thread;

/**
 * 以匿名内部类形式完成线程的两种创建模式
 */
public class ThreadDemo3 {
    public static void main(String[] args) {
        //第一种创建线程的方式:继承Thread并重写run方法
        Thread t1 = new Thread(){
            public void run(){
                for (int i=0;i<1000;i++) {
                    System.out.println("你是谁啊");
                }
            }
        };
        //第二种创建线程的方式:实现Runnable接口并重写run方法
//        Runnable r2 = new Runnable() {
//            public void run() {
//                for (int i=0;i<1000;i++) {
//                    System.out.println("我是查水表的!");
//                }
//            }
//        };
//        Thread t2 = new Thread(r2);

        //Runnable接口可以使用lambda表达式创建
        Thread t2 = new Thread(()->{
            for (int i=0;i<1000;i++) {
                System.out.println("我是查水表的!");
            }
        });


        t1.start();
        t2.start();
    }
}
