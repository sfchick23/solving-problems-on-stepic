import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int absNumber = Math.abs(number);

        int digitCount = 0;
        int digitSum = 0;

        do {
            int digit = absNumber % 10;
            digitSum += digit;
            absNumber /= 10;
            digitCount++;
        } while (absNumber > 0);

        System.out.println(digitCount + " " + digitSum);
    }
}
