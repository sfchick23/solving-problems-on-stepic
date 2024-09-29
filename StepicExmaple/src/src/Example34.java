import java.util.Random;
import java.util.Scanner;

public class Example34 {

    // Метод для инициализации двумерного массива случайными числами от 0 до 10
    public static int[][] initArray(int rows, int cols, int seed) {
        Random random = new Random(seed);
        int[][] array = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array[i][j] = random.nextInt(11); // Числа от 0 до 10 включительно
            }
        }
        return array;
    }

    // Метод для вывода двумерного массива на консоль в виде таблицы
    public static void printArray(int[][] array) {
        for (int[] row : array) {
            for (int element : row) {
                System.out.print(element + "\t"); // Табуляция между элементами
            }
            System.out.println(); // Переход на новую строку
        }
    }

    // Метод для удаления строки из двумерного массива
    public static int[][] deleteRow(int[][] array, int rowToDelete) {
        int rows = array.length;
        if (rowToDelete < 0 || rowToDelete >= rows) {
            // Неверный индекс - возвращаем исходный массив
            return array;
        }

        int[][] newArray = new int[rows - 1][array[0].length]; // Новый массив на одну строку меньше
        for (int i = 0, j = 0; i < rows; i++) {
            if (i == rowToDelete) continue; // Пропускаем удаляемую строку
            newArray[j++] = array[i]; // Копируем остальные строки
        }
        return newArray;
    }

    // Метод main (менять нельзя)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int seed = sc.nextInt();
        int index = sc.nextInt();

        int[][] array = initArray(rows, cols, seed);
        printArray(array);

        System.out.println();
        int[][] newArray = deleteRow(array, index);
        printArray(newArray);
    }
}
