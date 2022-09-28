package collection;

import java.util.ArrayList;
import java.util.List;

/**
 * List集合提供了一对重载的add,remove方法,也是通过下标进行相关操作
 */
public class ListDemo2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("five");
        System.out.println(list);
        /*
            void add(int index,E e)
            插入操作,将给定元素插入到指定位置
         */
        //[one,two,three,six,four,five]
        list.add(3,"six");
        System.out.println(list);

        /*
            E remove(int index)
            删除并返回指定位置的元素
         */
        //[one,two,six,four,five]
        String old = list.remove(2);//删除第三个元素
        System.out.println(list);
        System.out.println("被删除的元素是:"+old);
    }
}
