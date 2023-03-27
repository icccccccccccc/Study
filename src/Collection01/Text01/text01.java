package Collection01.Text01;

import sun.reflect.generics.tree.Tree;

import java.util.Comparator;
import java.util.TreeSet;

public class text01 {
    public static void main(String[] args) {
        Student s1=new Student("zhangsan",20,80,81,82);
        Student s2=new Student("lisi",21,78,83,84);
        Student s3=new Student("wangwu",22,81,86,72);
        Student s4=new Student("liuliu",19,90,88,62);
        Student s5=new Student("zhangsan",16,80,81,82);
        TreeSet<Student> ts=new TreeSet<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int a=o1.allGrade()-o2.allGrade();
                int b=o1.getyGrade()-o2.getyGrade();
                int c=o1.getmGrade()-o2.getmGrade();
                int d=o1.getcGrade()-o2.getcGrade();
                int e=o1.getName().length()-o2.getName().length();
                int result=0;
                if(a!=0){
                    result=a;
                }else if(b!=0){
                    result=b;
                }else if(c!=0){
                    result=c;
                }else if(d!=0){
                    result=d;
                }else if(e!=0){
                    result=e;
                }

                return -result;
            }
        });
        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        ts.add(s5);
        System.out.println(ts);
    }
}
