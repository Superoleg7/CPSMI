import java.util.Scanner;


public class AnalizTexta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String stroka = sc.nextLine();
        int dl = stroka.length();
        int bykva = 0;
        int slovo = 0;
        System.out.println(stroka);
        if (stroka == "") {
            System.out.println("Пустая строка!");
        } else {
            for (int i = 0; i < (dl - 1); i++) {

                if (AddSlovo(stroka.charAt(i)) == 0) {
                    bykva++;
                    if (i + 1 == (dl - 1)) {
                        slovo++;
                        break;
                    } else if (AddSlovo(stroka.charAt(i + 1)) == 1) {
                        slovo++;
                    }
                } else {
                    if (i + 1 == (dl - 1)) {

                        if (AddSlovo(stroka.charAt(dl - 1)) == 0) {
                            slovo++;
                        }
                    }
                }
            }
            if (AddSlovo(stroka.charAt(dl - 1)) == 0) {
                bykva++;
            }
            System.out.println("Количество букв = " + bykva);
            System.out.println("Количество слов = " + slovo);
        }
    }
}
