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
            System.out.println("出错了!");
            /*
                在控制台输出错误堆栈信息(该输出和System.out.println输出
                顺序可能混乱,这是由于多线程原因.)
             */
            e.printStackTrace();
            /*
                获取错误消息,一般用于记录日志或提示给用户使用
             */
            String message = e.getMessage();//获取错误消息
            System.out.println(message);
        }
        System.out.println("程序结束了");
    }
}



