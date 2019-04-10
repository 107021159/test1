import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        MainFrame fr =new MainFrame();
        fr.setVisible(true);


        ArrayList<Stone>stoneArrayList =new ArrayList<Stone>();
        Ashe ashe =new Ashe();
        Jhin jhin =new Jhin();
        ashe.showInfo();
        System.out.println("===============================================");
        System.out.println();
        jhin.showInfo();
        System.out.println("===============================================");
        System.out.println();
        System.out.println("\n jhin attacked from ashe");
        jhin.hurt(ashe.QAttack());
        ashe.showInfo();
        System.out.println();
        jhin.showInfo();
        System.out.println("\n jhin attacked from ashe");
        jhin.hurt(ashe.QAttack());
        ashe.showInfo();
        System.out.println();
        jhin.showInfo();
        System.out.println("===============================================");
        System.out.println();
        for (int i=0;i<3;i++){
            stoneArrayList.add(new Stone());
            stoneArrayList.get(i).showInfo();
        }
        System.out.println("-----------------------------------------------");
        stoneArrayList.get(0).hurt(ashe.RAttack());
        for (int i=0;i<3;i++){
            stoneArrayList.get(i).showInfo();
        }
    }
}
