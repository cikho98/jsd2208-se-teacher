package file;

import java.io.File;
import java.io.FileFilter;

/**
 * 获取当前项目目录下名字中含有字母"a"的所有子项
 */
public class Test3 {
    public static void main(String[] args) {
        File dir = new File(".");
        FileFilter filter = new FileFilter() {
            public boolean accept(File file) {
                return file.getName().contains("a");
            }
        };
        File[] subs = dir.listFiles(filter);
        for(File sub : subs){
            System.out.println(sub.getName());
        }
    }
}
