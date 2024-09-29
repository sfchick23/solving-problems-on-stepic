import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Example27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int seed = sc.nextInt();
        double[] arr = new double[size];

        Random rand = new Random(seed);
        for (int i = 0; i < size; i++) {
            arr[i] = rand.nextDouble(2);
        }

        double min = Arrays.stream(arr).min().getAsDouble();
        double max = Arrays.stream(arr).max().getAsDouble();
        System.out.println(Arrays.toString(arr));
        System.out.println(max + min);
    }
}
