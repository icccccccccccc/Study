package Exception01.text01;

public class GirlFrirend {
    private String name;
    private int age;

    public GirlFrirend() {
    }

    public GirlFrirend(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.length()<2||name.length()>10){
            throw new NameFormatException(name+" 输入姓名的长度有误");
        }else {
            this.name = name;
        }

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age<18||age>40){
            throw new AgeOutOfboundsException(age+" 输入的年龄范围有误");
        }else{
            this.age = age;
        }
    }

    @Override
    public String toString() {
        return "GirlFrirend{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
