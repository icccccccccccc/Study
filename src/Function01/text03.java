package Function01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class text03 {
    public static void main(String[] args) {
        ArrayList<Student> arr=new ArrayList<>();
        Student s1=new Student("张三",23);
        Student s2=new Student("李四",24);
        Student s3=new Student("王五",25);
        Collections.addAll(arr,s1,s2,s3);
        String[] str = arr.stream().map(Student::StudentToString).toArray(String[]::new);
        System.out.println(Arrays.toString(str));
    }
}
