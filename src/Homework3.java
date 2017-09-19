import java.util.Scanner;
public class Homework3 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);


        int size = scanner.nextInt();
        int[] masive = new int[size];
        for (int i = 0; i < size; i++) {
            masive[i] = scanner.nextInt();
        }

        for (int i1 = 0; i1 < masive.length; i1++) {
            System.out.println(masive[i1] + " ");
        }


        int min = masive[0];
        for (int i2 = 1; i2 < masive.length; i2++) {
            if (masive[i2] < min) min = masive[i2];
        }
        System.out.println("Наименьший элемент: " + min);



        int max = masive[0];
        for (int i3 = 1; i3 < masive.length; i3++) {
            if (masive[i3] > max) max = masive[i3];
        }
        System.out.println("Наибольший элемент: " + max);


        int x = 5;
        int count = 0;
        for (int i4 = 0; i4 < masive.length; i4++) {
            if (masive[i4] == x) {
                count++;
            }
        }
        System.out.println("Кол-во повторений = " + count);


        for (int j = 0; j < masive.length; j++) {
            for (int i = 0; i < masive.length - 1; i++) {
                if (masive[i] > masive[i + 1]) {
                    int temp =  masive[i];
                    masive[i] = masive[i + 1];
                    masive[i + 1] = temp;
                }
            }
        }
        for (int i = 0; i < masive.length; i++)
            System.out.println("a2[" + i + "]=" + masive[i]);



        int mincount = Integer.MAX_VALUE;
        int maxcount = Integer.MIN_VALUE;
        for (int j = 0; j < masive.length; j++) {
            int temp = masive[j];


            int qwe = 0;
            for (int i = 0; i < masive.length; i++) {
                if (temp == masive[i]) qwe++;

            }
            if (mincount > qwe) mincount = qwe;
            if (maxcount < qwe) maxcount = qwe;
        }
        System.out.println("максимальное кол-во повторений чисел в массиве " + maxcount + " раз.");
        System.out.println("минимальное кол-во повторений чисел в массиве " + mincount + " раз.");




                 /*
        Scanner input = new Scanner(System.in);
        System.out.println("Размер массив: ");
        int size = input.nextInt();
        int array[] = new int[size];
        System.out.println("Элементы массива:");
        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt();
        }
        System.out.print ("Размер массива:");
        for (int i = 0; i < size; i++) {
            System.out.print (" " + array[i]);}
      */


    }
}

