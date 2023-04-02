package file01.text01;

import java.io.File;

public class text05 {
    public static void main(String[] args) {
        File f1=new File("C:\\Users\\Admin\\Desktop\\学习笔记\\Javase");
        System.out.println(getLen(f1));

    }
    public static long  getLen(File src){
       File[] file= src.listFiles();
       long len=0;
        for (File f : file) {
            if(f.isFile()){
                len+=f.length();
            }else{
                len+=getLen(f);
            }
        }
        return len;
    }
}
