package Exception01.text01;

import java.util.Scanner;

public class text01 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        GirlFrirend gf=new GirlFrirend();
        while (true) {
            try {
                System.out.println("请输入您心仪女友的姓名：");
                gf.setName(sc.nextLine());
                System.out.println("请输入您心仪女友的年龄：");
                gf.setAge(Integer.parseInt(sc.nextLine()));
                break;
            } catch (NumberFormatException e) {
                System.out.println("年龄的格式有误");
            }catch (NameFormatException e) {
                e.printStackTrace();
            }catch (AgeOutOfboundsException e) {
                e.printStackTrace();
            }
        }
        System.out.println(gf);
    }
}
