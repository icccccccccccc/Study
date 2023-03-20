package API01;

import java.util.Scanner;

public class text01 {
    public static void main(String[] args) {
        //判断质数
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个数字:");
        int a=sc.nextInt();
        if(a==1||a==2){
            System.out.println(true);
        }else if(a<=0){
            System.out.println(false);
        }else {
            for (int i = 2; i < Math.sqrt(a); i++) {
                if(a%i==0){
                    System.out.println(false);
                    break;
                }
                if(i==a-1){
                    System.out.println(true);
                }
            }
        }
    }
}
