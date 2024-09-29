import java.util.Scanner;

public class Example42{
    public static void main(String[] args) {
        // Вводим строку с клавиатуры
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        // Убираем лишние пробелы в начале и конце строки и разделяем на слова
        String[] words = input.trim().split("\\s+");

        // Строка для хранения результата
        StringBuilder result = new StringBuilder();

        // Проходим по каждому слову
        for (String word : words) {
            // Если слово содержит 'z' или 'Z', заменяем его на "ERROR"
            if (word.toLowerCase().contains("z")) {
                result.append("ERROR").append(" ");
            } else {
                result.append(word).append(" ");
            }
        }

        // Убираем лишний пробел в конце строки
        String output = result.toString().trim();

        // Выводим результат
        System.out.println(output);
    }
}
