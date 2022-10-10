package socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

/**
 * windows查看IP地址:
 * WIN+R后在输入框输入CMD
 * 弹出的命令行窗口输入:ipconfig查看
 * <p>
 * MAC查看IP地址:
 * 五个手指在触摸板上向中间聚拢,选择"终端"并打开.
 * 弹出的命令行窗口输入:/sbin/ifconfig查看
 * <p>
 * <p>
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

    public Server() {
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

    public void start() {
        try {
            while (true) {
                System.out.println("等待客户端连接...");
                /*
                ServerSocket的accept方法用于等待客户端的连接.
                该方法是一个阻塞方法,直到一个客户端建立连接,此时该方法会立即
                返回一个Socket实例,使用该Socket实例即可与对方交互.
             */
                Socket socket = serverSocket.accept();
                System.out.println("一个客户端连接了!");
                //启动一个线程来处理与该客户端的交互
                ClientHandler handler = new ClientHandler(socket);
                Thread t = new Thread(handler);
                t.start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        Server server = new Server();
        server.start();
    }

    /**
     * 该线程任务负责与指定的客户端交互
     */
    private class ClientHandler implements Runnable{
        private Socket socket;
        public ClientHandler(Socket socket){
            this.socket = socket;
        }

        public void run(){
            try {
                //通过socket获取输入流读取来自远端计算机发送过来的数据
                InputStream in = socket.getInputStream();
                InputStreamReader isr
                        = new InputStreamReader(in, StandardCharsets.UTF_8);
                BufferedReader br = new BufferedReader(isr);
                //读取一行来自远端计算机发送过来的字符串
                String message;
                while ((message = br.readLine()) != null) {
                    System.out.println("客户端说:" + message);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
