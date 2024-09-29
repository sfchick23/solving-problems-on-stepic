import java.util.Arrays;
import java.util.Scanner;

public class Example35 {
    public static void main(String[] args) {
        // Создание объекта Scanner для чтения ввода с клавиатуры
        Scanner scanner = new Scanner(System.in);

        // Массив для хранения трёх строк
        String[] strings = new String[3];

        for (int i = 0; i < 3; i++) {
            strings[i] = scanner.nextLine();
        }

        // Сортировка строк в алфавитном порядке
        Arrays.sort(strings);


        for (String s : strings) {
            System.out.println(s);
        }
    }
}