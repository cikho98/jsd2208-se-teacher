package exception;
/**
 * java异常处理机制
 * java中所有的异常的顶级超类:Throwable
 * Throwable下面派生了两个子类型:Error,Exception
 * Error是描述系统错误的,是不可能被处理的,一旦出现Error意味着程序会结束.
 * Exception描述的是程序异常,是可以被捕获且处理的.
 *
 * 异常处理机制中的:try-catch
 * 语法:
 * try{
 *     可能出现异常的代码片段
 * }catch(XXXException e){
 *     当try中出现XXXException后的解决代码
 * }
 *
 * 注:try语句块不能单独是有,后面要么跟catch语句块,要么跟finally语句块
 */
public class TryCatchDemo {
    public static void main(String[] args) {
        System.out.println("程序开始了");
        try {
            String line = null;
            System.out.println(line.length());
        }catch(NullPointerException e){
            System.out.println("出现了空指针并处理了");
        }
        System.out.println("程序结束了");
    }
}
