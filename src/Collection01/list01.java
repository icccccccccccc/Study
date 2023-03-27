package Collection01;

import java.util.ArrayList;
import java.util.List;

public class list01 {
    public static void main(String[] args) {
        //list.add("aaa"); 添加元素
        //list.add(1,"qqq"); 根据索引添加元素 原索引会后移
        //list.remove(1); 根据索引删除元素
        //list.set(1,"qqq"); 根据索引修改元素
        //list.get(1) 根据索引返回集合内的元素
        List<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
/*        System.out.println(list);//[aaa, bbb, ccc]
        list.add(1,"qqq");
        System.out.println(list);//[aaa, qqq, bbb, ccc]
        list.remove(1);
        System.out.println(list);//[aaa, bbb, ccc]

        list.set(1,"qqq");
        System.out.println(list);//[aaa, qqq, ccc]

        System.out.println(list.get(1));//qqq*/

        //五种遍历方式
        //1、迭代器遍历  可以在遍历中删除元素
        //2、list迭代器遍历 可以在遍历中添加元素
        //3、lambde 遍历 正常遍历
        //4、增强for循环遍历 正常遍历
        //5、普通for循环遍历 可以操作索引对集合进行操作
    }
}

