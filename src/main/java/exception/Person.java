package exception;

/**
 * throw关键字可以主动对外抛出一个异常,通常下列情况我们会这样做:
 * 1:程序遇到一个异常,但是该异常不应当被当前代码片段处理时可以主动对外抛出
 * 2:程序遇到了一个满足语法但是不满足业务场景时可以主动抛出一个异常
 */
public class Person {
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws IllegalAgeException {
        if(age<0||age>100){
//           throw new RuntimeException("年龄不合法");
            /*
                除了RuntimeException之外的其它异常如果使用throw
                抛出则要在当前方法上使用throws声明该异常的抛出
             */
//            throw new Exception("年龄不合法");
            throw new IllegalAgeException("年龄不合法:"+age);
        }
        this.age = age;
    }
}
