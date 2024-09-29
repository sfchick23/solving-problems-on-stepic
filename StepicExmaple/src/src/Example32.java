import java.util.Random;
import java.util.Scanner;

public class Example32 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] ar = new int[scan.nextInt()];
        long seed = scan.nextLong();
        init(ar,seed);
        print(ar);
        int ind = findMax(ar);
        System.out.println(ind);
    }


    static void init(int[] ar, long seed) {
        Random rand = new Random(seed);
        for (int i = 0; i < ar.length; i++) {
            ar[i] = rand.nextInt(9) - 3;
        }
    }

    static void print(int[] ar) {
        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i] + " ");
        }
    }

    static int findMax(int[] ar) {
        int max = ar[0];
        for (int i = 1; i < ar.length; i++) {
            if (ar[i] > max) {
                max = ar[i];
            }
        }
        return max;
    }
}
