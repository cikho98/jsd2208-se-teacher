package io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * 对象流
 * java.io.ObjectOutputStream和ObjectInputStream
 * 对象流是一对高级流，作用是进行对象的序列化与反序列化。
 */
public class OOSDemo {
    public static void main(String[] args) throws IOException {
        //将一个Person对象写入文件person.obj中保存
        String name = "刘桑";
        int age = 55;
        String gender = "男";
        String[] otherInfo = {"技术好","拍片儿好","大家的启蒙老师"};
        Person p = new Person(name,age,gender,otherInfo);

        FileOutputStream fos = new FileOutputStream("person.obj");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        /*
            ObjectOutputStream上提供了序列化对象的方法:
            void writeObject(Object o)
            该方法的作用是将给定的对象按照其结构转换为一组字节并通过其
            链接的流写出。
            该方法可能抛出下面异常
            java.io.NotSerializableException
            原因是写出的对象没有实现接口:java.io.Serializable
         */
        oos.writeObject(p);
        System.out.println("对象写出完毕!");
        oos.close();

    }
}
