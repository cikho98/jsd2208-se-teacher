package collection;

import java.util.ArrayList;
import java.util.List;

/**
 * 获取子集操作
 */
public class ListDemo3 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<10;i++){
            list.add(i);
        }
        System.out.println(list);
        /*
            List subList(int start,int end)
            获取当前List集合中指定范围内的子集.下标含头不含尾.
         */
        //获取[3-7]
        List<Integer> subList = list.subList(3,8);
        System.out.println(subList);

        //遍历集合,将每个元素取出(get方法)后乘以10在设置回去(set方法)
        //[30,40,50,60,70]
        for(int i=0;i<subList.size();i++){
            int num = subList.get(i);//i:0  num:3
            num = num * 10;//num:30
            subList.set(i,num);//[30,4,5,6,7]
        }
        System.out.println(subList);
        //对子集的操作就是对原集合的操作
        System.out.println(list);
        //删除集合中2-8这部分?
        list.subList(2,9).clear();
        System.out.println(list);
    }
}
