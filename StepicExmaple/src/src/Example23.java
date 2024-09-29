import java.util.Random;
import java.util.Scanner;

public class Example23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод размера массива и начального значения генератора случайных чисел
        int size = scanner.nextInt();
        int seed = scanner.nextInt();

        // Создание и заполнение массива случайными числами от -5 до 5
        int[] array = new int[size];
        Random random = new Random(seed);

        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(11) - 5; // Генерация числа в диапазоне от -5 до 5
        }

        // Вывод массива
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        // Поиск суммы положительных и произведения отрицательных чисел
        int sumPositive = 0;
        double productNegative = 1.0;
        boolean hasNegative = false; // Чтобы отследить, есть ли отрицательные числа

        for (int num : array) {
            if (num > 0) {
                sumPositive += num;
            } else if (num < 0) {
                productNegative *= num;
                hasNegative = true;
            }
        }

        // Если отрицательных чисел не было, произведение отрицательных чисел = 1
        if (!hasNegative) {
            productNegative = 0;
        }

        // Вывод суммы и произведения
        System.out.println(sumPositive + " " + productNegative);
    }
}
