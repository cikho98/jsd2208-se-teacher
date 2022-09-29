package file;

import java.io.File;

/**
 * 创建一个目录
 */
public class MkDirDemo {
    public static void main(String[] args) {
        //在当前目录下新建一个目录demo
//        File dir = new File("./demo");
        File dir = new File("./a/b/c/d/e/f");
        if(dir.exists()){
            System.out.println("该目录已存在!");
        }else{
            /*
                make:做
                directory:目录
                mkdir也是linux中创建目录的命令

                mkdir()方法创建目录时要求该目录所在的目录必须存在，否则
                创建失败。

                mkdirs()在创建该目录的同时会将所有不存在的父目录一同创建
                出来，推荐使用该方法
             */
//            dir.mkdir();
            dir.mkdirs();
            System.out.println("该目录已创建!");
        }
    }
}


