import java.util.Scanner;

//Sa zicem ca e complet...
public class Main {
    public static void main(String[] args) {
        double sel, sel2;
        Scanner m = new Scanner(System.in);

        // afisarea meniului
        System.out.println(
                "1. Grade Celsius\n2. Grade Fahrenheit\nSelectati unitatea de masura din care vreti sa convertiti:");
        sel = m.nextDouble();
        System.out.println(
                "1. Grade Celsius\n2. Grade Fahrenheit\nSelectati unitatea de masura in care vreti sa convertiti:");
        sel2 = m.nextDouble();

        // returnarea rezultatului calcului
        menu(sel, sel2);
    }

    public static double menu(double select, double select2) {
        double result = 0, a;
        int cho = 1;
        Scanner m = new Scanner(System.in);
        Scanner ch = new Scanner(System.in);

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
                System.out.println("Doriti sa mai convertiti odata? (0. Nu/1. Da)");
                cho = ch.nextInt();
                break;
            }
        } while (cho == 1);
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