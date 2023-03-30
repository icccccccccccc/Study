package Collection01.item01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeSet;

public class ddzGame {
    static ArrayList<Integer> list=new ArrayList<>();
    static HashMap<Integer,String> hm=new HashMap<>();
    static {
        String[] color={"♦","♣","♥","♠"};
        String[] card={"3","4","5","6","7","8","9","10","J","Q","K","A","2"};
        int count=1;
        for (String s : card) {
            for (String c : color) {
                hm.put(count,c+s);
                list.add(count);
                count++;
            }
        }
        hm.put(count,"小王");
        list.add(count);
        count++;
        hm.put(count,"大王");
        list.add(count);
    }

    public ddzGame(){
        Collections.shuffle(list);
        TreeSet<Integer> cord=new TreeSet<>();
        TreeSet<Integer> player1=new TreeSet<>();
        TreeSet<Integer> player2=new TreeSet<>();
        TreeSet<Integer> player3=new TreeSet<>();
        for (int i = 0; i < list.size(); i++) {
            if(i<3){
                cord.add(list.get(i));
            }else if(i%3==0){
                player1.add(list.get(i));
            }else if(i%3==1){
                player2.add(list.get(i));
            }else if(i%3==2){
                player3.add(list.get(i));
            }
        }
        lookCard("zhangsan",player1);
        lookCard("lisi",player2);
        lookCard("wangwu",player3);
    }

    public static void lookCard(String name,TreeSet<Integer> ts){
        System.out.print(name+" : ");
        for (Integer t : ts) {
            System.out.print(hm.get(t)+",");
        }
        System.out.println();
    }
}
