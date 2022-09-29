package file;

import java.io.File;
import java.io.FileFilter;

/**
 * 使用文件过滤器列出一个目录中满足该过滤条件的所有子项
 */
public class ListFilesDemo2 {
    public static void main(String[] args) {
        //获取当前项目目录下名字以"."开始的子项
        File dir = new File(".");
        FileFilter filter = new FileFilter() {
            public boolean accept(File file) {
                String name = file.getName();
                System.out.println("正在过滤的元素是:"+name);
                return name.startsWith(".");
            }
        };
        File[] subs = dir.listFiles(filter);
        System.out.println("当前目录下共:"+subs.length+"个子项");

    }
}


