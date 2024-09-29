import java.util.Scanner;

public class Example11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b;
        int counter = 0;
        do {
            b = sc.nextInt();
            if (!(b < 0))
                if (a % b == 0) counter++;

        } while (!(b < 0));
        System.out.println(counter);
    }
}
