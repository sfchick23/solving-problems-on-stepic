import java.util.Random;
import java.util.Scanner;

public class Example29 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        // Ввод количества строк, столбцов и начального значения генератора
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int seed = sc.nextInt();

        // Создание генератора случайных чисел с указанным seed
        Random rand = new Random(seed);

        // Создание и заполнение двумерного массива случайными числами от -5 до 4
        int[][] arr = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = rand.nextInt(10) - 5; // Генерация чисел от -5 до 4
            }
        }

        // Вывод массива в виде таблицы с табуляцией
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }

        // Поиск максимального элемента и подсчет его вхождений
        int maxElement = Integer.MIN_VALUE;
        int maxCount = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (arr[i][j] > maxElement) {
                    maxElement = arr[i][j];
                    maxCount = 1;
                } else if (arr[i][j] == maxElement) {
                    maxCount++;
                }
            }
        }

        // Вывод максимального элемента и количества его вхождений
        System.out.println(maxElement + " " + maxCount);
    }
}
