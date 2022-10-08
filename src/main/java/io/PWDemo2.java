package io;

import java.io.*;

/**
 * 自行完成流连接
 */
public class PWDemo2 {
    public static void main(String[] args) throws FileNotFoundException {
        //文件输出流(字节流,低级流):负责将字节写入到文件中
        FileOutputStream fos =  new FileOutputStream("pw.txt");
        //转换输出流(字符流,高级流):1负责衔接字节与字符流  2负责将写出的字符转换为字节
        OutputStreamWriter osw = new OutputStreamWriter(fos);
        //缓冲字符输出流(字符流,高级流):负责块写文本数据加速
        BufferedWriter bw = new BufferedWriter(osw);
        //PrintWriter(字符流,高级流):1按行写出字符串 2自动行刷新
        PrintWriter pw = new PrintWriter(bw);
        pw.println("你好!");
        pw.println("再见!");

        pw.close();
    }
}
