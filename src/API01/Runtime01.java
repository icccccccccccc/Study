package API01;

import java.io.IOException;

public class Runtime01 {
    public static void main(String[] args) throws IOException {
//        Runtime.getRuntime().exit(0);
        System.out.println(Runtime.getRuntime().availableProcessors());
        // 8 线程
        System.out.println(Runtime.getRuntime().maxMemory()/1024/1024);
        // 虚拟机中空余内存 MB
        System.out.println(Runtime.getRuntime().totalMemory()/1024/1024);
        // 虚拟机中已获取内存 MB
        System.out.println(Runtime.getRuntime().freeMemory()/1024/1024);
        // 虚拟机中已用内存 MB
//        Runtime.getRuntime().exec("shutdown -s");
        //关机
//        Runtime.getRuntime().exec("shutdown -s -t 3600");
        //延迟3600s后关机

        //shutdown -a 取消关机  -r 关机并重启
        System.out.println(Runtime.getRuntime());

        //Runtime对象只能有一个 记录的同一个地址值
    }
}
