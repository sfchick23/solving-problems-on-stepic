import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class Example26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод размера массива и начального значения генератора
        int size = scanner.nextInt();
        int seed = scanner.nextInt();
        int controlElement = scanner.nextInt();
        int[] array = new int[size];

        // Создаем генератор случайных чисел с заданным seed
        Random random = new Random(seed);

        // Заполняем массив случайными значениями от 2 до 15
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(14) + 2; // Генерация от 2 до 15
        }

        // Сортируем массив
        Arrays.sort(array);

        // Выводим отсортированный массив
        System.out.println(Arrays.toString(array));

        // Поиск индекса контрольного элемента
        int controlIndex = -1;
        for (int i = 0; i < size; i++) {
            if (array[i] == controlElement) {
                controlIndex = i;
                break;
            }
        }

        // Если контрольный элемент не найден
        if (controlIndex == -1) {
            System.out.println("ERROR");
        } else {
            // Создаем новый массив с элементами до контрольного элемента
            int[] newArray = Arrays.copyOf(array, controlIndex + 1);
            // Выводим новый массив
            System.out.println(Arrays.toString(newArray));
        }

    }
}
