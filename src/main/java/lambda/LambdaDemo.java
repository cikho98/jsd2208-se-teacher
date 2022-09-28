package lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * JDK8之后推出的一个新特性:lambda表达式
 * 初衷:可以面向函数式编程
 * 直观感受:可以用更简洁的语法创建匿名内部类
 * 语法:
 * (参数列表)->{
 *     方法体
 * }
 * 当实现的接口中只有一个抽象方法时,才可以替换为使用lambda表达式创建
 */
public class LambdaDemo {
    public static void main(String[] args) {
        //匿名内部类写法
        Comparator<String> c = new Comparator<String>() {
            public int compare(String o1, String o2) {
                return o1.length()-o2.length();
            }
        };
        //lambda表达式写法
        Comparator<String> c1 = (String o1, String o2)->{
                return o1.length()-o2.length();
        };
        //参数列表中的参数类型可以不指定
        Comparator<String> c2 = (o1,o2)->{
            return o1.length()-o2.length();
        };
        /*
            如果方法体只有一行代码,那么方法体的"{}"可以忽略不写
            如果该行代码含有return关键字时,那么在忽略{}的同时也要
            一同忽略return关键字
         */
        Comparator<String> c3 = (o1,o2)->o1.length()-o2.length();

        List<String> list = new ArrayList<>();
        list.add("范老师");
        list.add("刘桑");
        list.add("小泽老师");
        System.out.println(list);
//        Collections.sort(list,(o1,o2)->o1.length()-o2.length());

        //JDK8之后List集合自身也提供了sort方法,可以对元素进行排序
        list.sort((o1,o2)->o1.length()-o2.length());
        System.out.println(list);




    }
}
