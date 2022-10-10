package thread;

/**
 * 守护线程
 * 守护线程也称为后台线程.
 * 我们正常创建的线程都称为"用户线程",也可称为普通线程,前台线程.
 * 守护线程是通过调用线程的setDaemon(true)而转变为守护线程的.
 *
 * 守护线程与用户线程的区别:
 * 当一个java进程中的所有用户线程都结束时,进程就会结束,此时进程会强制杀死
 * 所有还在运行的守护线程.
 */
public class DaemonThreadDemo {
    public static void main(String[] args) {
        Thread rose = new Thread(){
            public void run(){
                for(int i=0;i<5;i++){
                    System.out.println("rose:let me go!");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("rose:啊啊啊啊啊啊AAAAAAAaaaaaa....");
                System.out.println("扑通");
            }
        };

        Thread jack = new Thread(){
            public void run(){
                while(true){
                    System.out.println("jack:you jump!i jump!");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        rose.start();
        //设置守护线程必须在线程启动前进行
        jack.setDaemon(true);
        jack.start();

        //主线程也是用户线程,如果主线程不结束,进程就不会结束(因为还有用户线程活着)
//        while(true);
    }
}







