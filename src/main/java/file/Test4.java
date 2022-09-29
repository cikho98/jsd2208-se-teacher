package file;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * 程序启动后，要求用户输入一个文件名，如果文件存在则提示
 * 并要求用户更换，直到该文件还不存在为止，然后将这个文件
 * 在当前目录中创建出来。
 * 提示:
 * Scanner
 * 循环(while)
 * 分支
 * File:
 *  createNewFile
 *  exists
 *
 */
public class Test4 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("请输入文件名");
            String fileName = scanner.nextLine();
            File file = new File(fileName);
            if(file.exists()){//若该文件已经存在
                System.out.println("该文件已经存在了!");
            }else{
                file.createNewFile();
                System.out.println("该文件已创建!");
                break;
            }
        }


    }
}
