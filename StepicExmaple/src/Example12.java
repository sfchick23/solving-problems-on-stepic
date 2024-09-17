import java.util.Scanner;

public class Example12 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int count = 0;
        double sum = 0;
        while (true) {
            int grade = scanner.nextInt();
            if (grade < 0) {
                break;
            }
            sum += grade;
            count++;
        }

        if (count > 0) {
            double average = sum / count;
            System.out.printf("%.1f\n", average);
        } else {
            System.out.println("No data");
        }
    }
}

