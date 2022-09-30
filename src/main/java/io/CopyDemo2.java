package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 通过提高每次读写的数据量，减少实际读写的次数可以提高读写效率
 */
public class CopyDemo2 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("openjdk.zip");
        FileOutputStream fos = new FileOutputStream("openjdk_cp2.zip");

        /*
            InputStream字节输入流的超类上，定义了块读取字节的方法
            int read(byte[] data)
            一次性读取给定字节数组data总长度的字节量并存入到该数组中，返回值
            为实际读取到的字节数据量。若返回值为整数-1则表达流读取到了末尾

            原文件内容(6个字节):
            11001100 00110011 11110000 00001111 10101010 01010101

            byte[] data = new byte[4];//4字节长度数组
            int d;

            第一次调用:
            d = fis.read(data);
            由于data数组长度为4，因此可以最多一次读取4字节。
            11001100 00110011 11110000 00001111 10101010 01010101
            ^^^^^^^^ ^^^^^^^^ ^^^^^^^^ ^^^^^^^^
            读取后变化:
            data:[11001100,00110011,11110000,00001111] 2进制形式表达
            d:4 这里返回值d表达的是实际读取到了4个字节

            第二次调用:
            d = fis.read(data);
            由于data数组长度为4，因此可以最多一次读取4字节。
            11001100 00110011 11110000 00001111 10101010 01010101 文件末尾了
                                                ^^^^^^^^ ^^^^^^^^ ^^^^^^^^ ^^^^^^^^
                                                实际仅读取到2个字节
            读取后变化:
            data:[10101010,01010101,11110000,00001111] 2进制形式表达
                  |---------------| |---------------|
                  本次实际读取的字节    上次遗留的旧数据
            d:2 这里返回值d表达的是实际读取到了2个字节


            第三次调用:
            d = fis.read(data);
            由于data数组长度为4，因此可以最多一次读取4字节。
            11001100 00110011 11110000 00001111 10101010 01010101 文件末尾了
                                                                  ^^^^^^^^ ^^^^^^^^ ^^^^^^^^ ^^^^^^^^
                                                                  已经是文件末尾了，没有数据可读取了
            读取后变化:
            data:[10101010,01010101,11110000,00001111] 2进制形式表达
                  |---------------------------------|
                            上次遗留的旧数据
            d:-1 这里返回值d表达的是已经是文件末尾了，读取到头了。



            OutputStream字节输出流的超类上同样定义着块写操作
            void write(byte[] data)
            一次性将给定字节数组中所有字节写出

            void write(byte[] data,int offset,int len)
            一次性将给定的字节数组data从下标offset处开始的连续len个字节写出
         */
        /*
            00000000    1byte
            1024byte    1kb
            1024kb      1mb
            1024mb      1gb
            1024gb      1tb
            1024tb      1pb
         */
        byte[] data = new byte[1024*10];//10kb
        int d;//记录每次实际读取到的数据量

        long start = System.currentTimeMillis();
        while((d=fis.read(data))!=-1){
            fos.write(data,0,d);
        }
        long end = System.currentTimeMillis();
        System.out.println("复制完毕!耗时:"+(end-start)+"ms");
        fis.close();
        fos.close();


    }
}



