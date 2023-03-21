package API01;

public class Patten01 {
    public static void main(String[] args) {
        String ph="18075992165";
        System.out.println(ph.matches("1[3-9]\\d{9}"));
        //验证电话号码

        String email="542634460@qq.com.cn";
        System.out.println(email.matches("\\w+@\\w{2,6}(.[a-z]{2,3}){1,2}"));
        //验证邮箱

        String regex1="([01]\\d|[2][0-3]):[0-5]\\d:[0-5]\\d";
        System.out.println("16:16:59".matches(regex1));
        //验证时间

        //(?i) 忽略大小写

        String regex2="[^0]\\d{5}[12][0189]\\d{2}([0][1-9]|(1)[0-2])([0][1-9]|[12]\\d|)";
    }
}
