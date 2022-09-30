package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/**
 * 从文件中读取文本数据
 */
public class ReadStringDemo {
    public static void main(String[] args) throws IOException {
        File file = new File("fos.txt");
        //将文件fos.txt中的数据读取出来
        FileInputStream fis = new FileInputStream(file);
        long len = file.length();//获取文件长度(字节数)
        byte[] data = new byte[(int)len];//创建一个与文件等长的数组
        fis.read(data);//块读操作,将文件所有字节读入到数组中
        //使用字符串的构造器,将这组字节按照UTF-8还原为字符串
        String line = new String(data,StandardCharsets.UTF_8);
        System.out.println(line);

        fis.close();
    }
}
