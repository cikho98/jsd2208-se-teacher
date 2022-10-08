package exception;

/**
 * finally相关面试题
 * 请说明:final,finally,finalize是什么?
 * final:参考克晶老师对于它的笔记
 * finally:参考FinallyDemo1的笔记
 * finalize:是定义在Object中的一个方法.该方法是一个对象生命周期中的最后
 * 一个方法.当GC发现一个对象没有引用时要将其回收释放资源,在释放前的最后一
 * 刻会调用该方法,意味着该方法调用完毕后对象即被释放.
 *
 *
 * 第二题下面代码所示
 */
public class FinallyDemo3 {
    public static void main(String[] args) {
        System.out.println(
           test("0")+","+test("")+","+test(null)
        );//3,3,3
    }
    public static int test(String str){
        try {
            return str.charAt(0)-'0';
        } catch (StringIndexOutOfBoundsException e) {
            return 1;
        } catch (NullPointerException e){
            return 2;
        } finally {
            return 3;
        }
    }
}
