//import java.util.Random;
//import java.util.Scanner;
//
//public class Example34 {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt(); // количество элементов массива
//        int seed = scanner.nextInt(); // начальное значение генератора случайных чисел
//
//        int[] array = init(n, seed);
//        print(array);
//
//        int[] reducedArray  = reduceAfterMax(array);
//        print(reducedArray);
//    }
//}
//
////class ArrayUtils {
//
//    // 1) Метод для заполнения массива случайными числами от -3 до 5 (включительно)
//    public static int[] init(int n, int seed) {
//        Random random = new Random(seed);
//        int[] array = new int[n];
//        for (int i = 0; i < n; i++) {
//            array[i] = random.nextInt(9) - 3; // генерируем числа от -3 до 5
//        }
//        return array;
//    }
//
//    // 2) Метод для вывода массива на консоль
//    public static void print(int[] array) {
//        for (int i = 0; i < array.length; i++) {
//            System.out.print(array[i] + " "); // выводим каждый элемент с пробелом после
//        }
//        System.out.println(); // перевод строки после последнего элемента
//    }
//
//    // 3) Метод для поиска индекса первого максимального элемента
//    public static int findMax(int[] array) {
//        int maxIndex = 0;
//        for (int i = 1; i < array.length; i++) {
//            if (array[i] > array[maxIndex]) {
//                maxIndex = i;
//            }
//        }
//        return maxIndex;
//    }
//
//    // 4) Метод для создания нового массива, удаляя все элементы после первого максимума
//    public static int[] reduceAfterMax(int[] array) {
//        int maxIndex = findMax(array);
//        int[] reducedArray = new int[maxIndex + 1]; // новый массив до индекса первого максимума включительно
//        System.arraycopy(array, 0, reducedArray, 0, maxIndex + 1);
//        return reducedArray;
//    }
//}
//
