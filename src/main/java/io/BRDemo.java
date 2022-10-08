package io;

import java.io.*;

/**
 * 缓冲字符输入流java.io.BufferedReader
 * 缓冲字符输入流内部维护一个8K的char数组,块读文本数据加速.
 * 并且直接提供了读取一行字符串的方法readLine.
 */
public class BRDemo {
    public static void main(String[] args) throws IOException {
        //将当前源代码输出到控制台上
        FileInputStream fis = new FileInputStream(
                "./src/main/java/io/BRDemo.java");
        InputStreamReader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);
        /*
            BufferedReader提供了读取一行字符串的方法:
            String readLine()
            读取一行字符串,返回的字符串不含有最后的换行符.
            当单独读取了换行符(空行),则返回值为空字符串.
            如果流读取到了末尾,则返回值为null.
         */
        String line;
        while((line = br.readLine())!=null){
            System.out.println(line);
        }
        br.close();
    }
}
