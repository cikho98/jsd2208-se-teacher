package io;

import java.io.Serializable;
import java.util.Arrays;

/**
 * 使用当前类测试对象流的对象序列化与反序列化操作
 */
public class Person implements Serializable {
    private String name;
    private int age;
    private String gender;
    /*
        当一个属性被关键字transient修饰后，那么对象序列化时就会忽略
        该属性的值。
        忽略不必要的属性可以达到对象瘦身的目的，在对象持久化时可以减少
        磁盘开销。在网络传输时可以提高传输速度。
     */
    private transient String[] otherInfo;

    public Person(String name, int age, String gender, String[] otherInfo) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.otherInfo = otherInfo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String[] getOtherInfo() {
        return otherInfo;
    }

    public void setOtherInfo(String[] otherInfo) {
        this.otherInfo = otherInfo;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", otherInfo=" + Arrays.toString(otherInfo) +
                '}';
    }
}
