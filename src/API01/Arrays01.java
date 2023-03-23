package API01;

import java.util.Arrays;
import java.util.Comparator;

public class Arrays01 {
    public static void main(String[] args) {
        int[] arr=new int[]{1,2,3,4,5,6,7,8,9};
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.binarySearch(arr,5)); //数组内有
        System.out.println(Arrays.binarySearch(arr,10)); //超出
        System.out.println(Arrays.toString(Arrays.copyOf(arr,10)));//超出自动补0
        System.out.println(Arrays.toString(Arrays.copyOfRange(arr,1,8)));
        Arrays.fill(arr,10);
        System.out.println(Arrays.toString(arr));
        Integer[] arr1=new Integer[]{5,8,9,7,6,4,2,3,1};
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));
/*        Arrays.sort(arr1, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });*/
        Arrays.sort(arr1,((o1, o2) -> o2-o1));
        System.out.println(Arrays.toString(arr1));

    }
}
