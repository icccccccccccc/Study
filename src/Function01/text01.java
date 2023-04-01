package Function01;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class text01 {
    public static void main(String[] args) {
        ArrayList<String> arr=new ArrayList<>();
        Collections.addAll(arr,"张三,23","李四,24","王五,25");
        Student[] stu = arr.stream().map(Student::new).toArray(Student[]::new);
        System.out.println(Arrays.toString(stu));
    }
}
