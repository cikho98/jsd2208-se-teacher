package file;

import java.io.File;

/**
 * 获取一个目录中的子项
 */
public class ListFilesDemo {
    public static void main(String[] args) {
        //列出当前项目目录中的所有子项
        File dir = new File(".");
        /*
            boolean isFile()
            判断当前File对象表示的是否为一个文件

            boolean isDirectory()
            判断当前File对象表示的是否为一个目录
         */
        if(dir.isDirectory()){
            /*
                File[] listFiles()
                获取当前File对象表示的目录中的所有子项。返回的数组
                中每个元素表示其中一个子项
             */
            File[] subs = dir.listFiles();
            System.out.println("当前目录下共:"+subs.length+"个子项");
            for(File sub : subs){
                System.out.println(sub.getName());
            }
        }
    }
}
