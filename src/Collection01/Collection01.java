package Collection01;

import java.util.ArrayList;
import java.util.Arrays;

public class Collection01 {
    public static void main(String[] args) {
/*        ArrayList<String> arr=new ArrayList();
        arr.add("aaa");
        arr.add("bbb");
        arr.add("ccc");
        System.out.println(arr);
        arr.clear();
        System.out.println(arr);
        arr.remove("aaa");
        System.out.println(arr);
        System.out.println(arr.size());*/

        ArrayList<Student> arr1=new ArrayList<Student>();
        Student s1=new Student("zhangsan",20,"男");
        Student s2=new Student("lisi",21,"女");
        Student s3=new Student("wangwu",22,"男");
        arr1.add(s1);
        arr1.add(s2);
        arr1.add(s3);
        Student s4=new Student("zhangsan",20,"男");
        System.out.println(arr1.toString());
        System.out.println(arr1.contains(s4));//重写前 false   重写后 true
    }
}
