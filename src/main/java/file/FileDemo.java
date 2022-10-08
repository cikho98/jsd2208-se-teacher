package file;

import java.io.File;

/**
 * java.io.File
 * File的每一个实例用于表示硬盘上的一个文件或目录(实际上是一个抽象路径)
 * 使用File我们可以:
 * 1:访问文件或目录的属性
 * 2:创建或删除文件和目录
 * 3:访问一个目录中的子项
 *
 * 但是不能用File访问文件内容
 */
public class FileDemo {
    public static void main(String[] args) {
//        File file = new File("C:/Users/TEDU/IdeaProjects/JSD2208_SE/demo.txt");
        //相对路径中的"./"表达当前目录
        //相对于IDEA中执行程序时,"./"表达的就是当前项目目录
        File file = new File("./demo.txt");
        String name = file.getName();//获取文件名
        System.out.println("名字:"+name);

        long length = file.length();//文件的字节数(单位是字节)
        System.out.println("长度:"+length+"字节");
        //判断file表示的文件或目录是否可读或可写
        boolean cr = file.canRead();
        System.out.println("可读:"+cr);
        boolean cw = file.canWrite();
        System.out.println("可写:"+cw);
        //是否被隐藏
        boolean ih = file.isHidden();
        System.out.println("是否隐藏:"+ih);



    }
}
