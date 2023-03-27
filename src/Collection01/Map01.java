package Collection01;

import java.util.HashMap;
import java.util.Map;

public class Map01 {
    public static void main(String[] args) {
        Map<Integer,String> map=new HashMap<>();
        map.put(1,"Map");
        map.put(2,"Set");
        map.put(3,"HashSet");

        map.put(1,"HashMap");// 覆盖

/*        map.remove(1);
        System.out.println(map.containsKey(1));
        System.out.println(map.containsValue("Set"));
        System.out.println(map.containsValue("TreeSet"));*/

//        map.clear();

        System.out.println(map.isEmpty());//是否为空
        System.out.println(map.size());

        System.out.println(map);
    }
}
