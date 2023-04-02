package file01.text01;

import java.io.File;
import java.io.IOException;

public class text01 {
    public static void main(String[] args) throws IOException {

        //在当前路径下创建一个a.txt文件夹

        File f1=new File("Dayevery\\aaa");
        System.out.println(f1.mkdir());
        File f2=new File(f1,"a.txt");
        System.out.println(f2.createNewFile());
    }
}
