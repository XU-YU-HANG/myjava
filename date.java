import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class date {
    public static void main(String[] args)  {
        Date a=new Date();
        SimpleDateFormat b=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        //System.out.println(a);
        String c=b.format(a);
        System.out.println(c);
        String time="2008-08-08 08:08:08 888 ";
        try {
            Date x=b.parse(time);
            System.out.println(x);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
