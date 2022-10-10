package thread;

/**
 * 多线程并发安全问题
 * 当多个线程并发操作同一临界资源,由于操作顺序不确定,导致操作结果出现混乱从而
 * 出现不良后果.
 * 临界资源:操作该资源的完整过程同一时刻只能被单一线程进行.
 */
public class SyncDemo1 {
    public static void main(String[] args) {
        Table table = new Table();
        Thread t1 = new Thread(){
            public void run(){
                while(true){
                    int bean = table.getBean();
                    Thread.yield();
                    System.out.println(getName()+":"+bean);
                }
            }
        };
        Thread t2 = new Thread(){
            public void run(){
                while(true){
                    int bean = table.getBean();
                    Thread.yield();
                    System.out.println(getName()+":"+bean);
                }
            }
        };
        t1.start();
        t2.start();
    }
}
class Table{
    private int beans = 20;//桌子上有20个豆子

    public int getBean(){//从桌子上拿取一个豆子的方法
        if(beans==0){//如果桌子上没有豆子了
            throw new RuntimeException("没有豆子了");
        }
        //yield方法可以让执行该方法的线程主动放弃本次剩余时间片
        Thread.yield();//主动放弃时间片,模拟线程执行到这里没有时间了
        return beans--;
    }
}






