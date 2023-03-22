package API01;

import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;

public class Calendar01 {
    public static void main(String[] args) {
        Calendar c=Calendar.getInstance();
        Date date=new Date();
        c.setTime(date);
//        System.out.println(c);

        //set
        c.set(Calendar.YEAR,2024);
        //底层为0开始存储 修改12！= +12
//        c.set(Calendar.MONTH,11);
        //add 增加
        c.add(Calendar.MONTH,20);

        //get 方法获取年月日等
        int year=c.get(Calendar.YEAR);
        int month=c.get(Calendar.MONTH)+1;
        int day=c.get(Calendar.DAY_OF_MONTH);

        System.out.println(year+" - " +month+" - "+day);
    }
}
