package Collection01;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Set01 {
    public static void main(String[] args) {

/*        Set<String> s=new HashSet<>();
        s.add("aaa");
        s.add("bbb");
        s.add("ccc");
        s.add("aaa");
        System.out.println(s);*/

        HashSet<Student> hs=new HashSet<Student>();
        Student s1=new Student("zhangsan",23);
        Student s2=new Student("lisi",24);
        Student s3=new Student("wangwu",25);
        Student s4=new Student("wangwu",25);
        hs.add(s1);
        hs.add(s2);
        hs.add(s3);
        hs.add(s4);
        System.out.println(hs);

/*        Iterator<String> it=s.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }*/

/*        for (String s1 : s) {
            System.out.println(s1);
        }*/

//        s.forEach(str-> System.out.println(str));

    }
}
