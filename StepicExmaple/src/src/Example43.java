import java.util.*;

public class Example43 {
    public static void main(String[] args) {
        // Вводим строку с клавиатуры
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        // Разделяем строку на слова
        String[] words = input.split(" ");

        // Список для хранения слов в правильном порядке
        List<String> result = new ArrayList<>();

        // Добавляем первое слово в результат
        result.add(words[0]);

        // Множество для хранения оставшихся слов
        Set<String> remainingWords = new HashSet<>(Arrays.asList(words));
        remainingWords.remove(words[0]); // Удаляем первое слово, оно уже добавлено в результат

        // Пока есть оставшиеся слова
        while (!remainingWords.isEmpty()) {
            // Получаем последнее слово из результата
            String lastWord = result.get(result.size() - 1);

            // Получаем последнюю букву этого слова
            char lastChar = lastWord.charAt(lastWord.length() - 1);

            // Ищем следующее слово, которое начинается с этой буквы
            for (String word : remainingWords) {
                if (word.charAt(0) == lastChar) {
                    result.add(word);
                    remainingWords.remove(word);
                    break;
                }
            }
        }

        // Выводим результат
        System.out.println(String.join(" ", result));
    }

}
