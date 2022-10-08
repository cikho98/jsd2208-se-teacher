package io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;

/**
 * 字符流
 * java将流按照读写单位划分为字节流与字符流
 * java.io.InputStream和OutputStream是所有字节流的超类
 * java.io.Reader和Writer是所有字符流的超类
 *
 * 字符流都是高级流,最小读写数据单位为字符.
 * Reader中定义了所有字符流读取字符的方法,Writer则定义了所有写出字符的方法
 *
 * 转换流
 * java.io.InputStreamReader和OutputStreamWriter
 *
 */
public class OSWDemo {
    public static void main(String[] args) throws IOException {
        //向文件osw.txt中写入文本数据
        FileOutputStream fos = new FileOutputStream("osw.txt");
        /*
            使用转换流时,建议明确字符集,这样通过这个流写的文本数据都会按照
            指定的字符集写出.不要用系统默认字符集,否则可能存在跨平台问题.
         */
        OutputStreamWriter osw = new OutputStreamWriter(fos,StandardCharsets.UTF_8);
        //字符流提供了直接将字符串写出的write(String str)方法
        osw.write("我真的栓Q!");
        osw.write("我真的会谢!");
        System.out.println("写出完毕!");
        osw.close();
    }
}
