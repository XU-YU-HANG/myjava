package xuyuhang;

import java.util.Scanner;

import static xuyuhang.Enum.color.red;

public class Enum {
    enum color{
        red,yellow,green;

    }

    public static void main(String[] args) {
        Enum color=new Enum();
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        if(a==1)
            System.out.println(red);

    }
}
