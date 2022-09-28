package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * 排序自定义元素的集合
 */
public class SortListDemo2 {
    public static void main(String[] args) {
        List<Point> list = new ArrayList<>();
        list.add(new Point(3,4));
        list.add(new Point(13,45));
        list.add(new Point(5,6));
        list.add(new Point(79,98));
        list.add(new Point(34,2));
        System.out.println(list);
        /*
            注:compare 比较   comparable可比较的

            Collections.sort(List list)
            该方法对集合进行自然排序的前提是,该集合中的元素必须实现了
            接口:Comparable,否则编译不通过.

            当我们直接使用上述方式排序某个集合时,若报错,则不使用该方式.
            不推荐我们定义的类型作为元素时,为了排序必须实现接口Comparable
            因为它对我们的程序造成了侵入性.

            侵入性:当我们使用某个类提供的方法时,该方法反过来要求我们为其
            修改其他额外地方的代码,此为侵入性.
         */
//        Collections.sort(list);
        /*
            Collections提供了一个重载的sort方法,该方法不要求元素必须
            实现Comparable接口,而是在使用sort方法时临时传入一个比较规则
            该比较规则类需要实现接口:Comparator
         */
//        Comparator<Point> c = new Comparator<Point>() {
//            public int compare(Point o1, Point o2) {
//                //比较规则:点到原点的距离长的大
//                int len1 = o1.getX()*o1.getX()+o1.getY()*o1.getY();
//                int len2 = o2.getX()*o2.getX()+o2.getY()*o2.getY();
//                return len1-len2;
//            }
//        };
//        Collections.sort(list,c);


        Collections.sort(list,new Comparator<Point>() {
            public int compare(Point o1, Point o2) {
                int len1 = o1.getX()*o1.getX()+o1.getY()*o1.getY();
                int len2 = o2.getX()*o2.getX()+o2.getY()*o2.getY();
                return len1-len2;
            }
        });


        System.out.println(list);
    }
}
