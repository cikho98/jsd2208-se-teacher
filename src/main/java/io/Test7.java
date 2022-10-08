package io;

/**
 * 利用缓冲字符输入流将src/main/java目录下的所有.java文件内容输入到控制台
 * 1:先使用File定位目录./src/main/java
 * 2:利用File的listFiles方法加上文件过滤器获取该目录下的所有.java文件
 * 3:遍历每一个文件,利用文件输入流读取文件,进行流连接为BufferedReader
 * 4:参照BRDemo.java案例,将文件内容按行读取出来并输出到控制台.
 */
public class Test7 {
}
