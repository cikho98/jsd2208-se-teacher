package exception;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * JDK7之后java推出了自动关闭特性
 * 可以用更简洁的语法完成如IO操作的异常处理中关闭的问题
 */
public class AutocloseableDemo {
    public static void main(String[] args) {
        try(
//            只有实现了java.io.AutoCloseable接口的类才可以在这里定义
//            编译器会将在这里定义的类最终在finally中调用close关闭
//            编译后的class文件的样子可以参考FinallyDemo2.java的样子
//            注:所有的流都实现了AutoCloseable接口
            FileOutputStream fos = new FileOutputStream("fos.dat");
        ){
            fos.write(1);
        } catch (IOException e) {
            System.out.println("出错了");
        }
    }
}
