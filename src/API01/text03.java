package API01;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class text03 {
    public static void main(String[] args) throws ParseException {
        String str=new String("2001-07-27");
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        Date time = sdf.parse(str);
        Date today=new Date();
        System.out.println((today.getTime()-time.getTime())/1000/60/60/24);
    }
}
