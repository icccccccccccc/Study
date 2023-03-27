package Collection01;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;

public class Map02 {
    public static void main(String[] args) {
        Map<Integer,String> map=new HashMap<>();
        map.put(1,"Map");
        map.put(2,"Set");
        map.put(3,"HashSet");
        //第一种遍历方式
        Set<Integer> set = map.keySet();
/*        for (Integer i : set) {
            System.out.println("Key:"+i+" Value:"+map.get(i));
        }*/
/*        Iterator<Integer> it= set.iterator();
        while(it.hasNext()){
            Integer i = it.next();
            System.out.println("Key:"+i+" Value:"+map.get(i));
        }*/
        set.forEach(i->System.out.println("Key:"+i+" Value:"+map.get(i)));

        // 第二种遍历方式
/*        Set<Map.Entry<Integer, String>> entries = map.entrySet();
        for (Map.Entry<Integer, String> entry : entries) {
            System.out.println("Key:"+entry.getKey()+" Value:"+entry.getValue());
        }*/

        //lambda表达式：
/*        map.forEach(new BiConsumer<Integer, String>() {
            @Override
            public void accept(Integer integer, String s) {
                System.out.println(integer+"="+s);
            }
        });*/
        map.forEach((key,value)-> System.out.println(key+"="+value));
    }


}
