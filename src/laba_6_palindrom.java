import java.util.Scanner;

public class laba_6_palindrom {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Напишите число");
        int num = in.nextInt();
        if (num / 10000 == num % 10 && (num / 1000) % 10 == (num % 100) / 10 && num > 9999 && num < 100000) {

            System.out.println("Это число палиндром");
        } else if (num < 9999) {

            System.out.println("Введите пятизначное число");
        } else System.out.println("Это не палиндром");

    }
}


