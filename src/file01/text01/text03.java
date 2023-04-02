package file01.text01;

import java.io.File;
import java.util.Arrays;

public class text03 {
    public static void main(String[] args) {

        //查找所有路径下的.avi文件

        File f1=new File("E:\\");
        findAVI(f1);
    }

    public static void findAVI(File src){
        File[] file=src.listFiles();
        if(file!=null){
            for (File f : file) {
                if(f.isFile()){
                    String name= f.getName();
                    if(name.endsWith(".avi")){
                        System.out.println(f);
                    }
                }else {
                    findAVI(f);
                }
            }
        }
    }
}
