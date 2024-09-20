import java.util.Scanner;

public class Example25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Считываем количество элементов
        int n = scanner.nextInt();
        int[] array = new int[n];

        // Считываем элементы массива
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        // Находим минимальный элемент
        int min = array[0];
        for (int i = 1; i < n; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }

        // Находим последний индекс минимального элемента
        int lastMinIndex = -1;
        for (int i = 0; i < n; i++) {
            if (array[i] == min) {
                lastMinIndex = i;
            }
        }

        // Заменяем последний минимальный элемент на -1
        if (lastMinIndex != -1) {
            array[lastMinIndex] = -1;
        }

        // Выводим преобразованный массив
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
    }

}
