import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class io {
    public static void main(String[] args) throws Exception {
    FileInputStream a;
    a=new FileInputStream("D:\\笔记\\123.txt");
    byte[] b=new byte[4];
    int c;
    while ((c=a.read(b))!=-1) {

        String d = new String(b, 0, c);
        System.out.print(d);
    }
    }
}
