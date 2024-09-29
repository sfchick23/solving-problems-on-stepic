import java.util.Scanner;

public class Example41 {
    public static void main(String[] args) {
        // Вводим строку с клавиатуры
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        // Разделяем строку на слова
        String[] words = input.split(" ");

        // Строка для хранения результата
        StringBuilder result = new StringBuilder();

        // Проходим по всем словам
        for (String word : words) {
            // Преобразуем первую букву в заглавную и добавляем остальную часть слова
            if (!word.isEmpty()) {
                result.append(Character.toUpperCase(word.charAt(0)))
                        .append(word.substring(1))
                        .append(" ");
            }
        }

        // Убираем лишний пробел в конце строки
        String output = result.toString().trim();

        // Выводим результат
        System.out.println(output);
    }
}
