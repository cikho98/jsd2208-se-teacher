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
//            String line = null;
//            String line = "";
            String line = "abc";
            System.out.println(line.length());
            System.out.println(line.charAt(0));
            System.out.println(Integer.parseInt(line));
//        }catch(NullPointerException e){
//            System.out.println("出现了空指针并处理了");
//        }catch(StringIndexOutOfBoundsException e){
//            System.out.println("出现了字符串下标越界,并处理了");
//        }
        //当多个异常使用同一种解决办法时,可以合并在一个catch处理.
        }catch(NullPointerException|StringIndexOutOfBoundsException e){
            System.out.println("空指针或下标越界的统一处理");
        //子类异常在上,超类异常在下.
        }catch(Exception e){
            System.out.println("反正就是出了个错!");
        }
        System.out.println("程序结束了");
    }
}
