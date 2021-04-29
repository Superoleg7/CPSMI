import java.util.Scanner;

public class Laba_4_Vsmpomnit_vse {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Type the number of the day");
        int num=in.nextInt();
        switch (num) {
            case (1):
                System.out.println("Monday has number" + " " + num);
            case (2):
                System.out.println("Tuesday has number" + " " + num);
                break;
            case (3):
                System.out.println("Wednesday has number" + " " + num);
                break;
            case (4):
                System.out.println("Thursday has number" + " " + num);
                break;
            case (5):
                System.out.println("Friday has number" + " " + num);
                break;
            case (6):
                System.out.println("Suturday has number" + " " + num);
                break;
            case (7):
                System.out.println("Sunday has number" + " " + num);
                break;
            default:
                System.out.println("ERROR!");
        }
    }
}