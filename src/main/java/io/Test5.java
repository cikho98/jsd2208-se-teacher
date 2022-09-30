package io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

/**
 * 设计一个User类，表示用户信息
 * 有4个属性:username,password,nickname,age
 * 其中age是int值，其他为String
 *
 * 程序启动后，要求用户在控制台上陆续输入用户名，密码，昵称，年龄
 * 然后将该用户信息以一个User对象形式序列化到文件中。
 * 文件名格式:用户名.obj
 *
 * 范传奇
 * 123456
 * 传奇
 * 22
 *
 */
public class Test5 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("欢迎注册");
        System.out.println("请输入用户名:");
        String username = scanner.nextLine();
        System.out.println("请输入密码:");
        String password = scanner.nextLine();
        System.out.println("请输入昵称:");
        String nickname = scanner.nextLine();
        System.out.println("请输入年龄:");
        int age = scanner.nextInt();

        User user = new User(username,password,nickname,age);

        FileOutputStream fos
                = new FileOutputStream(username+".obj");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(user);
        System.out.println("注册完毕!");
        oos.close();
    }
}
