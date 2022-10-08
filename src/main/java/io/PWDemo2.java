package io;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

/**
 * 自行完成流连接
 */
public class PWDemo2 {
    public static void main(String[] args) throws FileNotFoundException {
        //文件输出流(字节流,低级流):负责将字节写入到文件中
        FileOutputStream fos =  new FileOutputStream("pw.txt",true);
        //转换输出流(字符流,高级流):1负责衔接字节与字符流  2负责将写出的字符转换为字节
        OutputStreamWriter osw = new OutputStreamWriter(fos, StandardCharsets.UTF_8);
        //缓冲字符输出流(字符流,高级流):负责块写文本数据加速
        BufferedWriter bw = new BufferedWriter(osw);
        //PrintWriter(字符流,高级流):1按行写出字符串 2自动行刷新
        /*
            当使用PrintWriter的构造器:
            PrintWriter(OutputStream out,boolean autoFlush)
            PrintWriter(Writer w,boolean autoFlush)
            并且第二个参数为true时,则打开了自动行刷新功能,这样一来每当
            我们使用println方法写出一行字符串时就会自动flush一次.
         */
        PrintWriter pw = new PrintWriter(bw,true);
        Scanner scanner = new Scanner(System.in);
        while(true) {
            String line = scanner.nextLine();
            if("exit".equals(line)){
                break;
            }
            pw.println(line);
        }
        System.out.println("再见!");
        pw.close();
    }
}
