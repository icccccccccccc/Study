package file01.text01;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class text06 {
    public static void main(String[] args) {
        //统计以.txt .avi 等结尾的个数

        File f1=new File("C:\\Users\\Admin\\Desktop\\学习笔记\\Javase");
        HashMap<String, Integer> count = getCount(f1);
        System.out.println(count);
    }
    public static HashMap<String,Integer> getCount(File src){
        File[] file=src.listFiles();
        HashMap<String,Integer> hm=new HashMap<>();
        if (file!=null) {
            for (File f : file) {
                if (f.isFile()) {
                    if(hm.containsKey(f.getName().split("\\.")[1])){
                        Integer count=hm.get(f.getName().split("\\.")[1]);
                        count++;
                        hm.put(f.getName().split("\\.")[1],count);
                    }else {
                        hm.put(f.getName().split("\\.")[1],1);
                    }
                }else {
                    HashMap<String, Integer> sonMap = getCount(f);
                    Set<Map.Entry<String, Integer>> entries = sonMap.entrySet();
                    for (Map.Entry<String, Integer> entry : entries) {
                        Integer value = entry.getValue();
                        String key = entry.getKey();
                        if(hm.containsKey(key)){
                            Integer count = hm.get(key);
                            count+=value;
                            hm.put(key,count);
                        }else {
                            hm.put(key,value);
                        }
                    }
                }
            }
        }
        return  hm;
    }
}
