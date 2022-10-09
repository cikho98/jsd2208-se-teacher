package exception;

/**
 * 异常的抛出
 */
public class ThrowDemo {
    public static void main(String[] args) {
        Person p = new Person();
            /*
                当我们调用一个含有throws声明异常抛出的方法时,编译器
                要求我们必须写处理办法,否则编译不通过.
                处理办法有两种:
                1:可以在当前方法上继续使用throws将异常抛出
                2:使用try-catch主动捕获并处理该异常
             */
        try {
            p.setAge(10000);//满足语法,但是不满足业务
        } catch (IllegalAgeException e) {
            e.printStackTrace();
        }

        System.out.println("此人年龄"+p.getAge()+"岁");
    }
}
