import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ioo {
    public static void main(String[] args) throws Exception {
        FileOutputStream a = null;
        a = new FileOutputStream("D:\\笔记\\123.txt",true);

        String x="我是一个中国人，我骄傲！";
        byte[]b=x.getBytes();
        int c;
        a.write(b);
        a.flush();
        a.close();
    }
}