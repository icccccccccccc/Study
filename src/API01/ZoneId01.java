package API01;

import java.time.ZoneId;
import java.util.Set;

public class ZoneId01 {
    public static void main(String[] args) {
        Set<String> ZI1= ZoneId.getAvailableZoneIds();
        System.out.println(ZI1);

        ZoneId ZI2 = ZoneId.systemDefault();
        System.out.println(ZI2);

        ZoneId ZI3 = ZoneId.of("Asia/Shanghai");
        System.out.println(ZI3);
    }
}
