package Stream01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;

public class Stream03 {
    public static void main(String[] args) {
        ArrayList<String> arr1=new ArrayList<>();
        Collections.addAll(arr1,"张三-20","蔡徐坤-21","小黑子-22","荔枝-1");
//        arr1.stream().collect(Collectors.toList()).forEach(System.out::println);
//        arr1.stream().collect(Collectors.toSet()).forEach(s-> System.out.println(s));
        arr1.stream().collect(Collectors.toMap(
                s->s.split("-")[0],
                s->Integer.parseInt(s.split("-")[1])
        )).entrySet().forEach(s-> System.out.println(s));
    }
}
