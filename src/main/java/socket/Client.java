package socket;

import java.io.*;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

/**
 * 聊天室客户端
 */
public class Client {
    /*
        java.net.Socket 套接字
        Socket封装了TCP协议的连接过程及通讯过程.我们使用它就可以与
        远端计算机建立连接并基于两条流的IO操作完成与服务端的数据交互.
     */
    private Socket socket;

    public Client(){
        /*
            实例化Socket时就是与服务端建立连接的过程,这里需要传入
            两个参数:
            参数1:服务端的IP地址,通过该地址可以找到网络上的服务器计算机
            参数2:服务端打开的服务端口,通过该端口连接到服务器上的服务端程序

            "localhost"表示本机IP
         */
        try {
            System.out.println("正在连接服务端...");
            socket = new Socket("localhost",8088);
            System.out.println("与服务端建立连接!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void start(){
        try {
            //低级流,作用:将写出的字节发送给建立连接的远端计算机
            OutputStream out = socket.getOutputStream();
            //转换流(高级流),作用:1衔接字节与字符流   2将写出的字符转换为字节
            OutputStreamWriter osw
                    = new OutputStreamWriter(out, StandardCharsets.UTF_8);
            //缓冲流(高级流),作用:块写文本数据加速
            BufferedWriter bw = new BufferedWriter(osw);
            //PrintWriter(高级流),作用:1按行写出字符串  2自动行刷新
            PrintWriter pw = new PrintWriter(bw,true);

            Scanner scanner = new Scanner(System.in);
            while(true) {
                String line = scanner.nextLine();
                if("exit".equals(line)){
                    break;
                }
                pw.println(line);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    public static void main(String[] args) {
        Client client = new Client();
        client.start();
    }
}
