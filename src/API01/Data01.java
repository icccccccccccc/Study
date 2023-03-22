package API01;

import javafx.scene.chart.PieChart;

import javax.xml.crypto.Data;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class Data01 {
    public static void main(String[] args) {
/*        Date d1=new Date();
        System.out.println(d1);

        Date d2=new Date(1000*60*60*24*365L);
        System.out.println(d2);*/
        Random r=new Random();
        Date d3=new Date(Math.abs(r.nextInt()));
        Date d4=new Date(Math.abs(r.nextInt()));
        long time1 = d3.getTime();
        long time2 = d4.getTime();
        if(time1>time2){
            System.out.println("第一个时间比第二个大");
        }else if(time1<time2){
            System.out.println("第二个时间比第一个大");
        }else {
            System.out.println("一样大");
        }
    }
}
