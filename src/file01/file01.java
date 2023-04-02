package file01;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class file01 {
    public static void main(String[] args) {
        File f1=new File("C:\\Users\\Admin\\Desktop\\学习笔记\\Javase\\Stream.txt");//绝对路径

        System.out.println(f1.isDirectory());//判断是否为文件夹
        System.out.println(f1.isFile());//判断是否为文件
        System.out.println(f1.exists());//判断路径是否存在
        System.out.println("=====================================");

        File f2=new File("a.txt");//相对路径
        System.out.println(f1.getAbsolutePath());
        System.out.println(f2.getAbsolutePath());
        System.out.println(f1.getPath());//定义的路径
        System.out.println("=====================================");

        File f3=new File("C:\\Users\\Admin\\Desktop");
        System.out.println(f1.length());
        System.out.println(f3.length());
        System.out.println(f1.getName());
        System.out.println(f3.getName());

        System.out.println(f1.lastModified());
        Date d1=new Date();
        d1.setTime(f1.lastModified());
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy年MM月dd日 HH：mm：ss");
        System.out.println(sdf.format(d1));
    }
}
