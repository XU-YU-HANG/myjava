package xuyuhang;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.stream.Collector;

public class jihe {
    public static void main(String[] args) {
        Collection c=new ArrayList();
        c.add(10);
        c.add(20);
        c.add(30);
        c.add(140);
        c.add(10);
        Iterator it=c.iterator();
        while (it.hasNext()){
            Object a=it.next();
            it.remove();
            System.out.println(a);

        }
        System.out.println(c.size());
    }
}
