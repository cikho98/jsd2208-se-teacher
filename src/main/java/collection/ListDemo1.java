package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * List集合
 * List集合的特点是可以存放重复元素且有序
 * 其提供了一组通过下标操作元素的方法
 * java.util.List是一个接口
 * 常用实现类:
 * java.util.ArrayList:内部使用数组实现,查询元素性能更好
 * java.util.LinkedList:内部使用链表实现,增删元素性能更好,首尾增删元素性能最佳
 */
public class ListDemo1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
//        List<String> list = new LinkedList<>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("five");
        System.out.println(list);
        /*
            E get(int index)
            获取指定下标处的元素
         */
        //获取List集合第三个元素
        String e = list.get(2);
        System.out.println(e);

        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }

        /*
            E set(int index,E e)
            将给定元素设置到指定位置,返回值为被替换的元素
         */
        //[one,two,six,four,five]
        String old = list.set(2,"six");
        System.out.println(list);
        System.out.println(old);

        /*
            结合get,set方法,实现集合反转
            提示:
            正数下标是i的话,倒数下标算法:list.size()-1-i
            交换次数:size/2
         */
        /*
            [five,two,six,four,one]
              0   1   2    3    4
                  |________|
              |_________________|
            i取值范围:0,1
            0-----4
            1-----3
            2是中间元素不需要交换
         */
        for(int i=0;i<list.size()/2;i++){
            e = list.get(i);//获取正数位置上的元素
            //将正数位置元素设置到倒数位置上,返回值为被替换的原倒数位置元素
            e = list.set(list.size()-1-i,e);
            list.set(i,e);//将原倒数位置元素设置到正数位置上
        }
        System.out.println(list);//[five,four,six,two,one]
        /*
            java.util.Collections是集合的工具类,提供了多个静态方法
            便于我们操作集合.
            reverse()方法用于反转List集合.
         */
        Collections.reverse(list);
        System.out.println(list);

    }
}
