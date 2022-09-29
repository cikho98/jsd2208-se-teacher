package file;

import java.io.File;

/**
 *  删除一个文件
 */
public class DeleteFileDemo {
    public static void main(String[] args) {
        //将当前项目目录下的test.txt文件删除
        //在相对路径中最开始的"./"可以忽略不写，默认就是从"./"开始
        File file = new File("test.txt");
        if(file.exists()){
            file.delete();//将File表示的文件删除
            System.out.println("该文件已删除!");
        }else{
            System.out.println("该文件不存在!");
        }
    }
}


