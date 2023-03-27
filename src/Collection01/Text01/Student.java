package Collection01.Text01;

public class Student {
    private String name;
    private int age;
    private int yGrade;
    private int mGrade;
    private int cGrade;

    public Student(String name, int age, int yGrade, int mGrade, int cGrade) {
        this.name = name;
        this.age = age;
        this.yGrade = yGrade;
        this.mGrade = mGrade;
        this.cGrade = cGrade;
    }

    public Student() {
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

    public int getyGrade() {
        return yGrade;
    }

    public void setyGrade(int yGrade) {
        this.yGrade = yGrade;
    }

    public int getmGrade() {
        return mGrade;
    }

    public void setmGrade(int mGrade) {
        this.mGrade = mGrade;
    }

    public int getcGrade() {
        return cGrade;
    }

    public void setcGrade(int cGrade) {
        this.cGrade = cGrade;
    }
    public int allGrade(){
        return this.getcGrade()+this.getmGrade()+this.getmGrade();
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", yGrade=" + yGrade +
                ", mGrade=" + mGrade +
                ", cGrade=" + cGrade +
                ", allGrade=" + this.allGrade() +
                '}';
    }
}
