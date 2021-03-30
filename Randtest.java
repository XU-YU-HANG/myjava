package xuyuhang;

import java.util.Random;

public class Randtest {
    public static void main(String[] args) {
        Random a=new Random();
        int num=a.nextInt();
        System.out.println(num);
        int num2=a.nextInt(101);
        System.out.println(num2);
    }

}
