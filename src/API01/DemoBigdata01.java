package API01;

import java.math.BigDecimal;

public class DemoBigdata01 {
    public static void main(String[] args) {
        BigDecimal bd1=BigDecimal.valueOf(10);
        BigDecimal bd2=BigDecimal.valueOf(2.5);
        BigDecimal bd3=new BigDecimal("2.335");

        System.out.println(bd1.add(bd2));//12.5  加
        System.out.println(bd1.subtract(bd2));//7.5 减
        System.out.println(bd1.multiply(bd2));//25.0 乘

        System.out.println(bd1.divide(bd2));//4 除

        //当除不尽的时候 报错 需要指定divide 后的保留几位小数和保留方式

        //BigDecimal的底层存储是将小数化为一个个的ascll码存储在数组中


    }
}
