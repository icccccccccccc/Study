package API01;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class SimpleDateFormat01 {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf=new SimpleDateFormat();
        Date d =new Date();
        System.out.println(sdf.format(d));
        SimpleDateFormat sdf1=new SimpleDateFormat("yyyy年MM月dd日 hh:mm:ss");
        System.out.println(sdf1.format(d));

        String str="2000-11-11";
        SimpleDateFormat sdf2=new SimpleDateFormat("yyyy-MM-dd");
        Date parse1 = sdf2.parse(str);
        Date date=new Date(parse1.getTime());
        SimpleDateFormat sdf3=new SimpleDateFormat("yyyy年MM月dd日 hh:mm:ss");
        System.out.println(sdf3.format(date));

    }
}
