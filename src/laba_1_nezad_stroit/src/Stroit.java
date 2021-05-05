import java.util.Scanner;

public class Stroit {
    public static void main(String[] args) {

    int a, b, x, y, z;
    a = b = x = y = z = 0;
    boolean f = true;
    do {
        try {
            Scanner sc = new Scanner(System.in);
            // Ввод размеров отверстия
            System.out.println("Write the size of the hole.");
            System.out.print("Height: ");
            a = sc.nextInt();
            System.out.print("Length: ");
            b = sc.nextInt();

            // Ввод размеров кирпича
            System.out.println("Введите размеры кирпича.");
            System.out.print("Height: ");
            x = sc.nextInt();
            System.out.print("Width: ");
            y = sc.nextInt();
            System.out.print("Length: ");
            z = sc.nextInt();

            f = false;
        } catch (Exception e) {
            System.out.println("Its not number! Write number");
        }
    } while (f);

    if ((a >= x && b >= z) || (a >= z && b >= a) || (a >= x && b >= y) || (a >= y && b >= x) || (a >= z && b >= y) || (a >= y && b >= z)) {
        System.out.println("Yeap!!");
    } else {
        System.out.println("Noooooo");
    }
}
}

