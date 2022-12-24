import java.util.Scanner;
//INCOMPLETTTTTTTTTTTTTTTT
public class Main {
    public static void main(String[] args) {
        int select, select2;
        int chose;

        Scanner m = new Scanner(System.in);

        //afisarea meniului
        System.out.println(
                "1. Grade Celsius\n2. Grade Fahrenheit\nSelectati unitatea de masura din care vreti sa convertiti:");
        select = m.nextInt();
        System.out.println(
                "1. Grade Celsius\n2. Grade Fahrenheit\nSelectati unitatea de masura in care vreti sa convertiti:");
        select2 = m.nextInt();

        //returnarea rezultatului calcului
        menu(select,select2);

        //afisarea intrebarii
        System.out.println("Doriti sa mai convertiti odata? (0. Nu/1. Da)");
        chose = m.nextInt();
        int ch = ch(chose);
    }

    public static double menu(int select, int select2) {
        double result = 0, a;
        int c;
        int cho=1;
        Scanner m = new Scanner(System.in);

        if (select == select2) {
            System.out.println("Nu puteti alege aceasi varianta!");
        }
        do {
            while (select == 1 || select == 2 || select2 == 1 || select2 == 2) {
                if (select == 1 && select2 == 2) {
                    System.out.println("Introduceti valoarea:");
                    a = m.nextDouble();
                    System.out.println(result = calc(a));
                }
                if (select == 2 && select2 == 1) {
                    System.out.println("Introduceti valoarea:");
                    a = m.nextDouble();
                    System.out.println(result = calc2(a));
                }
                c=ch(cho);
                cho=c;
            }
        } while (cho==1);
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

    public static int ch(int cho) {
        Scanner c = new Scanner(System.in);
        int chose = c.nextInt();
        if (chose == 1) {
            cho = 1;
        } else if (chose == 0) {
            cho = 0;
        }
        return cho;
    }
}