package file01;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.util.Arrays;

public class file03 {
    public static void main(String[] args) {
        File[] f1=File.listRoots();
//        System.out.println(Arrays.toString(f1));
        File f2=new File("C:\\Users\\Admin\\Desktop\\学习笔记\\Javase");
        String[] str= f2.list();//只能打印名字
        System.out.println(Arrays.toString(str));
        f2.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                File f=new File(dir,name);
//                System.out.println(f);
                return true;
            }
        });
        f2.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                System.out.println(pathname);
                return true;
            }
        });
        f2.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return false;
            }
        });
    }
}
