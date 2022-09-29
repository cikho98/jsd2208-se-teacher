package file;

import java.io.File;

/**
 * 将当前项目目录下的test1.txt---test100.txt删除
 */
public class Test2 {
    public static void main(String[] args) {
        for(int i=1;i<=100;i++){
            String name = "./test"+i+".txt";
            File file = new File(name);
            file.delete();
        }
    }
}
