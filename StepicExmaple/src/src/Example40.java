import java.util.Scanner;

public class Example40 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String input = sc.nextLine();
        // Убираем лишние пробелы по краям строки и разделяем строку на слова
        String[] words = input.trim().split("\\s+");

        // Переменная для хранения самого длинного слова
        String maxWord = "";

        // Проходим по всем словам и ищем самое длинное
        for (String word : words) {
            if (word.length() > maxWord.length()) {
                maxWord = word;
            }
        }

        // Выводим результат
        System.out.println(maxWord);
    }
}
