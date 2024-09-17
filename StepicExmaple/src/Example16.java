import java.util.Scanner;

public class Example16 {
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод границ диапазона
        int start = scanner.nextInt();
        int end = scanner.nextInt();

        // Поиск и вывод простых чисел в диапазоне
        boolean foundPrime = false;
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
                foundPrime = true;
            }
        }

        // Если простых чисел не найдено, ничего не выводится
        if (!foundPrime) {
            System.out.print(""); // Пустой результат
        }

        scanner.close();
    }
}
