package file;

import java.io.File;
import java.io.IOException;

/**
 * 创建一个新文件
 */
public class CreateNewFileDemo {
    public static void main(String[] args) throws IOException {
        //向当前目录下新建一个文件:test.txt
        File file = new File("./test.txt");
        /*
            boolean exists()
            判断当前File对象表示的文件或目录是否真实存在
         */
        if(file.exists()){
            System.out.println("文件已存在!");
        }else{
            //将File表示的文件创建出来
            file.createNewFile();
            System.out.println("文件已创建!");
        }
    }
}


