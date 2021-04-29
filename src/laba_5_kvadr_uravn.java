import java.util.Scanner;

public class laba_5_kvadr_uravn {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число a");
        int a = in.nextInt();
        System.out.println("Введите число b");
        int b = in.nextInt();
        System.out.println("Введите число c");
        int c = in.nextInt();
        int x;
        int M = (b * b) - (4 * a * c);
        if (M < 0) {
            System.out.println("Решение отсутствует");
        } else if (M == 0) {
            x = -b / (2 * a);
            System.out.println("x = " + x);
        } else {
            double x1;
            x1 = (-b + Math.sqrt(M)) /(2 * a);
            double x2;
            x2 = (-b - Math.sqrt(M)) /(2 * a);
            System.out.println("x1 = " + ((int) x1));
            System.out.println("x2 = " + ((int)x2));
        }
    }
}


