package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * List集合的排序
 * Collections提供了一个静态方法sort,可以对List集合进行自然排序(从小到大)
 */
public class SortListDemo {
    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<10;i++){
            list.add(random.nextInt(100));
        }
        System.out.println(list);
        Collections.sort(list);//排序
        System.out.println(list);
        Collections.shuffle(list);//乱序
        System.out.println(list);
    }
}
