package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * 将当前项目目录下的所有obj文件进行反序列化，并将对应的User对象输出
 */
public class Test6 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        File dir = new File(".");
        File[] subs = dir.listFiles(f->f.getName().endsWith(".obj"));
        for(File sub : subs){
            FileInputStream fis = new FileInputStream(sub);
            ObjectInputStream ois = new ObjectInputStream(fis);
            Object obj = ois.readObject();//反序列化
            if(obj instanceof User){//判断obj指向的对象是否为User类型的实例
                User user = (User)obj;
                System.out.println(user);
            }
            ois.close();
        }
    }
}
