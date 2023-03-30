package Stream01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Function;
import java.util.stream.Stream;

public class stream02 {
    public static void main(String[] args) {
        //stream流的主要方法
        ArrayList<String> arr=new ArrayList<>();
        Collections.addAll(arr,"张三","蔡徐坤","小黑子","小黑子");
        arr.stream().limit(2).forEach(s-> System.out.println(s));//limit(index) 获取流中前几位数据
        System.out.println("=======================================");
        arr.stream().skip(2).forEach(s-> System.out.println(s));//skip(index) 获取流中除了前几位的数据
        System.out.println("=======================================");
        arr.stream().distinct().forEach(s-> System.out.println(s));
        //distinct() 去重 底层依赖hashcode和eqauls 如果添加的是对象 需要重写方法
        System.out.println("=======================================");
        ArrayList<String> arr1=new ArrayList<>();
        Collections.addAll(arr1,"荔枝");
        Stream.concat(arr.stream(),arr1.stream()).forEach(System.out::println);//将俩个流合并
        System.out.println("=======================================");
        ArrayList<String> arr2=new ArrayList<>();
        Collections.addAll(arr2,"张三-20","蔡徐坤-21","小黑子-22");
        arr2.stream().map(s->Integer.parseInt(s.split("-")[1])).forEach(s-> System.out.println(s));
        //map(new function) 转换数据类型
    }
}
