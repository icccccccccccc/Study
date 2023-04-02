package file01.text01;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;

public class text02 {
    public static void main(String[] args) {

        //寻找路径下的.txt结尾的文件

        File f1=new File("Dayevery\\aaa");
        File[] file= f1.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {

                return name.endsWith(".txt");
            }
        });
        if(file.length==0){
            System.out.println("无以.txt结尾的文件");
        }else{
            System.out.println(Arrays.toString(file));
        }
    }
}
