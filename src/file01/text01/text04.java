package file01.text01;

import java.io.File;

public class text04 {
    public static void main(String[] args) {

        //删除一个多级文件夹
        File f1=new File("C:\\Users\\Admin\\Desktop\\学习笔记\\Javase\\aaa");
        delectDirs(f1);

    }

    public static void delectDirs(File src){
        File[] file=src.listFiles();
        if(file!=null){
            for (File f : file) {
                if(f.isFile()){
                    f.delete();
                }else {
                    delectDirs(f);
                }
            }
            src.delete();
        }
    }
}
