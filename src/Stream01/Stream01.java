package Stream01;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.stream.Stream;

public class Stream01 {
    public static void main(String[] args) {
        ArrayList<String> arr=new ArrayList<>();
        Collections.addAll(arr,"张三","蔡徐坤","小黑子");
        arr.stream().filter(s->s.startsWith("小")).forEach(s-> System.out.println(s));
        System.out.println("======================================");
        HashMap<String,Integer> hm=new HashMap<>();
        hm.put("张三",20);
        hm.put("蔡徐坤",21);
        hm.put("小黑子",22);
        hm.entrySet().stream().filter(s->s.getKey().startsWith("小")).forEach(s-> System.out.println(s));
        System.out.println("======================================");
        String[] str={"张三","蔡徐坤","小黑子"};
        Arrays.stream(str).filter(s->s.startsWith("小")).forEach(s-> System.out.println(s));
        System.out.println("======================================");
        Stream.of("张三","蔡徐坤","小黑子").filter(s->s.startsWith("小")).forEach(s-> System.out.println(s));
    }
}
