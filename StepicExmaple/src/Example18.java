import java.util.Scanner;

public class Example18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int counter = 0;
        for (int i = 1; i < a; i++) {
            if (i % 2 == 0)
                if (a % i == 0) {
                    counter += i;
                }
        }
        System.out.println(counter);
    }
}
