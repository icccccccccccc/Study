package API01;

import java.util.Scanner;

public class text02 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个数：");
        int a=sc.nextInt();
        int count=0;
        int num=a;
        int result=0;
        while(num>0){
            num=num/10;
            count++;
        }
        for (int i = 0; i < count; i++) {
            num=a%10;
            a=a/10;
            result+=Math.pow(num,count);
        }
        System.out.println(result);
    }
}
