package exception;

/**
 * 异常常用方法
 */
public class ExceptionApiDemo {
    public static void main(String[] args) {
        System.out.println("程序开始了");
        try {
            String line = "abc";
            System.out.println(Integer.parseInt(line));
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        System.out.println("程序结束了");
    }
}



