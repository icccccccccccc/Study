package API01.ObjectApi;

import java.util.Objects;

public class Equals01 {
    public static void main(String[] args) {
        int[] data=new int[]{1,2,3};
        String a=new String("abc");
        String b=new String("abc");
//        String c=new String("abcd");
        StringBuilder sb=new StringBuilder("abc");
        System.out.println(a.equals(b));// ture
        //调用了String里的equals 如果对方是String类型 比较后返回
//        System.out.println(a.equals(c));
        System.out.println(a.equals(sb));//false
        //sb 不是Srting 直接返回false
        System.out.println(sb.equals(a));//false
        // StringBuilder中没有equals方法 调用的Object中的equals方法 比较地址值

        //Objects工具类
        // equals 会先判断对象是否为空 再进行比较
        Student c=new Student("zhangsan",23,data);
        Student d=null;
//        System.out.println(d.equals(c));
        //报错
        System.out.println(Objects.equals(c,d));//false
        System.out.println(Objects.isNull(c));//false
        System.out.println(Objects.isNull(d));//true
    }
}
