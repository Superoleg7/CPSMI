import java.util.Scanner;

public class Laba_16_funct_vishego_poryadka {
    public static void main(String[] args) {
        int numberofFact = 0;
        int number = 1;
        System.out.println("Write number");
        Scanner scanner = new Scanner(System.in);
        try {
            numberofFact = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("This is not number");
            return ;
        }

        for (int i = 1; i <= numberofFact; i++) {
            number = i * number;
            //System.out.println(Number);
        }
        System.out.println("Result=" + number);
    }

}


