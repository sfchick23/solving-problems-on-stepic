import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Example28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int seed = sc.nextInt();
        int indexStart = sc.nextInt();
        int indexEnd = sc.nextInt();
        int[] arr = new int[size];
        Random rand = new Random(seed);

        for (int i = 0; i < size; i++) {
            arr[i] = rand.nextInt(10,21);
        }

        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr, indexStart, indexEnd + 1);
        System.out.println(Arrays.toString(arr));

    }
}
