package Exception01;

import java.util.ArrayList;

public class Exception01 {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5,6};
        try{
            System.out.println(10/0);
            System.out.println(a[10]);
        }catch (ArithmeticException | IndexOutOfBoundsException e){
            System.out.println("数学错误");
            e.printStackTrace();
        }
//        throw new RuntimeException();
        System.out.println("康康我执行了嘛");
    }
}
