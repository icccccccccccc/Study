package Collection01;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMap01 {
    public static void main(String[] args) {
        TreeMap<Student, String> tm = new TreeMap<Student, String>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getAge() - o2.getAge();
            }
        });

    }
}
