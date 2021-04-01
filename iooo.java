import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class iooo {
    public static void main(String[] args) {
        FileOutputStream a=null;
        try {
            a=new FileOutputStream("D:\\xyh.txt");
            String c="徐雨杭111";
            byte[]b=c.getBytes();
            try {
                a.write(b);
                a.flush();
                a.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }finally {
            if(a!=null){
                try {
                    a.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        }
    }
}