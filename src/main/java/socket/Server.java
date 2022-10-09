package socket;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * windows查看IP地址:
 * WIN+R后在输入框输入CMD
 * 弹出的命令行窗口输入:ipconfig查看
 *
 * MAC查看IP地址:
 * 五个手指在触摸板上向中间聚拢,选择"终端"并打开.
 * 弹出的命令将窗口输入:/sbin/ifconfig查看
 *
 *
 * 聊天室服务端
 */
public class Server {
    /**
     * java.net.ServerSocket
     * 运行在服务端的ServerSocket主要任务:
     * 1:打开服务端口(客户端就是通过这个端口与服务端建立连接的)
     * 2:监听端口,等待客户端连接.
     */
    private ServerSocket serverSocket;
    public Server(){
        try {
            /*
                创建ServeSocket时要指定服务端口,该端口不能与服务端所在
                计算机上其它应用程序开启的端口重复,否则会抛出异常:
                java.net.BindException:address already in use
                解决办法:
                1:更换端口,直到可用
                2:杀死使用该端口的进程(程序),仅在咱们重复启动服务端导致时使用
             */
            System.out.println("正在启动服务端...");
            serverSocket = new ServerSocket(8088);
            System.out.println("服务端启动完毕!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void start(){
        try {
            System.out.println("等待客户端连接...");
            Socket socket = serverSocket.accept();
            System.out.println("一个客户端连接了!");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public static void main(String[] args) {
        Server server = new Server();
        server.start();
    }
}
