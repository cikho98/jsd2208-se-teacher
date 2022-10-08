package exception;

/**
 * finally块
 * finally块是异常处理机制的最后一块,它可以直接跟在try后面或者最后一个
 * catch块后面.
 *
 * finally可以保证只要程序执行到try里面,无论try中的代码是否出现错误,
 * finally块内容都必定执行.
 *
 * 通常我们会将释放资源这类操作放在finally块中.例如IO操作后的close调用.
 */
public class FinallyDemo {
    public static void main(String[] args) {
        System.out.println("程序开始了");
        try {
            String line = "";
            System.out.println(line.length());
            /*
                try语句块中出错代码以下的内容都不会执行,例如:
                如果上面System.out.println(line.length());出现了
                空指针,那么程序会直接跳过下面的return来到catch.
             */
            return;
        } catch (Exception e) {
            System.out.println("出错了");
        } finally {
            System.out.println("finally块执行了");
        }
        System.out.println("程序结束了");
    }
}
