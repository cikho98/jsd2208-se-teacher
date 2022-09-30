package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/**
 * 将"./src/main/java/io"目录下的所有.java文件内容都输出到控制台上
 * 思路:
 * 1:使用一个File对象表示"./src/main/java/io"目录
 * 2:利用File的listFiles方法获取该目录下所有的.java文件(文件过滤器)
 * 3:遍历得到的每一个File对象(该目录中的其中一个java文件)
 * 4:利用文件输入流读取文件内容并转换为字符串输出(参照ReadStringDemo)
 *
 */
public class Test3 {
    public static void main(String[] args) throws IOException {
        //1
        File dir = new File("./src/main/java/io");
        //2
        File[] subs = dir.listFiles(f->f.getName().endsWith(".java"));
        //3
        for(File sub : subs){
            FileInputStream fis = new FileInputStream(sub);
            long len = sub.length();//获取文件长度
            byte[] data = new byte[(int)len];
            fis.read(data);
            String line = new String(data, StandardCharsets.UTF_8);
            System.out.println(line);
            fis.close();
        }

    }
}
