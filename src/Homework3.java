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
        System.out.println("min element: " + min);



        int max = masive[0];
        for (int i3 = 1; i3 < masive.length; i3++) {
            if (masive[i3] > max) max = masive[i3];
        }
        System.out.println("max element: " + max);


        int x = 5;
        int count = 0;
        for (int i4 = 0; i4 < masive.length; i4++) {
            if (masive[i4] == x) {
                count++;
            }
        }
        System.out.println("number of repetitions = " + count);


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
        System.out.println("max number of repetitions in masive " + maxcount + " раз.");
        System.out.println("min number of repetitions in masive " + mincount + " раз.");

    }
}

