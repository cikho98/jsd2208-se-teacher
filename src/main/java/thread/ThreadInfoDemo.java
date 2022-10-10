package thread;

/**
 * 线程提供了一组获取当前线程相关信息的方法
 */
public class ThreadInfoDemo {
    public static void main(String[] args) {
        //得到主线程
        Thread main = Thread.currentThread();
        //获取线程的名字
        String name = main.getName();
        System.out.println("名字:"+name);
        //获取线程的唯一表示
        long id = main.getId();
        System.out.println("唯一表示:"+id);
        //获取线程的优先级
        int priority = main.getPriority();
        System.out.println("优先级:"+priority);

        boolean isAlive = main.isAlive();
        boolean isDaemon = main.isDaemon();
        boolean isInterrupted = main.isInterrupted();
        System.out.println("是否活着:"+isAlive);
        System.out.println("是否为守护线程:"+isDaemon);
        System.out.println("是否被中断:"+isInterrupted);
    }
}
