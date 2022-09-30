package io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/**
 * 写出文本数据
 */
public class WriteStringDemo {
    public static void main(String[] args) throws IOException {
        //向文件fos.txt中写入文本数据
        FileOutputStream fos = new FileOutputStream("fos.txt");
        /*
            字符集:
            字符集想象为一个大表格,在上面定义类每个文字对应的2进制的样子.
            比如:"我"-->10011001...
            常见的字符集:
            GBK:我国的国标编码
                汉字每个字符占2个字节.英文字母每个字符占1个字节.
            UTF-8:
                UNICODE的传输编码,互联网上最常使用的字符集,我们也称其为"万国码"
                该字符集支持所有国家的文字.
                英文占1个字节.
                中文占3个字节.
         */
        String line = "潇洒不是摆烂,这是我自信的状态.";
        byte[] data = line.getBytes(StandardCharsets.UTF_8);
        fos.write(data);

        line = "牛马disco,let me dance,明天不上班~";
        data = line.getBytes(StandardCharsets.UTF_8);
        fos.write(data);

        fos.close();
    }
}
