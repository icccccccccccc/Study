package Collection01;

import java.util.ArrayList;
import java.util.Collections;

public class Collections01 {
    public static void main(String[] args) {
        ArrayList<String> arr=new ArrayList<>();
        //多数据添加
        Collections.addAll(arr,"abc","abc","bcd","qwe","1324"); //不去重
        System.out.println(arr);
        System.out.println("-------------------------------------");

        //打乱数组
        Collections.shuffle(arr);
        System.out.println(arr);
        System.out.println("-------------------------------------");

        //排序
        Collections.sort(arr);
        System.out.println(arr);
        System.out.println("-------------------------------------");

        //二分法查找
        System.out.println(Collections.binarySearch(arr, "qwe"));
        System.out.println("-------------------------------------");

        //copy
        ArrayList<String> str=new ArrayList<>();
        Collections.addAll(str,"abc","abc","abc","abc","abc");
        Collections.copy(str,arr);
        System.out.println(str);
        System.out.println("-------------------------------------");

        //填充
        Collections.fill(arr,"abc");
        System.out.println(arr);
        System.out.println("-------------------------------------");

        //max/min 可用内部类重写规则
        System.out.println(Collections.max(str));
        System.out.println(Collections.min(str));
        System.out.println("-------------------------------------");

        //交换1 3索引的值
        Collections.swap(str,1,3);
        System.out.println(str);
    }
}
