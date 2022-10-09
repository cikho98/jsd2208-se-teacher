package exception;

/**
 * 自定义异常
 * 通常用来说明那些满足语法但是不满足业务场景的异常问题.
 * 自定义异常通常要做如下几点:
 * 1:类名要做到见名知义
 * 2:继承自Exception(直接或间接)
 * 3:提供超类异常提供的所有构造器
 */
public class IllegalAgeException extends Exception {
    public IllegalAgeException() {
    }

    public IllegalAgeException(String message) {
        super(message);
    }

    public IllegalAgeException(String message, Throwable cause) {
        super(message, cause);
    }

    public IllegalAgeException(Throwable cause) {
        super(cause);
    }

    public IllegalAgeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
