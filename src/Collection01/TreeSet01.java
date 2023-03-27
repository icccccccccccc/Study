package Collection01;

import java.util.TreeSet;

public class TreeSet01 {
    public static void main(String[] args) {
/*        TreeSet<Integer> ts1=new TreeSet<>();
        ts1.add(5);
        ts1.add(3);
        ts1.add(4);
        ts1.add(2);
        ts1.add(1);
        System.out.println(ts1);//[1, 2, 3, 4, 5]*/

        TreeSet<Student> ts2=new TreeSet<Student>();
        Student s1=new Student("zhangsan",23);
        Student s2=new Student("lisi",24);
        Student s3=new Student("wangwu",25);
        ts2.add(s1);
        ts2.add(s2);
        ts2.add(s3);
        System.out.println(ts2);
    }
}
