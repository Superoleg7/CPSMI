import java.util.Random;

public class Laba_15_average_hosp {
           public static void main(String[] args) {
            Random rand = new Random();
            float mas[] = new float[10];
            float count = 10;
            float average = 0;
            float sum = 0;
            for (int i = 1; i < count; i++) {
                mas[i] = rand.nextFloat();
                System.out.print(mas[i]);
                sum += mas[i];
            }
            average = sum/count;
            System.out.println();
            System.out.print("Сумма чисел " + sum + " ,а среднее равно= "+average);
        }

    }

