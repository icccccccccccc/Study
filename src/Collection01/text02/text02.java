package Collection01.text02;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class text02 {
    public static void main(String[] args) {
        String[] str=new String[]{"A","B","C","D"};
        ArrayList<String> arr=new ArrayList<>();
        Random r=new Random();
        for (int i = 0; i < 80; i++) {
            arr.add(str[r.nextInt(str.length)]);
        }
        Map<String,Integer> map=new HashMap<>();
        for (String s : arr) {
            if(map.containsKey(s)){
                int count=map.get(s);
                count++;
                map.put(s,count);
            }else {
                map.put(s,1);
            }
        }
        System.out.println(map);

        int max=0;
        String place="";
        for (String s : map.keySet()) {
            if(map.get(s)>max){
                max=map.get(s);
                place=s;
            }
        }
        System.out.println(max);
        System.out.println(place);
    }
}
