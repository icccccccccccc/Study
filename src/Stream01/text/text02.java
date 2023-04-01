package Stream01.text;

import Stream01.Stream01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.stream.Collectors;

public class text02 {
    public static void main(String[] args) {
        ArrayList<String> arr=new ArrayList<>();
        Collections.addAll(arr,"zhangsan,23","lisi,24","wangwu,25");
        arr.stream()
                .filter(s->Integer.parseInt(s.split(",")[1])>=24)
                .collect(Collectors.toMap(s->s.split(",")[0],s->Integer.parseInt(s.split(",")[1])))
                .forEach((key,value)-> System.out.println(key+" = "+value));
    }
}
