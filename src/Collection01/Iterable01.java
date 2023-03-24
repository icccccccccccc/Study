package Collection01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Consumer;

public class Iterable01 {
    public static void main(String[] args) {
        //it.hasNext() 判断当前位置是否为有元素
        //it.next()   返回集合内容并移动指针
        //迭代器进行遍历时 不能用集合的方法进行添加删除等操作
        ArrayList<String> arr=new ArrayList<>();
        arr.add("aaa");
        arr.add("bbb");
        arr.add("ccc");
        arr.add("ddd");
        Iterator<String> it= arr.iterator();
/*        while(it.hasNext()){
            System.out.println(it.next());
            //遍历完后指针不会复位 如果再次调用报错
        }*/
        for (String s : arr) {
//            System.out.println(s);
            //s为三方变量  修改s不会改变集合内的值
            s="qqq";
        }
//        System.out.println(arr);
        //lambda语法
/*        arr.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });*/
        arr.forEach(s-> System.out.println(s));

    }
}
