package io;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/**
 * 缓冲输出流的写出数据时的缓冲区问题
 */
public class FlushDemo {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("bos.txt");
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        String line = "爱你孤身走暗巷。";
        bos.write(line.getBytes(StandardCharsets.UTF_8));
        /*
            接口:java.io.Flushable定义了抽象方法flush
            java.io.OutputStream实现了该接口，这意味着所有字节输出流都
            实现了该方法。
            但是该方法真正有作用的是在缓冲字节输出流上，用于将缓冲区中已经
            缓存的数据一次性写出，而其他的高级流该方法的实现都是调用其链接
            的流的flush用作传递flush动作，这样最终是会传递给缓冲流的。
         */
        bos.flush();//flush单词:冲水
        System.out.println("写出完毕");
        bos.close();
    }
}


