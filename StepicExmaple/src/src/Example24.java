import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Example24 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US); // Чтобы поддерживать ввод с точкой

        // Ввод размера массива и начального значения генератора случайных чисел
        int size = scanner.nextInt();
        int seed = scanner.nextInt();

        // Создание и заполнение массива случайными числами от 0 до 5 (не включая 5)
        double[] array = new double[size];
        Random random = new Random(seed);

        for (int i = 0; i < size; i++) {
            array[i] = random.nextDouble() * 5; // Генерация числа от 0 до 5 (не включая)
        }

        // Вывод исходного массива с пробелами и округлением до двух знаков после запятой
        for (int i = 0; i < size; i++) {
            System.out.printf("%.2f ", array[i]);
        }
        System.out.println();

        // Вычисление среднего арифметического
        double sum = 0;
        for (double num : array) {
            sum += num;
        }
        double average = sum / size;

        // Вывод среднего арифметического с округлением до двух знаков
        System.out.printf("%.2f\n", average);

        // Замена всех элементов, больших среднего, на само среднее
        for (int i = 0; i < size; i++) {
            if (array[i] > average) {
                array[i] = average;
            }
        }

        // Вывод преобразованного массива с пробелами и округлением до двух знаков
        for (int i = 0; i < size; i++) {
            System.out.printf("%.2f ", array[i]);
        }
        System.out.println();

    }
}
