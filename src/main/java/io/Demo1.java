package io;

public class Demo1 {
    public static void main(String[] args) {
        String s1 = "abc123";
        String s2 = "abc123";
        System.out.println(s1==s2);

        String s = "abc";
        String s3 = s + "123";
        System.out.println(s1==s3);

        String s4 = "123" + "abc";
        System.out.println(s1==s4);


        int t = 60*60*24*1000;
    }
}
