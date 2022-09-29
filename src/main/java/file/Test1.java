package file;

import java.io.File;
import java.io.IOException;

/**
 * 在当前项目目录下创建100个文件,名称为test1.txt--test100.txt
 */
public class Test1 {
    public static void main(String[] args) throws IOException {
        for(int i=1;i<=100;i++){
            String name = "./test"+i+".txt";
            File file = new File(name);
            file.createNewFile();
        }
    }
}
