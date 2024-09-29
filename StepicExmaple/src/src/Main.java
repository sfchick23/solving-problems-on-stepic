import java.util.Scanner;

public class Main {

    // Метод для вычисления суммы цифр числа
    public static int digitSum(int n) {
        n = Math.abs(n);  // Игнорируем знак числа
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        // Перестановка границ, если необходимо
        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }

        // Поиск числа с максимальной суммой цифр
        int maxSumNumber = a;
        int maxSum = digitSum(a);

        for (int i = a + 1; i <= b; i++) {
            int currentSum = digitSum(i);
            if (currentSum > maxSum) {
                maxSum = currentSum;
                maxSumNumber = i;
            }
        }

        // Вывод результата
        System.out.println(maxSumNumber);
    }
}
