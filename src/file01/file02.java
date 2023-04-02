package file01;

import java.io.File;
import java.io.IOException;

public class file02 {
    public static void main(String[] args) throws IOException {
        File f1=new File("C:\\Users\\Admin\\Desktop\\学习笔记\\Javase\\a.txt");
//        System.out.println(f1.createNewFile());
//        System.out.println(f1.delete());
        File f2=new File("C:\\Users\\Admin\\Desktop\\学习笔记\\Javase\\b");
//        System.out.println(f2.mkdir());
//        System.out.println(f2.delete());
//        System.out.println(f2.mkdirs());
//        System.out.println(f2.delete());

        File f3=new File("C:\\Users\\Admin\\Desktop\\学习笔记\\Javase");
        File[] file=f3.listFiles();
        for (File file1 : file) {
            System.out.println(file1);
        }
    }
}
