package io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * JAVA IO
 * IO:Input和Output 即:输入与输出
 *
 * InputStream和OutputStream类
 * 他们是所有字节输入和输出流的超类，并且他们本身是抽象类。
 * java.io.InputStream上定义了读取字节的相关方法，所有子类都需要实现。
 * java.io.OutputStream上定义了写出字节的相关方法，所有子类都需要实现。
 *
 *
 * 文件流
 * java.io.FileInputStream 文件输入流  链接程序与文件的管道，负责读取数据(读文件)
 * java.io.FileOutputStream 文件输出流 链接程序与文件的管道，负责写出数据(写文件)
 * 文件流继承自InputStream和OutputStream
 */
public class FOSDemo {
    public static void main(String[] args) throws IOException {
        //向文件中写出1个字节(8位2进制)
        /*
            文件输出流常见的两个构造器:
            FileOutputStream(String path)
            FileOutputStream(File file)
         */
//        File file = new File("fos.dat");
//        FileOutputStream fos = new FileOutputStream(file);

        FileOutputStream fos = new FileOutputStream("fos.dat");
        /*
            void write(int d)
            写出一个字节，写出的是给定的int值对应的2进制的"低八位"
                                       vvvvvvvv
            00000000 00000000 00000000 00000000

            2进制             10进制
                0               0
                1               1
               10               2
               11               3
              100               4
              101               5
              110               6
              111               7
             1000               8
             1001               9
             1010               10
             1011               11
             1100               12
             1101               13
             1110               14
             1111               15


             1的2进制
                                        vvvvvvvv
             00000000 00000000 00000000 00000001

             文件fos.dat中内容:
             00000001
         */
        fos.write(1);//向文件中写入的了一个字节
        /*
            正数13的2进制:              vvvvvvvv
            00000000 00000000 00000000 00001101
            文件fos.dat中内容:
            00000001 00001101
         */
        fos.write(13);

        fos.close();
    }
}
