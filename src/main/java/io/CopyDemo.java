package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 文件复制
 * 思路:
 * 从原文件中陆续读取每一个字节并写入到复制文件中。
 */
public class CopyDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("image.png");
        FileOutputStream fos = new FileOutputStream("image_cp.png");
        /*
            image.png文件内容
            11110000 00001111 10101010 01010101 11001100 00110011...
            ^^^^^^^^
            int d = fis.read();
            d:00000000 00000000 00000000 11110000

            fos.write(d);                vvvvvvvv
            d:00000000 00000000 00000000 11110000
            image_cp.png文件数据:
            11110000

            第二次:
            11110000 00001111 10101010 01010101 11001100 00110011...
                     ^^^^^^^^
            d = fis.read();
            d:00000000 00000000 00000000 00001111

            fos.write(d);                vvvvvvvv
            d:00000000 00000000 00000000 00001111
            image_cp.png文件数据:
            11110000 00001111

         */
        int d;
        while( (d = fis.read()) != -1 ) {
            fos.write(d);
        }
        System.out.println("复制完毕!");
        fis.close();
        fos.close();
    }
}
