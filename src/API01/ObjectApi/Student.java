package API01.ObjectApi;

import java.util.Arrays;
import java.util.Objects;

public class Student implements Cloneable {
    private String name;
    private int age;
    private int[] data;

    public Student(String name, int age, int[] data) {
        this.name = name;
        this.age = age;
        this.data = data;
    }

    public Student() {
    }

    public int[] getData() {
        return data;
    }

    public void setData(int[] data) {
        this.data = data;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", data=" + Arrays.toString(data) +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        int[] arr=new int[this.data.length];
        for (int i = 0; i < this.data.length; i++) {
            arr[i]=data[i];
        }
        Student s= (Student) super.clone();
        s.data=arr;
        return s;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(name, student.name);
    }

}
