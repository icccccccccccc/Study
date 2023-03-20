package API01.ObjectApi;

public class Clone01 {
    public static void main(String[] args) throws CloneNotSupportedException {
        int[] arr=new int[]{1,2,3,4,5,6,7,8,9};
        Student s=new Student("zhangsan",23,arr);
        Student a= (Student) s.clone();
        System.out.println(s.toString());
        System.out.println(a.toString());
        s.setName("lisi");
        System.out.println(a);
        System.out.println(s);
        //浅克隆
        //重写后的深克隆
        int[] data=s.getData();
        data[0]=20;
        System.out.println(a);
        System.out.println(s);
    }
}
