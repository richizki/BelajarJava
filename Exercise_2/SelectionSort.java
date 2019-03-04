package Exercise_2;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class SelectionSort {
    public static void swapElements(double[] array, int i, int j) {
        double temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static int indexLowest(double[] array, int start) {
        int lowIndex = start;
        for (int i = start; i < array.length; i++) {
            if (array[i] < array[lowIndex]) {
                lowIndex = i;
            }
        }
        return lowIndex;
    }

    public static void selectionSort(double[] array) {
        for (int i = 0; i < array.length; i++) {
            int j = indexLowest(array, i);
            swapElements(array, i, j);
        }

//       munculDataArray(array);
    }

    public static void munculDataArray(double[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }

    public static double[] createNumberRandom(int limit) {
        Random rand = new Random();
        double[] angka = new double[limit];

        for (int i = 0; i <angka.length ; i++) {
            angka[i] = randomFill();
        }

        return angka;
    }

    public static double randomFill() {
        Random rand = new Random();
        double randomNum = rand.nextDouble(); ;
        return randomNum;
    }


    public static void main(String[] args) {
        double[] angka = createNumberRandom(10000);

        System.out.println("angka random sebelum di urutkan");
        munculDataArray(angka);
        System.out.println("Jumlah angka = "+angka.length);
        long start = System.currentTimeMillis();
        selectionSort(angka);

//        for (int i = 0; i < angka.length; i++)
//            for (int j = i + 1; j < angka.length; j++)
//                if (angka[i] == angka[j])
//                {
//                    while (j < angka.length && angka[i] == angka[j])
//                        j++;
//                    System.out.println(angka[i]);
//                    i = j;
//                }
        long end = System.currentTimeMillis();
        long result = (end - start);
        int seconds = (int)((result / 1000) % 60);

        System.out.println("angka random setelah di urutkan");
        munculDataArray(angka);
//        result = TimeUnit.MILLISECONDS.toSeconds(result);
        System.out.println("waktu proses "+seconds+ " Seconds");


    }
}
