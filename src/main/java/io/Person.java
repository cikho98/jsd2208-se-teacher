package io;

/**
 * 使用当前类测试对象流的对象序列化与反序列化操作
 */
public class Person {
    private String name;
    private int age;
    private String gender;
    private String[] otherInfo;

    public Person(String name, int age, String gender, String[] otherInfo) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.otherInfo = otherInfo;
    }
}
