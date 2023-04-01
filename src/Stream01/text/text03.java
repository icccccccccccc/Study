package Stream01.text;

import Stream01.Stream01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class text03 {
    public static void main(String[] args) {
        ArrayList<String> arr1=new ArrayList<>();
        ArrayList<String> arr2=new ArrayList<>();
        Collections.addAll(arr1,"张三,23","蔡徐坤,24","小黑子,21","荔枝,22","李四,20","王五,19");
        Collections.addAll(arr2,"杨是,24","哈哈哈,23","小黑子,20","杨使我,22","杨洋,20","刘六,30");
        List<Actor> list= Stream.concat(arr1.stream().filter(s->s.split(",")[0].length()==3).limit(2),
                arr2.stream().filter(s->s.startsWith("杨")).skip(1))
                .map(new Function<String, Actor>() {
                    @Override
                    public Actor apply(String s) {
                        return new Actor(s.split(",")[0],Integer.parseInt(s.split(",")[1]));
                    }
                }).collect(Collectors.toList());
        System.out.println(list);
    }
}
