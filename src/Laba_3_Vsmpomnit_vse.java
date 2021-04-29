public class Laba_3_Vsmpomnit_vse {
    public static void main(String[] args) {
        int i=0;
        int d=0;
        while (i<100)
            d=i++ % 7;
        switch (d) {

            case 1:
                System.out.println("ПН"); break;
            case 2:
                System.out.println("ВТ"); break;
            case 3:
                System.out.println("СР"); break;
            case 4:
                System.out.println("ЧТ"); break;
            case 5:
                System.out.println("ПТ"); break;
            case 6:
                System.out.println("СБ"); break;
            case 7:
                System.out.println("ВС"); break;
        }
        System.out.println("Hello Oleg!" + i++);
    }

}
