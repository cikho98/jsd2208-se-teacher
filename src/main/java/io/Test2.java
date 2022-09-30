package io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

/**
 * 使用文件流实现简易记事本工具
 * 程序启动后将用户在控制台上输入的每一行字符串都写入到文件note.txt中
 * 当用户在控制台上单独输入了"exit"时,程序退出.
 * 注:写入文件中的内容不用考虑换行问题.
 *
 */
public class Test2 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        FileOutputStream fos = new FileOutputStream("note.txt");
        while(true) {
            String line = scanner.nextLine();//获取控制台输入的一行字符串
//            if(line.equals("exit")){
            if("exit".equals(line)){
                break;
            }
            byte[] data = line.getBytes(StandardCharsets.UTF_8);
            fos.write(data);
        }
        System.out.println("再见!");
        fos.close();
    }
}



