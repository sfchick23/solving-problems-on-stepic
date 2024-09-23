import java.util.Random;
import java.util.Scanner;

public class Example33 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt(); // количество строк
        int cols = scanner.nextInt(); // количество столбцов
        int seed = scanner.nextInt(); // начальное значение генератора случайных чисел

        int[][] array = ArrayUtils.initArray(rows, cols, seed);
        ArrayUtils.printArray(array);
        ArrayUtils.printMaxIndex(array);
    }
}

class ArrayUtils {

    // 1) Метод для инициализации двумерного массива случайными целыми числами от 0 до 10 (включительно)
    public static int[][] initArray(int rows, int cols, int seed) {
        Random random = new Random(seed);
        int[][] array = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array[i][j] = random.nextInt(11); // случайное число от 0 до 10
            }
        }
        return array;
    }

    // 2) Метод для вывода двумерного массива на консоль
    public static void printArray(int[][] array) {
        for (int[] row : array) {
            for (int element : row) {
                System.out.print(element + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }

    // 3) Метод для вывода индекса первого максимального элемента каждой строки
    public static void printMaxIndex(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(findMax(array[i]));
            if (i < array.length - 1) {
                System.out.print(" "); // Разделение индексов пробелами
            }

        }

    }

    // Метод для поиска индекса первого максимального элемента в одномерном массиве (из предыдущего задания)
    public static int findMax(int[] array) {
        int maxIndex = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[maxIndex]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }
}

