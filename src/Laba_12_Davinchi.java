public class Laba_12_Davinchi {
    public static void main(String[] args) {
        //1 1 2 3 5 8 13 21 34
        System.out.println(1);
        int l=1;
        int r=1;
        System.out.println(1);
        int nextNumber=0;
        while (nextNumber<100) {
            nextNumber = l+r;
            System.out.println(nextNumber);
            l=r;
            r=nextNumber;
        }
        for (int i = 1; i <= 0; ++i) {
            System.out.println(r);
        }



    }
}

