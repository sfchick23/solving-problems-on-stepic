import java.util.Random;
import java.util.Scanner;

public class Example30 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ввод количества строк, столбцов и начального значения генератора случайных чисел
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int seed = sc.nextInt();

        // Создаем генератор случайных чисел с указанным seed
        Random rand = new Random(seed);

        // Создание и заполнение двумерного массива случайными числами от -10 до 10 включительно
        int[][] arr = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = rand.nextInt(21) - 10; // Генерация чисел от -10 до 10 включительно
            }
        }

        // Вывод массива в виде таблицы с табуляцией
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println(); // Переход на следующую строку
        }

        // Пустая строка после двумерного массива
        System.out.println();

        // Вычисление суммы положительных элементов для каждого столбца
        for (int j = 0; j < cols; j++) {
            int sum = 0;
            for (int i = 0; i < rows; i++) {
                if (arr[i][j] > 0) {
                    sum += arr[i][j];
                }
            }
            System.out.print(sum + " "); // Вывод суммы для каждого столбца через пробел
        }
    }
}

