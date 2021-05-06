public class dlin_korotk {
    public static void main(String[] args) {
        int[] arr = new int[]{15, 42, -34, 102, 33, 91, -12, 10, -88, 14};
        int min = arr[0];
        int max = arr[0];

        //определение максимального числа
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println("Максимальное число: " + max);
        // определение минимального числа
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println("Минимальное число: " + min);
    }
}
