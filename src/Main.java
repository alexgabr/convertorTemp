import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int select, select2;
        Scanner m = new Scanner(System.in);

        System.out.println(
                "1. Grade Celsius\n2.Grade Fahrenheit\nSelectati unitatea de masura din care vreti sa convertiti:");
        select = m.nextInt();
        System.out.println(
                "1. Grade Celsius\n2.Grade Fahrenheit\nSelectati unitatea de masura in care vreti sa convertiti:");
        select2 = m.nextInt();
        menu(select,select2);
    }

    public static double menu(int select,int select2) {
        double result = 0;
        Scanner m = new Scanner(System.in);

        if (select == select2) {
            System.out.println("Nu puteti alege aceasi varianta!");
        }
        while (select == 1 || select == 2 || select2 == 1 || select2 == 2) {
            if (select == 1 && select2 == 2) {
                System.out.println("Introduceti valoarea:");
                double a = m.nextDouble();
                System.out.println(result = calc(a));
            }
            if (select == 2 && select2 == 1) {
                System.out.println("Introduceti valoarea:");
                double a = m.nextDouble();
                System.out.println(result = calc2(a));
            }
        }
        return result;
    }

    public static double calc(double a) {
        double res;
        res = a * 1.8 + 32;
        return res;
    }

    public static double calc2(double a) {
        double res;
        res = (a - 32) / 1.8;
        return res;
    }
}
// neterminat
