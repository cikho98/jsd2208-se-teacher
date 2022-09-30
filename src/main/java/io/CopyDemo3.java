package io;

import java.io.*;

/**
 * java将流分为节点流与处理流
 * 节点流:也称为低级流，是实际连接程序与另一端的"管道"，负责实际读写数据的流
 * 处理流:也称为高级流，不能独立存在，必须链接在其他流上，目的是数据经过它时
 *       对其加工，简化我们的操作
 *
 * 缓冲流
 * java.io.BufferedInputStream和BufferedOutputStream
 * 缓冲流特点:在流连接中负责提高读写数据的效率
 */
public class CopyDemo3 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("image.png");
        BufferedInputStream bis = new BufferedInputStream(fis);
        FileOutputStream fos = new FileOutputStream("image_cp2.png");
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        int d;
        long start = System.currentTimeMillis();
        while( (d = bis.read()) != -1 ) {
            bos.write(d);
        }
        long end = System.currentTimeMillis();
        System.out.println("复制完毕!耗时:"+(end-start)+"ms");
        bis.close();
        bos.close();
    }
}
