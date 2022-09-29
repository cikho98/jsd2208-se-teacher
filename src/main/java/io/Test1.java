package io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test1 {
    public static void main(String[] args) throws IOException {
        //向文件中word.txt写入所有小写字母
        FileOutputStream fos = new FileOutputStream("word.txt");
        /*
            a  97
            01100001
         */
        for(int i=0;i<26;i++) {
            fos.write(97+i);
        }
        fos.close();
    }
}
