package xuyuhang;

import java.util.Scanner;

public class QianTai {
    public static void main(String[] args) {
        java.util.Scanner s= new java.util.Scanner(System.in);
        FangJian[][] a={  {new FangJian(),new FangJian(),new FangJian()},
        {new FangJian(),new FangJian(),new FangJian()} ,
        {new FangJian(),new FangJian(),new FangJian()} };
        while(true) {
            System.out.println("请输入楼层：");
            int Ceng = s.nextInt();
            System.out.println("请输入房间号");
            int hao = s.nextInt();
            a[Ceng][hao].setKongXian(true);
            break;
        }
        System.out.println("订房成功！");
        while(true){
            System.out.println("请问是否退房？1是  2否");
            int i = s.nextInt();
            if(i==2){
                break;
            }
            System.out.println("请输入楼层：");
            int Ceng = s.nextInt();
            System.out.println("请输入房间号");
            int hao = s.nextInt();
            a[Ceng][hao].setKongXian(false);
            break;


        }

    }
}
