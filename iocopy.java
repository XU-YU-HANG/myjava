import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class iocopy {
    public static void main(String[] args)throws IOException {
        FileInputStream i1=null;
        FileOutputStream o1 = null;;
        try {
            i1=new FileInputStream("D:\\io.txt");
            o1=new FileOutputStream("D:\\xyh.txt");
            byte[] a=new byte[1024*1024];
            int b;
            while((b=i1.read(a))!=-1){
                o1.write(a);
            }

                o1.flush();

            

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        finally {

            if (o1 != null) {
                try {
                    o1.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (i1 != null) {
                try {
                    i1.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }


    }
}