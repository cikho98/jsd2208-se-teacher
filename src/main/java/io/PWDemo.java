package io;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 * 缓冲字符流
 * java.io.BufferedWriter和BufferedReader
 * 缓冲字符流内部默认维护一个8k的char数组(长度可以创建缓冲流时修改)
 * 以块读写文本数据加快读写效率
 *
 * java.io.PrintWriter是具有自动行刷新的缓冲字符输出流(内部总是连接
 * BufferedWriter作为缓冲)
 * 特点:可以自动行刷新,且可以安行写出字符串
 */
public class PWDemo {
    public static void main(String[] args) throws FileNotFoundException {
        //安行向文件pw.txt中写出数据
        PrintWriter pw = new PrintWriter("pw.txt");
        pw.println("让我掉下眼泪的,不止昨夜的酒.");
        pw.println("让我依依不舍的,不止你的温柔.");
        System.out.println("写出完毕!");
        pw.close();

    }
}
