package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 使用文件输入流从文件中读取字节
 */
public class FISDemo {
    public static void main(String[] args) throws IOException {
       FileInputStream fis = new FileInputStream("fos.dat");
       /*
            InputStream上定义的读取一个字节的方法(文件流实现类该方法)
            int read()
            读取1个字节，并以int型返回。实际返回的int值对应的2进制应当只有
            "低八位"有效。如果返回的int值为整数-1则表达流读取到了末尾。


            fos.dat文件数据:
            00000001 00001101
            ^^^^^^^^
            第一次调用:
            int d = fis.read();
            返回值:
            d=>00000000 00000000 00000000 00000001
               |--------补充24个0--------| |------|
                                          读取的字节
        */
        int d = fis.read();
        System.out.println(d);//1

        /*
            fos.dat文件数据:
            00000001 00001101
                     ^^^^^^^^
            第二次调用:
            d = fis.read();
            返回值:
            d=>00000000 00000000 00000000 00001101
               |--------补充24个0--------| |------|
         */
        d = fis.read();//读取文件中第二个字节
        System.out.println(d);//13

         /*
            fos.dat文件数据:
            00000001 00001101 文件末尾
                              ^^^^^^^^
            第三次调用:
            d = fis.read();
            返回值:
            d=>11111111 11111111 11111111 11111111
               int型的-1的2进制为:32位全是1
         */
        d = fis.read();//读取文件中第三个字节(文件末尾)
        System.out.println(d);//-1

        fis.close();
    }
}
