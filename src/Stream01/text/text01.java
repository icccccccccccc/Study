package Stream01.text;

import Stream01.Stream01;

import java.util.ArrayList;
import java.util.Collections;

public class text01 {
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>();
        Collections.addAll(arr,1,2,3,4,5,6,7,8,9,10);
        arr.stream().filter(s->s%2==0).forEach(s-> System.out.println(s));
    }
}
