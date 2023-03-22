import java.util.*;
public class Homework05 {
    /**
     * Есть тест. Нужно извлечь из него все слова и отсортировать по длине.
     * Мороз и солнце день чудесный Еще ты дремлешь друг прелестный Пора красавица проснись
     * и
     * ты
     * Еще
     * день друг Пора
     * ..
     */
    static void collectStats(String text) {
        String[] words = text.split(" ");
        Map<Integer, List<String>> map = new HashMap<>();

        for (String word : words) {
            int length = word.length();
            if (!map.containsKey(length)) {
                map.put(length, new ArrayList<>());
            }
            map.get(length).add(word);
        }

        List<Integer> lengths = new ArrayList<>(map.keySet());
        Collections.sort(lengths);

        for (int length : lengths) {
            List<String> list = map.get(length);
            for (String word : list) {
                System.out.print(word + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        collectStats("Мороз и солнце день чудесный Еще ты дремлешь друг прелестный Пора красавица проснись");
    }
}
