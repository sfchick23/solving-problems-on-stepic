import java.util.Scanner;

public class Example17 {
    public static boolean isComposite(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int start = scanner.nextInt();
        int end = scanner.nextInt();

        if (start > end) {
            int temp = start;
            start = end;
            end = temp;
        }

        for (int i = start; i <= end; i++) {
            if (isComposite(i)) {
                System.out.println(i);
                scanner.close();
                return;
            }
        }

        System.out.println("NO");
        scanner.close();
    }
}
